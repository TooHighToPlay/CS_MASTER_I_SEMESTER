package com.toohightoplay.vu.mif.ot1.factories;

import com.toohightoplay.vu.mif.ot1.products.Beer;
import com.toohightoplay.vu.mif.ot1.products.Meal;
import com.toohightoplay.vu.mif.ot1.products.Snacks;

/**
 * @author TooHighToPlay
 */
public abstract class Bar {

    public abstract Beer serveBeer();

    public abstract Snacks serveSnacks();

    public abstract Meal serveMeal();

}