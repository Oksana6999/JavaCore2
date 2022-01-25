package Lesson3;

import java.util.ArrayList;

public class Box<T> {

    public double weightFruit = 0.0;

    ArrayList<T> fruits = new ArrayList<>();

    public <T> Box(double weightFruit) {
        this.weightFruit = weightFruit;

    }

    public void addFruit (T fruit) {
        fruits.add(fruit);

    }

    public double getWeightBox() {
        return fruits.size() * weightFruit;
    }

    public boolean compare(Box<?> box){
        return Math.abs(getWeightBox() - box.getWeightBox()) < 0.00001;
    }

    public void addFruits(Box<T> box){
//        System.out.println("Before merging. Quantity box 1: " + fruits.size());
//        System.out.println("Before merging. Quantity box 2: " + box.fruits.size());
        fruits.addAll(box.fruits);
        box.fruits.clear();
        box.fruits.trimToSize();
//        System.out.println("After merging. Quantity box 1: " + fruits.size());
//        System.out.println("After merging. Quantity box 2: " + box.fruits.size());
    }

}











