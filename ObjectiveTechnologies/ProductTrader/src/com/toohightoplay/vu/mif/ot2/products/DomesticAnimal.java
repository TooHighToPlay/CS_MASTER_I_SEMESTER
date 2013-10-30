package com.toohightoplay.vu.mif.ot2.products;
/**
 * @author TooHighToPlay
 * 
 */
public abstract class DomesticAnimal implements
		AbleToDeepCloneItself<DomesticAnimal>,
		CreatableFromString<DomesticAnimal> {

	protected int legsCount;

	public abstract void beCute();

}
