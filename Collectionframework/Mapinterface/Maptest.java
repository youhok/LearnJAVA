package Collectionframework.Mapinterface;

import java.util.HashMap;
import java.util.Map;

public class Maptest {
    public static void main(String[] args) {
         Map<String, Integer> map = new HashMap<>();

        map.put("TITYA", 30);

        map.put("CHAN", 10);

        map.put("KAKVEY", 20);

        for (Map.Entry<String, Integer> e : map.entrySet()) {

            System.out.println(e.getKey() + " " + e.getValue());

        }
    }
}
