package Collectionframework.Mapinterface;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
                Map<String, Integer> map = new TreeMap<>();

        map.put("TITYA", 5);

        map.put("CHAN", 10);

        map.put("KAKVEY", 20);

        for (Map.Entry<String, Integer> e : map.entrySet()) {

            System.out.println(e.getKey() + " " + e.getValue());

        }
    }
}
