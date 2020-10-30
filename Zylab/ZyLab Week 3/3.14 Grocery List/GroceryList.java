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

public class GroceryList {
	
	public static void main(String[] args) {
	   Scanner scnr = new Scanner(System.in);

	   String store = scnr.nextLine();
	   int amount1 = scnr.nextInt();
	   String food1 = scnr.next();
	   int amount2 = scnr.nextInt(); 
      String food2 = scnr.next();
      int amount3 = scnr.nextInt();
      String drink = scnr.next();
      double weight1 = scnr.nextDouble();
      String food3 = scnr.next();
      double weight2 = scnr.nextDouble();
      String food4 = scnr.next();
	   
	   System.out.println(makeGroceryList(store, amount1, amount2, amount3, weight1, weight2, food1, food2, food3, food4, drink));
	   //System.out.println("Grocery List for Shi Kaiwen");
      /*
      System.out.println("I am going to " + store.toUpperCase() + " to get:");
      System.out.println();
      System.out.println(amount1 + " "  + food1.toLowerCase());
      System.out.println(amount2 + " "  + food2.toLowerCase());
      System.out.println(amount3 + " "  + "gallons of " + food3.toLowerCase());
      System.out.println(weight1 + " "  + "pounds of " + food4.toLowerCase());
      System.out.println(weight2 + " "  + "pounds of " + drink.toLowerCase());
      */
	}
	public static String makeGroceryList(String store, int amount1, int amount2, 
            int amount3, double weight1, double weight2, String food1, String food2, 
            String food3, String food4, String drink) {
      /*
      store = "the Farmer's Market";
      amount1 = 5;
      amount2 = 12;
      amount3 = 3;
      food1 = "Apples";
      food2 = "EggS";
      food3 = "CHEESE";
      food4 = "potatoes";
      drink = "milK";
      weight1 = 1.5;
      weight2 = 3;
      */
      /* 以下两句话 加在长的字符串前
      System.out.println("Grocery List for Shi Kaiwen");
      System.out.println("I am going to " + store.toUpperCase() + " to get:");
      */
      String output = "Grocery List for Shi Kaiwen" +  '\n' + "I am going to " + store.toUpperCase().trim() + " to get:" + '\n' + '\n' +  amount1 +" " + food1.toLowerCase() + '\n' + amount2 + " " + food2.toLowerCase() + '\n' + amount3 + " gallons of " + drink.toLowerCase()  + '\n' + weight1 + " pounds of " + food3.toLowerCase() + '\n' + weight2 + " pounds of " + food4.toLowerCase(); 
      return output;
   }
}
