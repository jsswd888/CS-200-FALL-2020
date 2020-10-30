///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           descriptive title of the program making use of this file
// Course:          course number, term, and year
//
// Author:          Shi Kaiwen
// Email:           your @wisc.edu email address
// Lecturer's Name: name of your lecturer
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description
// Examples:
// Jane Doe; helped me with for loop in reverse method
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html; 
//         counting for loop
// John Doe; I helped with switch statement in main method.
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////
import java.util.Scanner;
public class Clue{
   public static void main(String[] args){
        /* call your test method here*/
      testMurdererMessage();
      Scanner scnr = new Scanner(System.in);
      if(scnr.hasNext() == true){
         String witness = scnr.next();
         System.out.println(murdererMessage(witness));
      }else{
         System.out.println("We're not sure who that is. We need to investigate further.");
      } 
   }
    
    /* Add your methods here */
      /**
    * Determines the detective's message. The input should be case insensitive. 
    * If the murderer is not recognized or is null, the message
    * "We're not sure who that is. We need to investigate further." is returned.
    *
    * @param murderer abbreviation.
    * @return The detective's message for a given murderer. 
    */
   public static String murdererMessage(String murderer){ 
      String murderMessage;
       
      if(murderer == null || murderer.equalsIgnoreCase("")){
         murderMessage = "We're not sure who that is. We need to investigate further.";
         return murderMessage;
      }else{
         murderer = murderer.toUpperCase();
         if(murderer.equals("AMOS")){
            murderMessage = "It was Amos with the candlestick!";
            return murderMessage;
         }else if(murderer.equals("KEVIN")){
            murderMessage = "It was Kevin with the revolver!";
            return murderMessage;
         }else if(murderer.equals("JUAN")){
            murderMessage = "It was Juan with the lead pipe!";
            return murderMessage;
         }else{
            murderMessage = "We're not sure who that is. We need to investigate further.";
            return murderMessage;
         }
      }
   }
   
   /**
    *  Runs tests to validate the detective's message via the murderMessage method
    *
   **/
   public static void testMurdererMessage(){ 
      System.out.println("murdererMessage(\"AMOS\") expected \"It was Amos with the candlestick!\" actual \""
               + murdererMessage("AMOS") + "\"");
      System.out.println("murdererMessage(\"KEVIN\") expected \"It was Kevin with the revolver!\" actual \"" 
               + murdererMessage("KEVIN") + "\"");
      System.out.println("murdererMessage(\"JUAN\") expected \"It was Juan with the lead pipe!\" actual \"" 
               + murdererMessage("JUAN") + "\"");
   }
}