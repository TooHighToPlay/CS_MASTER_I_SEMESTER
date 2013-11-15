package com.toohightoplay.vu.mif.ot2.trader;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Hashtable;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;

import com.toohightoplay.vu.mif.ot2.parser.SpecToProductDomParser;
import com.toohightoplay.vu.mif.ot2.parser.SpecToProductType;
import com.toohightoplay.vu.mif.ot2.products.AbleToDeepCloneItself;

/**
 * Product trader
 * 
 * @author TooHighToPlay
 * 
 */
public abstract class ProductTrader<Specification, Product> {

	protected Hashtable<Specification, Product> map;

	private final String initializationFileName;

	public ProductTrader(String initializationFileName) {
		this.initializationFileName = initializationFileName;
		map = new Hashtable<Specification, Product>();
		initSpecificationToProductMap();
	}

	public Product tradeSpecificationToProduct(Specification specification) {
		@SuppressWarnings("unchecked")
		AbleToDeepCloneItself<Product> ableToDeepCloneItself = (AbleToDeepCloneItself<Product>) map
				.get(specification);
		return ableToDeepCloneItself.deepClone();
	}

	/**
	 * Initialise state from user config file.
	 */
	private void initSpecificationToProductMap() {

		List<SpecToProductType> specList;
		try {
			specList = SpecToProductDomParser
					.parseXmlFile(initializationFileName);
		} catch (SAXException | IOException | ParserConfigurationException e) {
			System.out.println("Error initializing specList");
			return;
		}

		for (SpecToProductType specToProductType : specList) {

			// ---------------------SPECIFICATION START
			String specificationClass = specToProductType
					.getSpecificationClass();

			// TYPES
			Class<?>[] specificationparameterTypes;
			try {
				specificationparameterTypes = getParameterTypes(
						specificationClass,
						specToProductType.getSpecificationCreationString()
								.split(";").length);
			} catch (ClassNotFoundException e) {
				System.out
						.println("Smth bad happened while getting specification parameterTypes");
				return;
			}
			// VALUES
			Object[] specificationTypeValues;
			try {
				specificationTypeValues = getParameterValues(
						specToProductType.getSpecificationCreationString(),
						specificationparameterTypes, ";");
			} catch (Exception e) {
				System.out.println("UUUps, values of specification failed");
				return;
			}
			// CREATION
			Specification spec;
			try {
				spec = (Specification) createParameter(specificationClass,
						specificationparameterTypes, specificationTypeValues);
			} catch (ClassNotFoundException | InstantiationException
					| IllegalAccessException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException
					| SecurityException e) {
				System.out.println("Final creation failed of specification");
				return;
			}
			// ---------------------SPECIFICATION END

			// ---------------------PRODUCT START
			String productClass = specToProductType.getProductClass();

			// TYPES
			Class<?>[] productParameterTypes;
			try {
				productParameterTypes = getParameterTypes(
						productClass,
						specToProductType.getProductCreationString().split(";").length);
			} catch (ClassNotFoundException e) {
				System.out
						.println("Smth bad happened while getting product parameterTypes");
				return;
			}
			// VALUES
			Object[] productTypeValues;
			try {
				productTypeValues = getParameterValues(
						specToProductType.getProductCreationString(),
						productParameterTypes, ";");
			} catch (Exception e) {
				System.out.println("UUUps, values of specification failed");
				return;
			}
			// CREATION
			Product product;
			try {
				product = (Product) createParameter(productClass,
						productParameterTypes, productTypeValues);
			} catch (ClassNotFoundException | InstantiationException
					| IllegalAccessException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException
					| SecurityException e) {
				System.out.println("Final creation failed of specification");
				return;
			}
			// ---------------------PRODUCT END
			map.put(spec, product);

		}
	}

	private static Class<?>[] getParameterTypes(String qualifiedClassName,
			int length) throws ClassNotFoundException {

		Class<?> specificationClass = Class.forName(qualifiedClassName);

		Constructor<?>[] constructors = specificationClass.getConstructors();
		Constructor<?> requiredConstructor = null;
		for (Constructor<?> constructor : constructors) {
			if (constructor.getGenericParameterTypes().length == length) {
				requiredConstructor = constructor;
			}
		}

		return (Class[]) requiredConstructor.getGenericParameterTypes();
	}

	private static Object[] getParameterValues(String creationString,
			Class<?>[] parameterTypes, String separator)
			throws ClassNotFoundException, DOMException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException,
			NoSuchMethodException, SecurityException {

		String[] keyValuePairs = creationString.split(separator);
		Object[] values = new Object[parameterTypes.length];

		for (int i = 0; i < keyValuePairs.length; i++) {
			if (keyValuePairs[i].contains(".")) {
				String[] complexValues = keyValuePairs[i].split("=");
				String complexClassName = complexValues[0];
				String parametersCreationString = keyValuePairs[i]
						.substring(complexClassName.length() + 1);

				Class<?>[] complexTypes;
				complexTypes = getParameterTypes(complexClassName,
						parametersCreationString.split(",").length);
				Object[] complexTypeValues;
				complexTypeValues = getParameterValues(
						parametersCreationString, complexTypes, ",");
				values[i] = Class.forName(complexClassName)
						.getConstructor(complexTypes)
						.newInstance(complexTypeValues);

			} else if (parameterTypes[i].equals(int.class)
					|| parameterTypes[i].equals(Integer.class)) {
				values[i] = Integer.class
						.getConstructor(Integer.TYPE)
						.newInstance(
								Integer.parseInt(keyValuePairs[i].split("=")[1]));
			} else if (parameterTypes[i].equals(String.class)) {
				values[i] = String.class.getConstructor(String.class)
						.newInstance(keyValuePairs[i].split("=")[1]);
			}
		}

		return values;
	}

	private static Object createParameter(String fullClassName,
			Class<?>[] parameterTypes, Object[] complexTypeValues)
			throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {

		Class<?> specificationClass = Class.forName(fullClassName);

		return specificationClass.getConstructor(parameterTypes).newInstance(
				complexTypeValues);
	}
}
