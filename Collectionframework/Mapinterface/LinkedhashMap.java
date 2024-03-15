package Collectionframework.Mapinterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedhashMap {
    public static void main(String[] args) {
         Map<String, Integer> map = new LinkedHashMap<>();

        map.put("TITYA", 30);

        map.put("CHAN", 10);

        map.put("KAKVEY", 20);

        for (Map.Entry<String, Integer> e : map.entrySet()) {

            System.out.println(e.getKey() + " " + e.getValue());

        }


    }
}
