package com.toohightoplay.vu.mif.ot1.products;

/**
 * @author TooHighToPlay
 */
public class Nuts implements Snacks {

	private String kind;

	private int quantity;

	/**
	 * Provide nut kind and quantity (grams).
	 * 
	 * @param kind
	 * @param quantity
	 */
	public Nuts(String kind, int quantity) {
		this.kind = kind;
		this.quantity = quantity;
	}

	@Override
	public void nibble() {
		System.out.println("Taking some nuts. Nibling..");
	}

	@Override
	public Snacks clone() {
		return new Nuts(kind, quantity);
	}

	public void specificateNuts() {
		System.out.println("Here you are some " + kind
				+ " nuts. Quantity equals " + quantity
				+ " g. Have a great time dealing with them.");
	}
}
