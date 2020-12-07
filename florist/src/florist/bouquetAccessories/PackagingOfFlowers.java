package florist.bouquetAccessories;

import florist.BouquetOfFlowers;

public class PackagingOfFlowers extends BouquetOfFlowers {

    private double priceOfPackaging;

    public PackagingOfFlowers(double priceOfPackaging) {
        this.priceOfPackaging = priceOfPackaging;
    }


    public double getPriceOfPackaging() {
        return priceOfPackaging;
    }

    public PackagingOfFlowers addPackaging(PackagingOfFlowers packagingOfFlowers) {
        packagingOfFlowers.addPackaging(packagingOfFlowers);
        priceOfPackaging += packagingOfFlowers.getPriceOfPackaging();
        return this;
    }

}
