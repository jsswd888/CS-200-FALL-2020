///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           MessedUp.java for formating exercise
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
//INSTRUCTOR NOTE: All classes must have a JavaDoc class header comment.

/**
* This class contains the code for automatically define students' letter grades based on their test scores inputed.
* For example, any test score larger than 93 will be offered an "A" letter grade.
* 
* Bugs: none known
*
* @author Shi Kaiwen 
*/
public class MessedUp {
    /**
     * This method contains the first step to offer a letter grade to a student
     * based on their input test scores. So here the String is the offered letter 
     * grade, and the integer is input test score. grade boundary is given as integers
     * and will be used for comparison.
     * 
     * 
     * Algorithm:
     * compare user input with given integers, and judge the appropriate letter grade 
     * should be given out.
     * 
     * Constants used for grade boundaries(all in integer form):
     * 93; 89; 82; 76; 68; 55;  
     * @param testScore used for comparison
     * @return String gradeBoundary
     */
	public static String gradeBoundary(int testScore) {
		String letterGrade;
		if (testScore >= 93) {
			letterGrade = "A";
		} else if (testScore >= 89) {
			letterGrade = "AB";
		} else if (testScore >= 82) {
			letterGrade = "B";
		} else if (testScore >= 76) {
			letterGrade = "BC";
		} else if (testScore >= 68) {
			letterGrade = "C";
		} else if (testScore >= 55) {
			letterGrade = "D";
		} else {
			letterGrade = "F";
		}

		return letterGrade;
	}
	
	/**
     * This method contains all interacting operation to program user. When 
     * the program receives user input by int variable studentScores, and then 
     * call gradeBoundart method for comparison.
     * 
     * 
     * Algorithm:
     * call gradeBoundary method and send argument studentScore for comparison.
     *
     * @param studentScore used for comparison
     * call gradeBoundary method for calculation
     */
	public static void main(String[] args) {
		Scanner studentTestScore = new Scanner(System.in);
		System.out.print("Enter your score: ");
		int studentScore = studentTestScore.nextInt();
		System.out.println("Grade: " + gradeBoundary(studentScore));
	}
}
