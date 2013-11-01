package com.toohightoplay.vu.mif.ot2;

import java.lang.reflect.InvocationTargetException;

import com.toohightoplay.vu.mif.ot2.products.DomesticAnimal;
import com.toohightoplay.vu.mif.ot2.products.WildAnimal;
import com.toohightoplay.vu.mif.ot2.specification.DomesticAnimalSpecification;
import com.toohightoplay.vu.mif.ot2.specification.WildAnimalSpecification;
import com.toohightoplay.vu.mif.ot2.trader.Farmer;
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

		Zoologist zoologist = new Zoologist(args[0]);

		WildAnimalSpecification specification = new WildAnimalSpecification(
				"BigKitty", "Roawrr", 4);
		WildAnimal animal = zoologist
				.tradeSpecificationToProduct(specification);
		animal.scare();

		Farmer farmer = new Farmer(args[0]);
		DomesticAnimalSpecification domesticSpecification = new DomesticAnimalSpecification(
				"Great pussy", "Love");
		DomesticAnimal pet = farmer
				.tradeSpecificationToProduct(domesticSpecification);
		pet.beCute();

	}
}
