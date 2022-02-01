package Lesson3;

public class Orange extends Fruit{


    public Orange(double weight) {
        super(1.0);
    }

    @Override
    public String toString() {
        return "Orange, " +
                "weight= " + getWeight() + "g ";
    }
}
