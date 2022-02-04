package Collection;


// методы интерфейса Collection

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> integers = new ArrayList<>();

//        определение размера
        System.out.println(integers.size());
        System.out.println(integers.isEmpty());      //если пустой, то true

        System.out.println("-------------------------------------");


//        добавление элементов в список

        integers.add(2980);
        integers.add(35);
        Collection<Integer> integers2 = new ArrayList<>(Arrays.asList(0, 2, 4, 6, 8, 9));
        integers.addAll(integers2);

        System.out.println(integers);

        System.out.println("---------------------");

//        проверка на вхождение

        System.out.println(integers.contains(2980));
        System.out.println(integers.containsAll(integers2));
        System.out.println(integers.contains(36));
        System.out.println("-----------------");

//        сравнение

        System.out.println(integers.equals(integers2));

       Collection<Integer> integers3 = new ArrayList<>(Arrays.asList(2, 3, 4));
       Collection<Integer> integers4 = new ArrayList<>(Arrays.asList(2, 3, 4));

       System.out.println(integers3.equals(integers4));

//       удаление элементов

        integers.remove(35);
        System.out.println(integers);
        integers.removeAll(integers2);
        System.out.println(integers);
        integers.addAll(integers3);
        System.out.println(integers);
        integers.retainAll(integers3);
        System.out.println(integers);
        integers.clear();
        System.out.println(integers);

//        копирование и преобразование списка в массив

        integers.addAll(integers3);
        Object[] integerArray = integers.toArray();

        System.out.println(integerArray.length);





            }
}
