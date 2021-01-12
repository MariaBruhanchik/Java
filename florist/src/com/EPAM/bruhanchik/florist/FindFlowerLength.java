package com.EPAM.bruhanchik.florist;

public class FindFlowerLength {
    double shortLength;
    double longLength;

    public FindFlowerLength(double shortLength, double longLength) {
        this.shortLength = shortLength;
        this.longLength = longLength;
    }

    public void findLength(Flower flower) {
        if (shortLength <= flower.getLength() & flower.getLength() <= longLength) {
            System.out.println(flower.getName() + " " + flower.getLength() + " correspond the length ");
        } else if (shortLength > flower.getLength() && flower.getLength() > longLength) {
            System.out.println("No flowers to correspond the length");
        }
    }

}
