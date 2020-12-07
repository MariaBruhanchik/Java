package florist.bouquetAccessories;

import florist.BouquetOfFlowers;

public class BowForBouquet extends BouquetOfFlowers {

    private double priceForBow;

    public BowForBouquet(double priceForBow) {

        this.priceForBow = priceForBow;
    }


    public double getPriceForBow() {
        return priceForBow;
    }

    public BowForBouquet addBow(BowForBouquet bowForBouquet) {
        bowForBouquet.addBow(bowForBouquet);
        priceForBow += bowForBouquet.getPriceForBow();
        return this;
    }
}
