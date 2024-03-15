package Encapsulation;

public class Account {

    int id;
    String name;
    private double balance;
    String password;

    public Account(int id, String name, double balance, String password) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.password = password;
    }

    public void deposit(double amount, String pw) {
        if(pw != password){
            System.out.println("Wrong password");
            return;
        }
        balance += amount;
    }

    public double getBalance(String pw) {
        return balance;
    }
    
    public boolean withdraw(double amount, String Password) {
        if (!Password.equals(this.password)) {
            System.out.println("Here is your money:" + amount);
            balance-=amount;
            return true;
        }
        else {
            System.out.println("Your password is incorrect");
            return false;
        }
    }
}
