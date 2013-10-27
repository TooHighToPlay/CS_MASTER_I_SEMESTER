package com.toohightoplay.vu.mif.ot1.factories;

import java.security.SecureRandom;

import com.toohightoplay.vu.mif.ot1.products.Beer;
import com.toohightoplay.vu.mif.ot1.products.FishAndChips;
import com.toohightoplay.vu.mif.ot1.products.GrinbergenBeer;
import com.toohightoplay.vu.mif.ot1.products.GuinessBeer;
import com.toohightoplay.vu.mif.ot1.products.Meal;
import com.toohightoplay.vu.mif.ot1.products.Nuts;
import com.toohightoplay.vu.mif.ot1.products.SloppyJoe;
import com.toohightoplay.vu.mif.ot1.products.Snacks;
import com.toohightoplay.vu.mif.ot1.products.Taco;

/**
 * Bar Guru decides what's your bar.
 * 
 * @author TooHighToPlay
 * 
 */
public class BarGuru {

	private BarGuru() {

	}

	/**
	 * Go to Classical Bar is your choice.
	 * 
	 * @return
	 */
	public static Bar gotoClassicalBar() {

		Beer exampleBeer = new GuinessBeer("Taste it. Believe it.");
		Meal exampleMeal = new FishAndChips(20);
		Snacks exampleSnacks = new Nuts("almonds", 50);

		return new PrototypeBar(exampleBeer, exampleMeal, exampleSnacks);
	}

	/**
	 * Go to hacker's bar and fly away.
	 * 
	 * @return
	 */
	public static Bar gotoHackersBar() {

		Beer exampleBeer = new GrinbergenBeer(5.8, generateLuckyNumber());
		Meal exampleMeal = new SloppyJoe(1.8);
		Snacks exampleSnacks = new Taco("Mexican");

		return new PrototypeBar(exampleBeer, exampleMeal, exampleSnacks);
	}

	/**
	 * Generates random lucky number. Muahahaha.
	 * 
	 * @return
	 */
	private static int generateLuckyNumber() {
		SecureRandom randomGenerator = new SecureRandom();
		return randomGenerator.nextInt(GrinbergenBeer.MAX_TO_GENERATE);
	}
}
