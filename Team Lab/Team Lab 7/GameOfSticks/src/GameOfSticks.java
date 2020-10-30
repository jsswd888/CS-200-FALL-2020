//TEAM LAB 7 EXERCISE C

///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Game of Sticks
// Course:          CS200, Fall, 2020
//
// Author:          Zhaowei Yin; Kaiwen Shi; Scarlett Liu
// Email:           zyin57@wisc.edu; kshi42@wisc.edu; hliu389@wisc.edu
// Lecturer's Name: Marc Renault
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
//                                  None
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.util.Scanner;

/**
 * @author Patrick Yin
 * @author Kaiwen Shi
   @author Scarlett Liu
*/
/**
 * This is the program itself
 */
 
public class GameOfSticks {

    /**
     * Prompts the user to enter a int value in range of the set max and min values
     * @param input Scanner class used to get user input
     * @param prompt The promot this method will output to the concole before taking input
     * @param min The minimum value this method will accept
     * @param max The max value this method will accept
     * @return returns user input within accpeted range
     */
	 
    public static int promptUser(Scanner input, String prompt, int choiceMin, int choiceMax) {
        int userChoice = 0;
        do {
            System.out.print(prompt);
            if (input.hasNextInt()) {
                userChoice = input.nextInt();
                input.nextLine();
                if (userChoice < min || userChoice > max) {
                    System.out.println("Please enter a number from " + min + " to " + max + ".");
                }
            } else {
                input.nextLine();
            }
        } while (userChoice < min || userChoice > max);
        return userChoice;
    }

    /**
     * 
     * @param remainingSticks How many sticks are left, used to calculate computer pick up
     * @return Number of ticks the computer picks up 
     */
    public static int computer(int remainingSticks) {
        int pickUp = (remainingSticks - 1) % 4;

        return pickUp > 0 ? pickUp : 1;
    }
    /**
     * This is the main method that initialize required variables
     * This method calls promptUser and computer to perform the game
     * @param args unused
     */
    public static void main(String[] args) {
        final int START = 21;
        final int MAX = 3;
        final int MIN = 1;
        Scanner i = new Scanner(System.in);
        System.out.println("Welcome to the Game of Sticks");
        int remainingSticks = START;
        System.out.print("Would you like to go first? (y/n): ");
        boolean goingFirst = i.nextLine().trim().equalsIgnoreCase("y");
        int userChoice = 0;
        int computerPickup = 0;
        while(remainingSticks > 0) {
            if (goingFirst) {
                String prompt = "There are " + remainingSticks + " remaining sticks. How many do you pick up (" + MIN + "-" + Math.min(MAX, remainingSticks) + ")? ";
                userChoice = promptUser(i, prompt, MIN, MAX);
                remainingSticks -= userChoice;
                if (remainingSticks <= 0) {
                    System.out.println("You lost!");
                }
            }
            else {
                computerPickup = computer(remainingSticks);
                System.out.println("Computer picks up " + computerPickup + " sticks");
                remainingSticks -= computerPickup;
                if (remainingSticks <= 0) {
                    System.out.println("You won!");
                }
            }
            goingFirst = !goingFirst;
        }
    }
}