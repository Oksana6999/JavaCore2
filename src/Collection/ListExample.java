package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));

        for (int i = 0; i < integers.size(); i++) {
            System.out.print(integers.get(i));
        }

        Iterator<Integer> iterator = integers.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }

        for (Integer integer : integers) {
            System.out.println(integer + "right");
        }
//так не надо удалять ))
        for (Integer integer : integers) {
            if (integer == 9) {
                integers.remove(integer);
                System.out.print(integers);
            }
        }
//        правильный способ удаления в процессе перебора значений через итератор
        Iterator<Integer> iterator1 = integers.iterator();
        while (iterator1.hasNext()) {
            int a = iterator1.next();
                    if (a == 5) {
                        iterator1.remove();
                    }
        }
        System.out.println("================");
        System.out.print(integers);


    }
}
