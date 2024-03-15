package LernclassObject;

public class Program {
    public static void main(String[] args) {
        // class person
        Person p1 = new Person();

        p1.name = "john";
        p1.age = 23;
        p1.dob = "2000-03-01";
        p1.gender = 'M';
        
        Person p2 = new Person();

        p2.name = "jing";
        p2.age = 30;
        p2.dob = "2006-03-01";
        p2.gender = 'F';

        System.out.println("P2 information");
        System.out.println("name:" + p1.name);
        System.out.println("Age:" + p1.age);
        System.out.println("dob:" + p1.dob);
        System.out.println("Gender: " + p1.gender);
        System.out.println("P2 information");
        System.out.println("name:" + p2.name);
        System.out.println("Age:" + p2.age);
        System.out.println("dob:" + p2.dob);
        System.out.println("Gender: "+ p2.gender);

        // class animal
        // Dog d1 = new Dog();
        // d1.name = "Sok";
        // d1.age = 2;
        // d1.color = "black";
        // Dog d2 = new Dog();
        // d2.name = "Sao";
        // d2.age = 3;
        // d2.color = "white";

        // System.out.println("D1 information");
        // System.out.println("name:" + d1.name);
        // System.out.println("Age:" + d1.age);
        // System.out.println("Color:" + d1.color);
        // System.out.println("D2 information");
        // System.out.println("name:" + d2.name);
        // System.out.println("Age:" + d2.age);
        // System.out.println("Color:" + d2.color);

    }
}
