package Lesson3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Box <Apple> boxApples = new Box <Apple>(1.5);
        Box <Orange> boxOranges = new Box <Orange>(1.0);
        Box <Apple> boxApples2 = new Box<Apple>(1.5);

        boxApples.addFruit(new Apple(1.5));
        boxApples2.addFruit(new Apple(1.5));
        boxApples2.addFruit(new Apple(1.5));
        boxApples.addFruit(new Apple(1.5));
        boxOranges.addFruit(new Orange(1.0));
        boxOranges.addFruit(new Orange(1.0));
        boxOranges.addFruit(new Orange(1.0));
        boxOranges.addFruit(new Orange(1.0));



        System.out.println("Вес коробки с апельсинами" + boxOranges.getWeightBox());
        System.out.println("Вес первой коробки с яблоками" + boxApples.getWeightBox());
        System.out.println("Вес второй коробки с яблоками" + boxApples2.getWeightBox());

        boxApples.addFruits(boxApples2);

        System.out.println("Пересыпаем яблоки из второй коробки в первую");

        System.out.println("Вес первой коробки с яблоками" + boxApples.getWeightBox());
        System.out.println("Вес второй коробки с яблоками " + boxApples2.getWeightBox());

        System.out.println("Сравним вес коробки с яблоками и апельсинами. Результат " + boxApples.compare(boxOranges));

    }
}
