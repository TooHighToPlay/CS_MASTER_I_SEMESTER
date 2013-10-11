package com.toohightoplay.vu.mif.ot1.products;

/**
 * @author TooHighToPlay
 */
public class Taco implements Snacks {

	@Override
	public void nibble() {
		System.out.println("Taco is my favorite hero. Can I order one more?");
	}

	@Override
	public Snacks clone() {
		return new Taco();
	}
}
