///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           descriptive title of the program making use of this file
// Course:          comp sci 200 Fall 2020
//
// Author:          Kaiwen Shi
// Email:           kshi42@wisc.edu
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
import java.lang.Math;

public class CostEstimator {
  public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double distance = 0.0;
      double fuelNeeded = 0.0;
      double gallonsFuel = 0.0;
      double costNeeded = 0.0;
   
      final double MILES_PER_LITER = 13.7;
      final double LITER_PER_GALLON = 3.785;
      final double COST_PER_GALLON = 2.629;
   		
      System.out.println("Enter the distance to be covered (miles):");
      distance = scnr.nextDouble();
   
      fuelNeeded = distance / MILES_PER_LITER ;                     // FIXME (1): Calculate the fuel needed
      System.out.println("Fuel Needed: " + fuelNeeded + " liter(s)");  // FIXME (1): Finish the output statement
   
      // FIXME (2): Calculate and output the amount of gallons needed for the trip
      gallonsFuel = Math.ceil(fuelNeeded / LITER_PER_GALLON);
      System.out.println("Gallons needed: " + (int)gallonsFuel + " gallon(s)");
      // FIXME (3): Calculate and output the total cost needed for the trip
      costNeeded = gallonsFuel * COST_PER_GALLON;
      System.out.println("Cost needed: " + costNeeded + " $");
    
  }
}