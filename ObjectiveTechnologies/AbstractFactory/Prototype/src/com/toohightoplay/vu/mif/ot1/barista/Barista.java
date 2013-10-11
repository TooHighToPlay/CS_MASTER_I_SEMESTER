package com.toohightoplay.vu.mif.ot1.barista;

import com.toohightoplay.vu.mif.ot1.products.Beer;
import com.toohightoplay.vu.mif.ot1.products.Meal;
import com.toohightoplay.vu.mif.ot1.products.Snacks;

/**
 * 
 * @author TooHighToPlay
 *
 */
public abstract class Barista {

	protected static Beer beer = null;
	
	protected static Meal meal = null;
	
	protected static Snacks snacks = null;
	
	public abstract Beer serveBeer();
	
	public abstract Meal serveMeal();
	
	public abstract Snacks serveSnacks();
}
