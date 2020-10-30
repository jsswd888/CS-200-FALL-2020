///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           descriptive title of the program making use of this file
// Course:          course number, term, and year
//
// Author:          Shi Kaiwen
// Email:           kshi42@wisc.edu email address
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
import java.util.Random;

public class RockPaperScissors {
   public static void main(String[] args) {
      Random rand = new Random(Config.SEED);
      Scanner scnr = new Scanner(System.in);
      
      System.out.print("Please select one of [R/P/S]: ");
      String userPlay = scnr.next();
      
      int pcPlayNum = rand.nextInt(3) + 1;
      
      String pcPlay = null;
      if(pcPlayNum == 1) {
    	  pcPlay = "Rock";
      }else if(pcPlayNum == 2) {
    	  pcPlay = "Paper";
      }else if(pcPlayNum == 3) {
    	  pcPlay = "Scissors";
      }
      
      int userPlayNum = 0;
      if(userPlay.toUpperCase().equals("R")) {
    	  userPlayNum = 1; 
      }else if(userPlay.toUpperCase().equals("P")) {
    	  userPlayNum = 2;
      }else if(userPlay.toUpperCase().equals("s")) {
    	  userPlayNum = 3;
      }else {
    	  System.out.println("Invalid choice! Defaulting to Rock.");
    	  userPlayNum = 4;
      }
      
      if(userPlayNum == pcPlayNum) {
    	  System.out.println("A Tie!");
      }else if(userPlayNum != pcPlayNum){
    	  if(userPlayNum == 1 && pcPlayNum == 2) {
    		  System.out.println("You chose: Rock");
    		  System.out.println("I chose: " + pcPlay);
    		  System.out.println("Paper beats rock - you lose!");
    	  }else if(userPlayNum == 1 && pcPlayNum == 3) {
    		  System.out.println("You chose: Rock");
    		  System.out.println("I chose: " + pcPlay);
    		  System.out.println("Rock beats scissors - you win!");
    	  }else if(userPlayNum == 2 && pcPlayNum == 1) {
    		  System.out.println("You chose: Paper" );
    		  System.out.println("I chose: " + pcPlay);
    		  System.out.println("Paper beats rock - you win!");
    	  }else if(userPlayNum == 2 && pcPlayNum == 3) {
    		  System.out.println("You chose: Paper");
    		  System.out.println("I chose: " + pcPlay);
    		  System.out.println("Scissors beats paper - you lose!");
    	  }else if(userPlayNum == 3 && pcPlayNum == 1) {
    		  System.out.println("You chose: Scissors");
    		  System.out.println("I chose: " + pcPlay);
    		  System.out.println("Rock beats scissors - you lose!");
    	  }else if(userPlayNum == 3 && pcPlayNum == 2) {
    		  System.out.println("You chose: Scissors");
    		  System.out.println("I chose: " + pcPlay);
    		  System.out.println("Scissors beats paper - you win!");
    	  }else if(userPlayNum == 4 && pcPlayNum == 2) {
    		  System.out.println("I chose: " + pcPlay);
    		  System.out.println("Paper beats rock - you lose!");
    	  }else if(userPlayNum == 4 && pcPlayNum == 3) {
    		  System.out.println("I chose: " + pcPlay);
    		  System.out.println("Rock beats scissors - you win!");
    	  }
      }
      scnr.close();
   }

}