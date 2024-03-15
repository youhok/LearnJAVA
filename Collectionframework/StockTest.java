package Collectionframework;
import java.util.Stack;


public class StockTest {
    public static void main(String[] args) {
         Stack<String> list = new Stack<>();
     
        list.add("hok");
        list.add("seth");
        list.add("fong");
        list.add("Chan");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
