///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           descriptive title of the program making use of this file
// Course:          CS 200 Fall 2020
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

public class OutputWithVars {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum = 0;
      int userNum1 = 0;

      System.out.println("Enter integer:");
      userNum = scnr.nextInt();
      
      System.out.println("You entered: " + userNum);
      System.out.println(userNum + " squared is " + userNum * userNum);//4 squared is 16
      System.out.println(userNum + " cubed is " + userNum * userNum * userNum);//4 cubed is 64
      System.out.println(userNum + " squared + " + userNum + " cubed is " + (userNum * userNum + userNum * userNum * userNum));//4 squared + 4 cubed is 80
      System.out.println("Enter another integer:");
      userNum1 = scnr.nextInt();
      
      int sum = userNum + userNum1;
      int product = userNum * userNum1;
      int result = userNum - userNum1;
      
      System.out.println(userNum + " + " + userNum1 + " is " + sum);
      System.out.println(userNum + " * " + userNum1 + " is " + product);
      System.out.println(userNum + " - " + userNum1 + " is " + result);
   }
}