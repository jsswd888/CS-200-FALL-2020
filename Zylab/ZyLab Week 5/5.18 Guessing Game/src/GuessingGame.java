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

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Random rand = new Random(Config.SEED);
		
		System.out.println("Guess a number between 1 and 5");
		int guessNum = scnr.nextInt();
		int trueNum = rand.nextInt(5) + 1;

		if(guessNum > trueNum) {
			System.out.println("That's too high");
			System.out.println("Guess again!");
			guessNum = scnr.nextInt();
			if(guessNum > trueNum || guessNum < trueNum) {
				System.out.println("You lose! It was " + trueNum + ".");
			}if(guessNum == trueNum) {
				System.out.println("You win!");
			}
		}else if(guessNum == trueNum) {
			System.out.println("You win!");
		}else if(guessNum < trueNum) {
			System.out.println("That's too low");
			System.out.println("Guess again!");
			guessNum = scnr.nextInt();
			if(guessNum > trueNum || guessNum < trueNum) {
				System.out.println("You lose! It was " + trueNum + ".");
			}if(guessNum == trueNum) {
				System.out.println("You win!");
			}
		}
		
		scnr.close();
	}	
}
