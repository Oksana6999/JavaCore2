package Lesson3;

import java.util.Arrays;

// поменять местами элементы в массиве, два способа

public class ArrayChange {
    public static void main(String[] args) {
        String[] array = {"Sasha", "Masha", "Boris", "Vova", "Artem"};
        Integer[] array2 = {1, 2, 3, 5};
        Integer[] integers = {9, 5, 9, 0};
        doLesson(array2, 1, 3);
        doLesson(array, 4, 2);
        doLessonArray(integers, 0, 3);

    }


        public static void doLesson (Object[]array, int first, int second) {
        Object post = array[first];
        array[first] = array[second];
        array[second] = post;
        printArray(array);

        }

        private static void printArray (Object[]array){
        System.out.println(Arrays.toString(array));
        }

        private static void doLessonArray(Integer[]integers, int i, int j) {

        int a = integers[i];
        int b = integers[j];

        a = a + b;
        b = b - a;
        b = -b;
        a = a - b;

        integers[i] = a;
        integers[j] = b;

        printArray(integers);
        }
}
