package Collectionframework.SetInterface;


import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetTestLinkhashset {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
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