package Interface;

public class Tesla  implements Hybirde,AutoPilot, car{

  
    public void useBatter() {
        
         System.out.println("Use batter");
    }


    public void useDiesel() {
       
         System.out.println("Use Diesel");
    }

    
    public void selfDirver() {
        System.out.println("SelfDirving");
        
    }

  
    public void drive() {
        System.out.println("SelfDirving");
    }

    
    public void turnLeft() {
       
         System.out.println("turnLeft");
    }

    
    public void turnRight() {
      
         System.out.println("turn Right");
    }
    
}
