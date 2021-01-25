package com.EPAM.bruhanchik.florist.flowerTypes;

import com.EPAM.bruhanchik.florist.flowerParameters.Flower;
import com.EPAM.bruhanchik.florist.flowerParameters.FlowerFreshness;

public class MeadowFlower extends Flower {
    private boolean frostResistance;


    public MeadowFlower(String name, String color, double length, double prise, FlowerFreshness freshness, boolean frostResistance) {
        super(name, color, length, prise, freshness);
        this.frostResistance = frostResistance;
    }
}
