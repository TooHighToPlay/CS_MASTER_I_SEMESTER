package com.toohightoplay.vu.mif.ot2.parser;

/**
 * @author TooHighToPlay
 * 
 */
public class SpecToProductType {

	private final String specificationClass;

	private final String specificationCreationString;

	private final String productClass;

	private final String productCreationString;

	public SpecToProductType(String specificationClass,
			String specificationCreationString, String productClass,
			String productCreationString) {
		this.specificationClass = specificationClass;
		this.specificationCreationString = specificationCreationString;
		this.productClass = productClass;
		this.productCreationString = productCreationString;
	}

	/**
	 * @return the specificationClass
	 */
	public String getSpecificationClass() {
		return specificationClass;
	}

	/**
	 * @return the specificationCreationString
	 */
	public String getSpecificationCreationString() {
		return specificationCreationString;
	}

	/**
	 * @return the productClass
	 */
	public String getProductClass() {
		return productClass;
	}

	/**
	 * @return the productCreationString
	 */
	public String getProductCreationString() {
		return productCreationString;
	}

}
