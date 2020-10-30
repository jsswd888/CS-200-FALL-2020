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
import java.lang.Math;
public class Rectangles {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int x1R1 = scnr.nextInt();
		int y1R1 = scnr.nextInt();
				
		int x2R1 = scnr.nextInt();
		int y2R1 = scnr.nextInt();
		int r1Area = Math.abs(x1R1-x2R1) * Math.abs(y1R1-y2R1);
		
		
		
		int x1R2 = scnr.nextInt();
		int y1R2 = scnr.nextInt();
		
		int x2R2 = scnr.nextInt();
		int y2R2 = scnr.nextInt();
		int r2Area = Math.abs(x1R2-x2R2) * Math.abs(y1R2-y2R2);
		
		Boolean r2Bigger;
		if(r1Area < r2Area) {
			r2Bigger = true;
			System.out.println(r2Bigger);
		}else {
			r2Bigger = false;
			System.out.println(r2Bigger);
		}
		
		
				
		
	}
}
