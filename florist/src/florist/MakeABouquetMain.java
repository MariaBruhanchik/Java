package florist;


import florist.bouquetAccessories.BowForBouquet;
import florist.bouquetAccessories.PackagingOfFlowers;
import florist.exceptions.EmptyFlowerNameException;
import florist.exceptions.WrongFlowerLengthException;
import florist.exceptions.WrongNumberException;
import florist.*;
import florist.nameOfFlowers.Rose;

import java.util.*;

public class MakeABouquetMain {
    public static void main(String[] args) throws EmptyFlowerNameException, WrongFlowerLengthException, WrongNumberException {
        Flower rose = new Flower.Builder()
                .withFlowerName("Rose")
                .withFlowerColor("White")
                .withFlowerPrice(15)
                .withFlowerLength(35)
                .withNumberOfFlowers(3)
                .withFreshnessLevel(FreshnessLevel.FRESH)
                .build();

        Flower pion = new Flower.Builder()
                .withFlowerName("Pion")
                .withFlowerColor("Red")
                .withFlowerPrice(10)
                .withFlowerLength(33)
                .withNumberOfFlowers(3)
                .withFreshnessLevel(FreshnessLevel.NOT_FRESH)
                .build();

        Flower clove = new Flower.Builder()
                .withFlowerName("Clove")
                .withFlowerColor("Pink")
                .withFlowerPrice(8)
                .withFlowerLength(40)
                .withNumberOfFlowers(5)
                .withFreshnessLevel(FreshnessLevel.WILTED)
                .build();


        BouquetOfFlowers bouquetOfFlowers = new BouquetOfFlowers();
        bouquetOfFlowers.addFlower(clove).addFlower(pion).addFlower(rose);

        PackagingOfFlowers packagingOfFlowers = new PackagingOfFlowers(9);
        BowForBouquet bowForBouquet = new BowForBouquet(13);

        double fullCoastOfTheBouquet = bouquetOfFlowers.getBouquetPrise() + packagingOfFlowers.getPriceOfPackaging() + bowForBouquet.getPriceForBow();

        System.out.println("Full coast of the bouquet: " + fullCoastOfTheBouquet + "  " + "rubles");

        List<String> flowerList = new ArrayList<>();
        flowerList.add(clove.getFreshnessLevel() + " " + clove.getFlowerName());
        flowerList.add(pion.getFreshnessLevel() + " " + pion.getFlowerName());
        flowerList.add(rose.getFreshnessLevel() + " " + rose.getFlowerName());
        System.out.println(flowerList);
        System.out.println();

        Collections.sort(flowerList);
        System.out.println(flowerList);

        FlowerLength flowerLength = new FlowerLength(39, 45);
        flowerLength.flowerLength(rose);
        flowerLength.flowerLength(pion);
        flowerLength.flowerLength(clove);


    }
};
