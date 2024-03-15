package Collectionframework;

import java.util.LinkedList;

public class Linklist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("hok");
        list.add("seth");
        list.add("fong");
        list.add("Chan");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
