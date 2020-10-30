import java.util.Scanner;
import java.lang.Math;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      double x1 = scnr.nextDouble();
      double y1 = scnr.nextDouble();
      double x2 = scnr.nextDouble();
      double y2 = scnr.nextDouble();
      double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
      System.out.println(d);
   } 
}