package Polymorphism;

public class Dog extends Animal {
    public void makeSound(){
        System.out.println("Dog say: wooh wooh");
    }
     public void makeSound(String voice){
        System.out.println("Dog say:" + voice);
    }
      public void makeSound(int n){
        System.out.println(n +"dog");
    }
}
