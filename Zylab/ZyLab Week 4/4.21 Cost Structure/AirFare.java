import java.util.Scanner;

public class Airfare {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int passengerAge;
      int carryOns;
      int checkedBags; 
      int airFare; 
      
      passengerAge = scnr.nextInt();
      carryOns = scnr.nextInt();
      checkedBags = scnr.nextInt();

      /* Type your code here. */
      if(passengerAge >= 60){
         airFare = 290;
      }else if(passengerAge <= 2){
         airFare = 0;
      }else{
         airFare = 300;
      }
      
      if(carryOns == 1){
         airFare += 10;
      }else{
         airFare += 0;
      }
      
      if(checkedBags == 1){
         airFare += 0;
      }else if(checkedBags == 2){
         airFare += 25;
      }else if(checkedBags == 3){
         airFare += (25 + 50);
      }else if(checkedBags > 3){
         airFare = airFare + 25 + 50 * (checkedBags - 2);
      }
         
      
      System.out.println(airFare);
   }
}
