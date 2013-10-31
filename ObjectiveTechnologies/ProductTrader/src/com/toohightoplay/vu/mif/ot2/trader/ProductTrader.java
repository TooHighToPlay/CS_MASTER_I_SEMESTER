package com.toohightoplay.vu.mif.ot2.trader;

import java.util.Hashtable;

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
		return map.get(specification);
	}

	/**
	 * Initialise state from user config file.
	 */
	private Hashtable<Specification, Product> initSpecificationToProductMap() {

		// XXX: add smth

		return null;
	}

	private Product create(Specification specification) {

		return null;
	}

}
