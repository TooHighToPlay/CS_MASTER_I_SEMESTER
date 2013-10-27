package com.toohightoplay.vu.mif.ot1.products;

import java.security.SecureRandom;

/**
 * @author TooHighToPlay
 */
public class SloppyJoe implements Meal {

	private double _E621;

	/**
	 * Quantity of specific and special ingredient must be provided.
	 * 
	 * @param _E621
	 */
	public SloppyJoe(double _E621) {
		this._E621 = _E621;
	}

	@Override
	public void eat() {
		System.out.println("Eating some delicious Sloppy Joe.. Mhm..");
	}

	@Override
	public Meal clone() {
		return new SloppyJoe(_E621);
	}

	/**
	 * Reveals quantity of special ingredient.
	 */
	public void revealTheTruth() {
		SecureRandom randomGenerator = new SecureRandom();
		System.out
				.println("Burger contains not so much but not so less E621, the Mighty Taste of All Time. It equals "
						+ (_E621 * randomGenerator.nextInt())
						+ " milligrams of goodness. :)");
	}

}
