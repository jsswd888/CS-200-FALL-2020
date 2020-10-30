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
import java.util.Random;

public class NumberGuess{
	/**
	 * Edited by Shi Kaiwen. Code below performs easy guess game for users.
	 * @param userGuessNum	used for receive number user input for guess, and compare it to true numbe
	 * @param trueNum		used for store answer number; been used for comparison.
	 */

    public static void main(String[] args){
    	Scanner scnr = new Scanner(System.in);
    	Random rand = new Random(Config.SEED);
    	
    	System.out.println("Please make a guess between 1 and 100: ");
    	int userGuessNum = scnr.nextInt();
    	int trueNum = rand.nextInt(100) + 1;
    	int storeGuessNum = 100;
    	
    	for(int i = 0; i < 100; i++) {
    		if(userGuessNum < trueNum) {
    			System.out.print("Please make a guess between " + userGuessNum + " and " + storeGuessNum + ":");
    			storeGuessNum = userGuessNum;
    			userGuessNum = scnr.nextInt();
    				if(userGuessNum < trueNum && userGuessNum < storeGuessNum) {
    					System.out.print("Please make a guess between " + storeGuessNum + " and 100:");
    	    			storeGuessNum = userGuessNum;
    					userGuessNum = scnr.nextInt();
    				}else if(userGuessNum > trueNum){;
    					System.out.print("Please make a guess between " + storeGuessNum + " and " + userGuessNum +":");
    	    			userGuessNum = scnr.nextInt();
    				}
    		}else if(userGuessNum > trueNum) {
    			System.out.print("Please make a guess between 1 and " + userGuessNum);
    			userGuessNum = scnr.nextInt();
    			storeGuessNum = userGuessNum;
    				if(userGuessNum < trueNum) {
    					System.out.print("Please make a guess between " + userGuessNum + " and "+ storeGuessNum + ":");
    	    			userGuessNum = scnr.nextInt();
    				}else if(userGuessNum > trueNum){
    					System.out.print("Please make a guess between " + storeGuessNum + " and " + userGuessNum +":");
    	    			userGuessNum = scnr.nextInt();
    	    			storeGuessNum = userGuessNum;
    				}else {
    					System.out.println("You won in " + i + " trials!");
    				}
    		}
    	}
        scnr.close();  
    }
}
