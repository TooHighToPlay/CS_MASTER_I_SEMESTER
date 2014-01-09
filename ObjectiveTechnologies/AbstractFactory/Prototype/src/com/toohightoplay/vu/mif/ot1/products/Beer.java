package com.toohightoplay.vu.mif.ot1.products;

/**
 * @author TooHighToPlay
 */
public interface Beer extends Cloneable {

	public void drink();

	public Beer clone(double promiles);
}
