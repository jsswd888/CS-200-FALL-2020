///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           descriptive title of the program making use of this file
// Course:          course number, term, and year
//
// Author:          Kaiwen Shi
// Email:           kshi42 @wisc.edu email address
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

import java.util.Random;

public class TemperaturePredictor {
	
	public static void main(String[] args) {
		Random rand = new Random(Config.SEED);
		
		System.out.println("Temperature: " + getTemp(rand, 65, 10) + " F");
		System.out.println("Temperature: " + getTemp(rand, 65, 10) + " F");
		System.out.println("Temperature: " + getTemp(rand, 65, 10) + " F");
		// Additional tests:  ***DO NOT REMOVE THIS LINE***
		System.out.println("Temperature: " + getTemp(rand, 65, 10) + " F");
		System.out.println("Temperature: " + getTemp(rand, 65, 10) + " F");
	}
	public static int getTemp(Random rand, int currTemp, int changeInTemp) {
	   int max;
	   int min;
	   
	   max = currTemp + changeInTemp;
	   min = currTemp - changeInTemp;
	   
	   return rand.nextInt((max - min)  + 1) + min;
   }
}
