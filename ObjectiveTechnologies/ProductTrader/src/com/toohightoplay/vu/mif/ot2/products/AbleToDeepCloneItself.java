package com.toohightoplay.vu.mif.ot2.products;
/**
 * Class represents that a class will be deep cloneable.
 * 
 * To support easy usage please make all relevant/important objects above or
 * equal visibility of protected.
 * 
 * @author TooHighToPlay
 * 
 */
public interface AbleToDeepCloneItself<T> {

	/**
	 * You must make sure to call constructor and provide all relevant immutable
	 * types and prototypes(deepClones) of mutable types(must also be
	 * AbleToDeepCloneItself).
	 */
	T deepClone();
}
