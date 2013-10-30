package com.toohightoplay.vu.mif.ot2.products.parts;

import com.toohightoplay.vu.mif.ot2.products.AbleToDeepCloneItself;

/**
 * @author TooHighToPlay
 * 
 */
public class SuperPower implements AbleToDeepCloneItself<SuperPower> {

	protected String superPowerName;

	public SuperPower(String superPowerName) {
		this.superPowerName = superPowerName;
	}

	public void setUniqueSense(String superPowerName) {
		this.superPowerName = superPowerName;
	}

	public String getUniqueSense() {
		return superPowerName;
	}

	public SuperPower deepClone() {

		return new SuperPower(superPowerName);
	}

}
