package florist;

import java.util.ArrayList;
import java.util.List;

public class BouquetOfFlowers {
    private List<Flower> flowerList = new ArrayList<Flower>();
    private double bouquetPrise;


    public BouquetOfFlowers() {
    }

    public BouquetOfFlowers(List<Flower> flowerList) {
        this.flowerList = flowerList;
    }

    public BouquetOfFlowers addFlower(Flower flower) {
        flowerList.add(flower);
        bouquetPrise += flower.getFlowerPrise() * flower.getNumberOfFlowers();
        return this;
    }

    public double getBouquetPrise() {
        return bouquetPrise;
    }
}
