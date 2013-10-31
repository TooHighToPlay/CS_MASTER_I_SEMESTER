package com.toohightoplay.vu.mif.ot2.trader;

import com.toohightoplay.vu.mif.ot2.products.DomesticAnimal;
import com.toohightoplay.vu.mif.ot2.specification.DomesticAnimalSpecification;

/**
 * Domestic Animal Trader.
 * 
 * Like mirror: Specification object -> product prototype.
 * 
 * @author TooHighToPlay
 * 
 */
public class Farmer extends
		ProductTrader<DomesticAnimalSpecification, DomesticAnimal> {

	public Farmer(String initializationFileName) {
		super(initializationFileName);
	}

}
