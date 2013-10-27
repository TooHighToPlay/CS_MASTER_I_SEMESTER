package com.toohightoplay.vu.mif.ot1.factories;

import java.security.SecureRandom;

import com.toohightoplay.vu.mif.ot1.products.Beer;
import com.toohightoplay.vu.mif.ot1.products.GrinbergenBeer;
import com.toohightoplay.vu.mif.ot1.products.Meal;
import com.toohightoplay.vu.mif.ot1.products.SloppyJoe;
import com.toohightoplay.vu.mif.ot1.products.Snacks;
import com.toohightoplay.vu.mif.ot1.products.Taco;

/**
 * @author TooHighToPlay
 */
public class ProgrammersBar implements Bar {

    @Override
    public Snacks serveSnacks() {

        return new Taco("Mexican");
    }

    @Override
    public Meal serveMeal() {

        return new SloppyJoe(1.8);
    }

    @Override
    public Beer serveBeer() {
    	
        return new GrinbergenBeer(5.8, generateLuckyNumber());
    }
    
    private int generateLuckyNumber() {
    	SecureRandom randomGenerator = new SecureRandom();
    	return randomGenerator.nextInt(GrinbergenBeer.MAX_TO_GENERATE);
    }

}
