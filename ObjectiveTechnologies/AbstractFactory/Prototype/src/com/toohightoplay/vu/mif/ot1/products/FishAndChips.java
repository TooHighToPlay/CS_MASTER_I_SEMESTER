package com.toohightoplay.vu.mif.ot1.products;

/**
 * @author TooHighToPlay
 */
public class FishAndChips implements Meal {

    @Override
    public void eat() {
    	System.out.println("Eating like in London pub.");
    }

    @Override
	public Meal clone() {
    	return new FishAndChips();
    }
}
