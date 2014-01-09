package com.toohightoplay.vu.mif.ot1.factories;

import com.toohightoplay.vu.mif.ot1.products.Beer;
import com.toohightoplay.vu.mif.ot1.products.FishAndChips;
import com.toohightoplay.vu.mif.ot1.products.GuinessBeer;
import com.toohightoplay.vu.mif.ot1.products.Meal;
import com.toohightoplay.vu.mif.ot1.products.Nuts;
import com.toohightoplay.vu.mif.ot1.products.Snacks;

/**
 * @author TooHighToPlay
 */
public class ClassicalBar implements Bar {

    @Override
    public Snacks serveSnacks() {

        return new Nuts("almonds" , 50);
    }

    @Override
    public Meal serveMeal() {

        return new FishAndChips(20);
    }

    @Override
    public Beer serveBeer(double promiles) {

        return new GuinessBeer("Taste it. Believe it.");
    }
}
