package Polymorphism;

public class MainProgram {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
        d.makeSound("helo");
        d.makeSound(4);
    }
}
