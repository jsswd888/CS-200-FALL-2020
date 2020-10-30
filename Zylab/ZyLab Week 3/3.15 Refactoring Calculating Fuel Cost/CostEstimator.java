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

public class CostEstimator
{  
   public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
      double distance = 0.0;
      double fuelNeeded = 0.0;
      int gallonsFuel = 0;
      double costNeeded = 0.0;
      
      double miles_per_liter = 13.7;
      double liter_per_gallon = 3.785;
      double cost_per_gallon = 2.629;
      
      System.out.println("Enter the distance to be covered (miles):");
      distance = scnr.nextDouble();
      
      fuelNeeded = calcFuelNeeded(distance, miles_per_liter);
      System.out.println("Fuel Needed: " + fuelNeeded + " liter(s)");
      
      gallonsFuel = calcGallonsFuelNeeded(fuelNeeded, liter_per_gallon);
      System.out.println("Gallons needed: " + gallonsFuel + " gallon(s)");
      
      costNeeded = calcCostNeeded(gallonsFuel, cost_per_gallon);
      System.out.println("Cost needed: " + costNeeded + " $");
   }
   public static double calcFuelNeeded(double distance, double miles_per_liter){
      //final double MILES_PER_LITER = 13.7;
      double calcFuelNeeded = distance / miles_per_liter; //MILES_PER_LITER;
      return calcFuelNeeded;
   }
   
   public static int calcGallonsFuelNeeded(double fuelNeeded, double liter_per_gallon){
      //final double LITER_PER_GALLON = 3.785;
      //int a = (int)fuelNeeded;
      //int b = (int)LITER_PER_GALLON;
      int calcGallonsFuelNeeded = (int)Math.ceil(fuelNeeded / liter_per_gallon);//LITER_PER_GALLON);
      return calcGallonsFuelNeeded;
   }
   
   public static double calcCostNeeded(int gallonsFuel, double cost_per_gallon){
      //final double COST_PER_GALLON = 2.629;
      double calCostNeeded = cost_per_gallon * gallonsFuel;//COST_PER_GALLON * gallonsFuel;
      return calCostNeeded;
   }
   public static void testMethods(){
      if(Math.abs(calcFuelNeeded(100, 12.5) - 8) < 0.0000001){ 
         System.out.println("calcFuelNeeded test passed!");
      }else{
         System.out.println("calcFuelNeeded test failed!");
      }
      
      if(calcGallonsFuelNeeded(10, 3) == 4){ 
         System.out.println("calcGallonsFuelNeeded test passed!");
      }else{
         System.out.println("calcGallonsFuelNeeded test failed!");   
      }
      
      if(Math.abs(calcCostNeeded(4, 7.8) - 31.2) < 0.0000001){
         System.out.println("calcCostNeeded test passed!");
      }else{
         System.out.println("calcCostNeeded test failed!"); 
      }
   }
}
   
   