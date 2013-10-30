package com.toohightoplay.vu.mif.ot2;

import com.toohightoplay.vu.mif.ot2.products.WildAnimal;
import com.toohightoplay.vu.mif.ot2.specification.WildAnimalSpecification;
import com.toohightoplay.vu.mif.ot2.trader.ProductTrader;

/**
 * @author TooHighToPlay
 * 
 */
public class Client {

	public static void main(String[] args) {
		System.out.println("Implementation still missing");

		ProductTrader<WildAnimalSpecification, WildAnimal> trader = new ProductTrader<WildAnimalSpecification, WildAnimal>(
				"mapper.xml") {
		};
	}
}
