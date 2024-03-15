package Collectionframework;

import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
         Vector<String> list = new Vector<String>();
     
        list.add("hok");
        list.add("seth");
        list.add("fong");
        list.add("Chan");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    
}
