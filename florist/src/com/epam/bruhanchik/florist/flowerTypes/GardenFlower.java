package com.EPAM.bruhanchik.florist.flowerTypes;

import com.EPAM.bruhanchik.florist.flowerParameters.Flower;
import com.EPAM.bruhanchik.florist.flowerParameters.FlowerFreshness;

public class GardenFlower extends Flower {
    private boolean hygrophilous;

    public GardenFlower(String name, String color, double length, double prise, FlowerFreshness freshness, boolean hygrophilous) {
        super(name, color, length, prise, freshness);
        this.hygrophilous = hygrophilous;
    }


}
