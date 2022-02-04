package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> month = new HashMap<>();
        month.put("june", 6);
        month.put("december", 12);
        month.put("january", 1);
        month.put("may", 5);
//   метод не гарантирует записи по порядку внесения в список
        System.out.println(month);

        System.out.println(month.get("december"));
        System.out.println(month.get("moy"));
        month.put("june", 8);
        System.out.println(month);

//        перебор ключей

        for (String key : month.keySet()) {
            System.out.printf("key = %s, val = % d \n", key, month.get(key) );
        }

        for (Map.Entry<String, Integer> pair : month.entrySet()) {
            System.out.println("Pair key: " + pair.getKey() + " value:" + pair.getValue());
        }

        System.out.println(month.values());
        System.out.println(month.keySet());
    }
}
