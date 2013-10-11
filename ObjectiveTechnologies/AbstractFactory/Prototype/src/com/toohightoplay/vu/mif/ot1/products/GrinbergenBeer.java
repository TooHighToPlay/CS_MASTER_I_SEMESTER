package com.toohightoplay.vu.mif.ot1.products;

/**
 * @author TooHighToPlay
 */
public class GrinbergenBeer implements Beer {

    @Override
    public void drink() {
    	System.out.println("I drank this Grinbergen almost as fast as Rob Ashton.");
    }
    
    public void drinkWithEffects() {
    	System.out.println("I drasgsf thisss Grinbergen with an attitude. Be my paladin, be my guest, you will always be loved. Just bring me moore beer");
    }
    
    @Override
	public Beer clone() {
    	
    	return new GrinbergenBeer();
    }

}
