package Collectionframework.PriorityQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DeQueueTest {
    public static void main(String[] args) {
        Deque<String> list = new ArrayDeque<>();
        list.add("Sok");
        list.add("Sao");
        list.add("Chan");
        list.add("Seth");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        list.removeLast();
        list.removeFirst();

        System.out.println("--------------------");

        Iterator<String> iterator2 = list.iterator();

        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

    }

}
