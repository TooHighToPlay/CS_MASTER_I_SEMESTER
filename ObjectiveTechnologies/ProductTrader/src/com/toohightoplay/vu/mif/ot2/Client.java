package com.toohightoplay.vu.mif.ot2;

import java.lang.reflect.Constructor;

import com.toohightoplay.vu.mif.ot2.products.DomesticAnimal;

/**
 * @author TooHighToPlay
 * 
 */
public class Client {

	/*
	 * public static void main(String[] args) throws SecurityException,
	 * ClassNotFoundException, NoSuchMethodException, InstantiationException,
	 * IllegalAccessException, IllegalArgumentException,
	 * InvocationTargetException {
	 * System.out.println("Implementation still missing");
	 * 
	 * ProductTrader<WildAnimalSpecification, WildAnimal> trader = new
	 * ProductTrader<WildAnimalSpecification, WildAnimal>( "mapper.xml") { };
	 * 
	 * Class<?>[] parameterTypes = Class.forName(
	 * "com.toohightoplay.vu.mif.ot2.products.Pussy")
	 * .getConstructors()[0].getParameterTypes();
	 * 
	 * for (Class<?> class1 : parameterTypes) { System.out.println(class1); }
	 * 
	 * Object instanceObject = null; Constructor<?>[] constructors =
	 * Class.forName("Integer") .getConstructors(); for (Constructor<?>
	 * constructor : constructors) { if (constructor.getParameterTypes().length
	 * == 1) { instanceObject = constructor.newInstance(5); break; } }
	 * System.out.println(instanceObject);
	 * 
	 * Method method = Class.forName(
	 * "com.toohightoplay.vu.mif.ot2.products.Pussy").getMethod(
	 * "createFromString");
	 * 
	 * Paranamer paranamer = new CachingParanamer();
	 * 
	 * Constructor constructor = Class.forName(
	 * "com.toohightoplay.vu.mif.ot2.products.Pussy") .getConstructors()[0];
	 * 
	 * String[] parameterNames = paranamer.lookupParameterNames(constructor);
	 * 
	 * for (String string : parameterNames) { System.out.println(string); }
	 * 
	 * }
	 */

	public static void main(String[] args) {
		Class newClass = null;
		Object newObject = null;
		Constructor cons = null;

		try {

			// Class[] parameter = new Class[] { int.class, String.class };
			Object[] values = new Object[] { 2, "haha" };

			newClass = Class
					.forName("com.toohightoplay.vu.mif.ot2.products.Pussy");

			Constructor[] parameters = newClass.getConstructors();
			Constructor requiredConstructor = null;
			for (Constructor constructor : parameters) {
				if (constructor.getGenericParameterTypes().length == 2) {
					requiredConstructor = constructor;
				}
			}
			Class[] parameter = (Class[]) requiredConstructor
					.getGenericParameterTypes();

			cons = newClass.getConstructor(parameter);
			newObject = cons.newInstance(values);

			System.out.println("The object is : " + newObject.toString());

			((DomesticAnimal) newObject).beCute();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}
}
