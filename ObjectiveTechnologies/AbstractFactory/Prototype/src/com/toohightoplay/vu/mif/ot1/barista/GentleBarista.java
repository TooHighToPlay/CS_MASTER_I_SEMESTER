package com.toohightoplay.vu.mif.ot1.barista;

import com.toohightoplay.vu.mif.ot1.products.Beer;
import com.toohightoplay.vu.mif.ot1.products.FishAndChips;
import com.toohightoplay.vu.mif.ot1.products.GuinessBeer;
import com.toohightoplay.vu.mif.ot1.products.Meal;
import com.toohightoplay.vu.mif.ot1.products.Nuts;
import com.toohightoplay.vu.mif.ot1.products.Snacks;

/**
 * 
 * @author TooHighToPlay
 * 
 */
public class GentleBarista extends Barista {

	@Override
	public Beer serveBeer() {
		if (beer == null) {
			beer = new GuinessBeer();
		}
		return beer.clone();
	}

	@Override
	public Meal serveMeal() {
		if (meal == null) {
			meal = new FishAndChips();
		}

		return meal.clone();
	}

	@Override
	public Snacks serveSnacks() {
		if (snacks == null) {
			snacks = new Nuts();
		}

		Class c = Nuts.class;
		try {
			Snacks snack = (Snacks) c.newInstance();
			System.out.println("Returning instance generated with reflection");
			return snack;
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		System.out.println("Some error occured, returning clone");
		return snacks.clone();
	}

}
