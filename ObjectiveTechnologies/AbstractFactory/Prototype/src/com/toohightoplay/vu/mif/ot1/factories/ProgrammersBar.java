package com.toohightoplay.vu.mif.ot1.factories;

import com.toohightoplay.vu.mif.ot1.products.Beer;
import com.toohightoplay.vu.mif.ot1.products.GrinbergenBeer;
import com.toohightoplay.vu.mif.ot1.products.Meal;
import com.toohightoplay.vu.mif.ot1.products.SloppyJoe;
import com.toohightoplay.vu.mif.ot1.products.Snacks;
import com.toohightoplay.vu.mif.ot1.products.Taco;

/**
 * @author TooHighToPlay
 */
public class ProgrammersBar extends Bar {

    @Override
    public Snacks serveSnacks() {

        return barista.serveSnacks();
    }

    @Override
    public Meal serveMeal() {

        return barista.serveMeal();
    }

    @Override
    public Beer serveBeer() {

        return barista.serveBeer();
    }

}
