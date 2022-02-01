package Lesson3;

import java.util.ArrayList;

public class Apple extends Fruit{

    public Apple (double weight) {
        super(1.5);
    }

    @Override
    public String toString() {
        return "Apple, " +
                "weight= " + getWeight() + "g ";
    }
}
