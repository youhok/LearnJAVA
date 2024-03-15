public class MyMath {
    // public static int minOf(int a, int b, int c) {
    //     return Math.min(Math.min(a, b), c);
    // }

    // public static void main(String[] args) {
    //     int min = minOf(10, 5, 8);
    //     System.out.println("Minimum value: " + min);
    // }
     public static int minOf(int a, int b) {
        return Math.min(a, b);
    }

    public static void main(String[] args) {
        int min = minOf(10, 5);
        System.out.println("Minimum value: " + min);
    }
    
        // public int calculateABSValue(int input) {
        //     return Math.abs(input);
        // }
        
        // public static int getABS(int input) {
        //     return Math.abs(input);
        // }
    
        // public static void main(String[] args) {
        //     MyMath math = new MyMath();
            
        //     int input = -5;
            
        //     int result1 = math.calculateABSValue(input);
        //     System.out.println("Absolute value using non-static method: " + result1);
            
        //     int result2 = MyMath.getABS(input);
        //     System.out.println("Absolute value using static method: " + result2);
        // }
}