package Collectionframework.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityQueueTest {
    public static void main(String[] args) {
                PriorityQueue<String> list = new PriorityQueue<>();

        list.add("Sok");

        list.add("Nila");

        list.add("Chan");

        list.add("Kakvey");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());

        }
    }
}
