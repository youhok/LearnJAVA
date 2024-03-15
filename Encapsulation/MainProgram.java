package Encapsulation;

public class MainProgram {
    public static void main(String[] args) {
    Account aa = new Account(1,"NUBB",3000 , "Nubb123");
    System.out.println(aa.getBalance("Nubb123"));
    aa.deposit(3000, "Nubb123");
    }
}
