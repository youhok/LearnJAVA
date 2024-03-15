package Enum;

public class Game {
    enum Level {
        Easy ,  Medium , Hard , SuperHard
    }

    public Game(){

        for(Level l: Level.values()){
            System.out.println(l);
        }
    }
}
