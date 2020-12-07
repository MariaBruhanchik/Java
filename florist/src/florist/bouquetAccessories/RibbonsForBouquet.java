package florist.bouquetAccessories;

import florist.BouquetOfFlowers;

public class RibbonsForBouquet extends BouquetOfFlowers {
    private double priceOfRibbon;


    public RibbonsForBouquet(double priceOfRibbon) {
        this.priceOfRibbon = priceOfRibbon;

    }


    public double getPriceOfRibbon() {
        return priceOfRibbon;
    }

    public RibbonsForBouquet addRibbons(RibbonsForBouquet ribbonsForBouquet) {
        ribbonsForBouquet.addRibbons(ribbonsForBouquet);
        priceOfRibbon += ribbonsForBouquet.getPriceOfRibbon();
        return this;
    }
}

