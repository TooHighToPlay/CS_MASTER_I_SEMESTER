package com.toohightoplay.vu.mif.ot1.factories;

import com.toohightoplay.vu.mif.ot1.products.Beer;
import com.toohightoplay.vu.mif.ot1.products.Meal;
import com.toohightoplay.vu.mif.ot1.products.Snacks;

/**
 * 
 * @author TooHighToPlay
 * 
 */
public class PrototypeBar implements Bar {

	private Beer exampleBeer;

	private Meal exampleMeal;

	private Snacks exampleSnacks;

	/**
	 * Bar has one example of each good to produce copies of it. Happy making.
	 * 
	 * @param exampleBeer
	 * @param exampleMeal
	 * @param exampleSnacks
	 */
	public PrototypeBar(Beer exampleBeer, Meal exampleMeal, Snacks exampleSnacks) {
		this.exampleBeer = exampleBeer;
		this.exampleMeal = exampleMeal;
		this.exampleSnacks = exampleSnacks;
	}

	@Override
	public Beer serveBeer(double promiles) {

		return exampleBeer.clone(promiles);
	}

	@Override
	public Snacks serveSnacks() {

		return exampleSnacks.clone();
	}

	@Override
	public Meal serveMeal() {
		return exampleMeal.clone();
	}

}
