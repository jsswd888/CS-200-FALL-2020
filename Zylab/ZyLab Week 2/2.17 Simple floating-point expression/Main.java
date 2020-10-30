import java.util.Scanner; 

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int x; 
      double y; 
      
      x = scnr.nextInt(); 
      
      /* Type your code here. */
      y = (1.0 * x /3.0) + (x / 4.0) + (2.0 * x);
      System.out.println(y); 
   }
}
