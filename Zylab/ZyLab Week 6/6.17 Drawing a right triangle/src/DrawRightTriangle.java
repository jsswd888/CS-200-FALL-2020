///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           NumberGuess
// Course:          CS 200 Fall 2020
//
// Author:          Shi Kaiwen
// Email:           kshi42@wisc.edu
// Lecturer's Name: Marc Renault
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

public class DrawRightTriangle {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		String characterInput = scnr.next();
		
		System.out.print("Enter triangle height (1-10): ");
		int height = scnr.nextInt();
		
		while(height > 10 || height < 1) {
			System.out.println("Please enter height between 1 and 10.");
			height = scnr.nextInt();
		}
		
		System.out.println();
		for(int a = 0; a < height; ++a) {
			for(int b = 0 ; b <= a; ++b) {
				System.out.print(characterInput + " ");
			}
			System.out.println("");
		}
	}
}
