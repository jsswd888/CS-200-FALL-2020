///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           HelloIDE
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

public class HelloIDE {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("What is your name?");
	 
		
		if(scnr.hasNextLine()) {
			String name = scnr.nextLine().trim();
			if(name.equals("") || name == null ){
				System.out.println("Hello, " + Config.DEFAULT_NAME + "!");
			}else {
				System.out.println("Hello, " + name + "!");
			}
		}else {
			System.out.println("Hello, " + Config.DEFAULT_NAME + "!");
		}
	}
}
