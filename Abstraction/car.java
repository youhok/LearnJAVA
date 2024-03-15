package Abstraction;

public abstract class car {
    // can has abstract method but can't instatiate
    String name;
    String model;

    abstract void driveForward();
    abstract void driveBackward();
    abstract void turnleft();
    abstract void turnRight();
    abstract void autoPilot();

}
