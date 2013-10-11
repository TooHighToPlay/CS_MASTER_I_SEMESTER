package com.toohightoplay.vu.mif.ot1.factories;

import com.toohightoplay.vu.mif.ot1.barista.BroBarista;
import com.toohightoplay.vu.mif.ot1.products.Beer;
import com.toohightoplay.vu.mif.ot1.products.Meal;
import com.toohightoplay.vu.mif.ot1.products.Snacks;

/**
 * @author TooHighToPlay
 */
public class ProgrammersBar extends Bar {

	public ProgrammersBar() {
		this.barista = new BroBarista();
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
