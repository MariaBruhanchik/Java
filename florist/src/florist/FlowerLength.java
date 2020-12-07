package florist;

import java.util.ArrayList;
import java.util.List;

public class FlowerLength {

    private int smallLength;
    private int longLength;


    public FlowerLength(int smallLength, int longLength) {
        this.smallLength = smallLength;
        this.longLength = longLength;

    }

    public void flowerLength(Flower flower) {

        if (smallLength < flower.getFlowerLength() & flower.getFlowerLength() <= longLength) {
            System.out.println(flower.getFlowerName() + "  correspond the length ");
        } else if (smallLength > flower.getFlowerLength() && flower.getFlowerLength() > longLength)
            System.out.println("No flowers");
    }


}