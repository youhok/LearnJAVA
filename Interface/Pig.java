package Interface;

public class Pig implements Animal, Life {
    public void sleep() {
        System.out.println("Sleep");
    }

    public void animalSound() {
        System.out.println("Animal sound");
    }

    public void run() {
        System.out.println("run");
    }
    public void canBreath(){
        System.out.println("Breath");
    }
    public void canGetOld(){
        System.out.println("Get old");
    }
    public void canDie(){
        System.out.println("Can Die");
    }
}
