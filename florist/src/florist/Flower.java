package florist;

import florist.exceptions.EmptyFlowerNameException;
import florist.exceptions.WrongFlowerLengthException;
import florist.exceptions.WrongNumberException;

public class Flower {
    private String flowerName;
    private double flowerPrise;
    private String flowerColor;
    private double flowerLength;
    private int numberOfFlowers;
    private FreshnessLevel freshnessLevel;


    public String getFlowerName() {
        return flowerName;
    }

    public double getFlowerPrise() {
        return flowerPrise;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public double getFlowerLength() {
        return flowerLength;
    }

    public int getNumberOfFlowers() {
        return numberOfFlowers;
    }

    public FreshnessLevel getFreshnessLevel() {
        return freshnessLevel;
    }

    public void setFlowerPrise(double flowerPrise) {
        this.flowerPrise = flowerPrise;
    }

    public void setFlowerLength(double flowerLength) {
        this.flowerLength = flowerLength;
    }


    public static class Builder {
        private Flower newFlower;

        public Builder() {
            newFlower = new Flower();
        }

        public Builder withFlowerName(String flowerName) throws EmptyFlowerNameException {
            if (flowerName.isEmpty()) {
                throw new EmptyFlowerNameException("Name of flower can not be empty.");
            }
            newFlower.flowerName = flowerName;
            return this;

        }

        public Builder withFlowerPrice(double flowerPrice) {
            if (flowerPrice <= 0) {
                throw new IllegalArgumentException("Price can not be less then zero.");
            }
            newFlower.flowerPrise = flowerPrice;
            return this;
        }

        public Builder withFlowerColor(String flowerColor) {
            if (flowerColor == null) {
                throw new NullPointerException("Argument color can not be null.");
            }
            newFlower.flowerColor = flowerColor;
            return this;
        }

        public Builder withFlowerLength(double flowerLength) throws WrongFlowerLengthException {
            if (flowerLength < 0) {
                throw new WrongFlowerLengthException("Length can not be less than zero.");
            }
            newFlower.flowerLength = flowerLength;
            return this;
        }

        public Builder withNumberOfFlowers(int numberOfFlowers) throws WrongNumberException {
            if (numberOfFlowers < 0) {
                throw new WrongNumberException("Number of flowers can not be less than zero.");
            }
            newFlower.numberOfFlowers = numberOfFlowers;
            return this;
        }

        public Builder withFreshnessLevel(FreshnessLevel freshnessLevel) {
            newFlower.freshnessLevel = freshnessLevel;
            return this;
        }

        public Flower build() {
            return newFlower;
        }

    }


}
