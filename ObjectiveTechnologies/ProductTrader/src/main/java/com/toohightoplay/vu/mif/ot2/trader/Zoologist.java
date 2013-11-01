package com.toohightoplay.vu.mif.ot2.trader;

import com.toohightoplay.vu.mif.ot2.products.WildAnimal;
import com.toohightoplay.vu.mif.ot2.specification.WildAnimalSpecification;

/**
 * Wild Animal Trader.
 * 
 * Like mirror: Specification object -> product prototype.
 * 
 * @author TooHighToPlay
 * 
 */
public class Zoologist extends
		ProductTrader<WildAnimalSpecification, WildAnimal> {

	public Zoologist(String initializationFileName) {
		super(initializationFileName);
	}

}
