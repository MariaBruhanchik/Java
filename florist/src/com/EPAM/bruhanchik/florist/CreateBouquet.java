package com.EPAM.bruhanchik.florist;

import java.util.ArrayList;
import java.util.List;

public class CreateBouquet {
    private List<Object> bouquet = new ArrayList<>();
    private double bouquetPrise;


    public CreateBouquet() {
    }

    public CreateBouquet createBouquet(Flower flower, double numberOfFlowers) {
        bouquet.add(flower);
        bouquetPrise += flower.getPrise() * numberOfFlowers;
        return this;
    }

    public double getBouquetPrise() {
        return bouquetPrise;
    }
}
