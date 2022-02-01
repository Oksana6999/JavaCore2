package Lesson3;

import java.util.Arrays;

public class ArrayChange {
    public static void main(String[] args) {
        String[] array = {"Sasha", "Masha", "Boris", "Vova", "Artem"};

    }
        public static void doLesson_Array (Object[]array,int firstIndex, int secondIndex){
            Object temp = array[firstIndex];
            array[firstIndex] = array[secondIndex];
            array[secondIndex] = temp;
            printArray(array);
        }

        private static void printArray (Object[]array){
            System.out.println(Arrays.toString(array));
        }
}
