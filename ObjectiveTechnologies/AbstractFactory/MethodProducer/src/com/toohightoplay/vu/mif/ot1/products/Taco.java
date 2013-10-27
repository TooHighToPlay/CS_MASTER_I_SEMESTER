package com.toohightoplay.vu.mif.ot1.products;

/**
 * @author TooHighToPlay
 */
public class Taco implements Snacks {

	private String brand;
	
	public Taco(String brand) {
		this.brand = brand;
	}
	
	@Override
	public void nibble() {
		System.out.println("Taco is my favorite hero. Can I order one more?");
	}
	
	public String getBrand() {
		return this.brand;
	}

}
