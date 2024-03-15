package Enum;

public class Program {
    public static void main(String[] args) {
       Eseason season = Eseason.AUTUMN;

       switch(season){
        case WINTER:
            System.out.println("It's so cold!");
            break;
             case AUTUMN:
            System.out.println("The leaves are falling!");
            break;
             case SPRING:
            System.out.println("The flower are blooming!");
            break;
             case SUMMER:
            System.out.println("It's so hot!");
            break;
            default:
             System.out.println("Invalid season");
       }
       for(Eseason e: Eseason.values()){
        System.out.println(e);
       }
      }
}
