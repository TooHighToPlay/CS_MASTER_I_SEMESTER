package com.toohightoplay.vu.mif.ot2.trader;
import java.util.Hashtable;

import com.toohightoplay.vu.mif.ot2.specification.Specification;

/**
 * Product trader
 * 
 * @author TooHighToPlay
 * 
 */
public abstract class ProductTrader<S, T> {

	protected Hashtable<S, T> map;

	private final String initializationFileName;

	public ProductTrader(String initializationFileName) {
		this.initializationFileName = initializationFileName;
		map = new Hashtable<S, T>();
		initSpecificationToProductMap();
	}

	private static <T, V> Hashtable<Specification, T> initSpecificationToProductMap() {

		// XXX: add smth

		return null;
	}
}
