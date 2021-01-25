package com.EPAM.bruhanchik.florist.flowerTypes;

import com.EPAM.bruhanchik.florist.flowerParameters.Flower;
import com.EPAM.bruhanchik.florist.flowerParameters.FlowerFreshness;

public class HomeFlower extends Flower {
    private boolean FlowerPot;

    public HomeFlower(String name, String color, double length, double prise, FlowerFreshness freshness, boolean flowerPot) {
        super(name, color, length, prise, freshness);
        FlowerPot = flowerPot;
    }

}
