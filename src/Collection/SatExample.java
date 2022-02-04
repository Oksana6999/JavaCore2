package Collection;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.util.*;

public class SatExample {

    public static class Cat {
        private String name;

        public Cat (String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Cat cat = (Cat) o;
            return name != null ? name.equals(cat.name) : cat.name == null;

        }
        
        @Override
        public int hashCode () {
            return Objects.hashCode(name);
        }

        public static void main(String[] args) {
            Cat cat1 = new Cat ("Mursik");
            Cat cat2 = new Cat  ("Mursik");
            System.out.println(cat1.equals(cat2));
            System.out.println(Integer.toHexString(cat1.hashCode()));
            System.out.println(Integer.toHexString(cat1.hashCode()));


            Set<Cat> catSet = new HashSet<Cat>(Arrays.asList(cat1, cat2));
            System.out.println(catSet.size());

//            добавление уникальных элементов в порядке зависящем от хэша

            Set<Integer> uniqset = new HashSet<>(Arrays.asList(0, 5, 5, 3, 2, 100, 100, 101, 0));
            System.out.println(uniqset);
//добавление по порядку внесения в список и только уникальных элементов
            Set<Integer> linkSet = new LinkedHashSet<>(Arrays.asList(100, 50, 0, 50, 20, 20, 100));
            System.out.println(linkSet);
// добавление уникальных элементов и сортировка по возрастанию
            Set<Integer> treeSet = new TreeSet<>(Arrays.asList(0, 35, 35, 36, 37, 100, 21, 20));
            System.out.println(treeSet);



        }
    }
}
