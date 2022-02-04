package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class Vehicle {

    public static abstract class Cars {
        private String model;

        public Cars(String model) {
            this.model = model;
        }
    }

    public static class Car extends Cars {

        public Car(String model) {
            super(model);
        }
    }

    public static class Bike extends Cars {
        public Bike(String model) {
            super(model);
        }
    }

    public static void main(String[] args) {
        ArrayList<Cars> garage = new ArrayList<>();

        Car a = new Car("Lada");
        Bike b = new Bike("Java");

        garage.add(a);
        garage.add(b);
        System.out.println(garage.indexOf(a));
        System.out.println(garage.indexOf(b));

//        добавление элементов при инициализации листа, сортировка

        ArrayList<Cars> garage2 = new ArrayList<>(Arrays.asList(new Car("Opel"), new Bike("Cherocky")));


        Integer[] integers = new Integer[]{9, 3, 0, 10, 44};
        Integer[] integers2 = new Integer[]{99,33,44,155,66};
        ArrayList<Integer> integers1 = new ArrayList<>(Arrays.asList(integers));
        ArrayList<Integer> integers3 = new ArrayList<>(Arrays.asList(integers2));

        Collections.sort(integers1);
        System.out.println(integers1);

        Collections.sort(integers3);
        System.out.println(integers3);

        Collections.reverse(integers1);

//        замена элемента в листе

        System.out.println(integers1);
        integers1.set(3, 25);

    }
}