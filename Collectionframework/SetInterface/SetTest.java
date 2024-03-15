package Collectionframework.SetInterface;

import java.util.HashSet;

import java.util.Iterator;

public class SetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
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
