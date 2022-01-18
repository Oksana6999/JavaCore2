package Exeption;

public class Demo1 {
    public static void main (String[] args) {
        System.out.println(division(8,4));
        System.out.println(division(6,0));
        System.out.println(division(6,3));
    }
    private static int division(int a, int b) {
        return a / b;
    }

}
