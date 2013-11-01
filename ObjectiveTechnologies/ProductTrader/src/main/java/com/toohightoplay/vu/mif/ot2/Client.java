package com.toohightoplay.vu.mif.ot2;

import java.lang.reflect.InvocationTargetException;

import com.toohightoplay.vu.mif.ot2.products.WildAnimal;
import com.toohightoplay.vu.mif.ot2.specification.WildAnimalSpecification;
import com.toohightoplay.vu.mif.ot2.trader.Zoologist;

/**
 * @author TooHighToPlay
 * 
 */
public class Client {

	public static void main(String[] args) throws ClassNotFoundException,
			NumberFormatException, InstantiationException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {

		Zoologist zoologist = new Zoologist("productMapper.xml");

		WildAnimalSpecification specification = new WildAnimalSpecification(
				"BigKitty", "Roawrr", 4);
		WildAnimal animal = zoologist
				.tradeSpecificationToProduct(specification);
	}
}
