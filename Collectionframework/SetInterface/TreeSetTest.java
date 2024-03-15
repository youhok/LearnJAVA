package Collectionframework.SetInterface;

import java.util.Iterator;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
         TreeSet<String> set = new TreeSet<String>();
        set.add("Sok");
        set.add("Sao");
        set.add("Chan");
        set.add("AhTet");

        Iterator<String> itr = set.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
