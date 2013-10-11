package com.toohightoplay.vu.mif.ot1.factories;

import com.toohightoplay.vu.mif.ot1.barista.GentleBarista;
import com.toohightoplay.vu.mif.ot1.products.Beer;
import com.toohightoplay.vu.mif.ot1.products.FishAndChips;
import com.toohightoplay.vu.mif.ot1.products.GuinessBeer;
import com.toohightoplay.vu.mif.ot1.products.Meal;
import com.toohightoplay.vu.mif.ot1.products.Nuts;
import com.toohightoplay.vu.mif.ot1.products.Snacks;

/**
 * @author TooHighToPlay
 */
public class ClassicalBar extends Bar {

	public ClassicalBar() {
		this.barista = new GentleBarista();
	}
	
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
