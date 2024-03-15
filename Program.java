
public class Program {
  public static void main(String[] args) {

    // final int i =6 ;
    // i =20;
    // System.out.println(i);
    Person p1 = new Person();
    Person p2 = new Person();


    p1.name = "hokie";
    p1.age = 23;
    p1.gender = 'M';
    p1.dob = "2000-03-11";


    p2.name = "yuki";
    p2.age = 25;
    p2.gender = 'F';
    p2.dob = "2004-06-11";

    p1.printInfo();
    p2.printInfo();
  }
}
