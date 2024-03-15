package Collectionframework;

import java.util.ArrayList;

import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("hok");
        list.add ("seth");
        list.add("fong");
        list.add("Chan");

        for(int i =0 ; i < list.size(); i++ ){
            System.out.println(list.get(i));
        }


        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("hok");
        list2.add ("seth");
        list2.add("fong");
        list2.add("Chan");
        Iterator<String> iterator = list2.iterator();

        while (iterator.hasNext() ) {
            System.out.println(iterator.next());
        }
    }
}
