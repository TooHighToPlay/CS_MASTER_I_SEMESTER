package com.toohightoplay.vu.mif.ot2.trader;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Hashtable;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Product trader
 * 
 * @author TooHighToPlay
 * 
 */
public abstract class ProductTrader<Specification, Product> {

	protected Hashtable<Specification, Product> map;

	private final String initializationFileName;

	/*
	 * public enum SpecificationStructure {
	 * 
	 * 
	 * SPECIFICATION_CLASS(0),
	 * 
	 * SPECIFICATION_KEY_VALUE_MAP(1),
	 * 
	 * PRODUCT_CLASS(2),
	 * 
	 * PRODUCT_KEY_VALUE_MAP(3);
	 * 
	 * }
	 */

	public ProductTrader(String initializationFileName) {
		this.initializationFileName = initializationFileName;
		map = new Hashtable<Specification, Product>();
		initSpecificationToProductMap();
	}

	public Product tradeSpecificationToProduct(Specification specification) {
		return map.get(specification);
	}

	/**
	 * Initialise state from user config file.
	 */
	private Hashtable<Specification, Product> initSpecificationToProductMap() {

		return null;
	}

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws SAXException, IOException,
			ParserConfigurationException, ClassNotFoundException, DOMException,
			NoSuchMethodException, SecurityException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(ClassLoader
				.getSystemResourceAsStream("productMapper.xml"));
		NodeList specificationToProductMap = document.getDocumentElement()
				.getChildNodes();

		for (int i = 0; i < specificationToProductMap.getLength(); i++) {
			Node map = specificationToProductMap.item(i);

			NodeList specifications = map.getChildNodes();
			// ------------------------PARSING XML SPECIFIC DATA

			Class[] specificationParameterTypes = getParameterTypes(specifications
					.item(0).getTextContent().trim());
			Class[] specificationParameterValues = getParameterValues(specifications
					.item(1));

			Constructor specificationConstructor = specificationClass
					.getConstructor(specificationParameterTypes);

			Object[] values = new Object[] { 2, "haha" };
			// parse some values

			for (int j = 0; j < specifications.getLength(); j++) {
				Node specification = specifications.item(j);
			}

			// ------------------------PARSING XML SPECIFIC DATA

		}

	}

	private static Class<?>[] getParameterTypes(String qualifiedClassName)
			throws ClassNotFoundException {

		Class<?> specificationClass = Class.forName(qualifiedClassName);

		Constructor<?>[] constructors = specificationClass.getConstructors();
		Constructor<?> requiredConstructor = null;
		for (Constructor<?> constructor : constructors) {
			if (constructor.getGenericParameterTypes().length == 2) {
				requiredConstructor = constructor;
			}
		}

		return (Class[]) requiredConstructor.getGenericParameterTypes();
	}

	private static Object[] getParameterValues(NodeList keyValueMap)
			throws ClassNotFoundException, DOMException {

		Object[] values = new Object[keyValueMap.getLength()];

		for (int i = 0; i < keyValueMap.getLength(); i++) {

			Node currentElement = keyValueMap.item(i);
			if (currentElement.hasChildNodes()) {
				// create complex
				// recursion
				Class<?>[] complexTypeSubtypes = getParameterTypes(currentElement
						.getTextContent().trim());
				Object[] complexTypeValues = getParameterValues(currentElement
						.getChildNodes());

				try {
					values[i] = createParameter(currentElement.getAttributes()
							.getNamedItem("complexClass").getNodeValue(),
							complexTypeSubtypes, complexTypeValues);
				} catch (Exception e) {
					System.out.println("Error creating value for Class -> "
							+ currentElement.getNodeValue());
				}
			} else {
				try {
					values[i] = Class.forName(currentElement.getNodeValue())
							.newInstance();
				} catch (Exception e) {
					System.out
							.println("Exception occured while creating value for Class = "
									+ currentElement.getNodeValue());
				}
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
