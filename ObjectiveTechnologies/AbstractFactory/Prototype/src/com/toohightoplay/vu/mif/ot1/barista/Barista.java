package com.toohightoplay.vu.mif.ot1.barista;

/**
 * 
 * @author TooHighToPlay
 *
 */
public abstract class Barista {

	protected static Beer beer = null;
	
	protected static Meal meal = null;
	
	protected static Snacks snacks = null;
	
	public abstract void serveBeer();
	
	public abstract void serveMeal();
	
	public abstract void serveSnacks();
}
