///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           This program aims for exercising basic input
// Course:          CS 200 Fall 2020
//
// Author:          Kaiwen Shi
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

public class BasicInput {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double userDouble = 0.0;
      int userInt = 0;
      // FIXME Define char and string variables similarly
      String userString;
      char userChar;
      
      
      
      // FIXME (1): Finish reading other items into variables, then output the four values on a single line separated by a space
      System.out.print("Enter a double: ");
      userDouble = scnr.nextDouble();
      System.out.print("Enter an integer: ");
      userInt = scnr.nextInt();
      System.out.print("Enter a character: ");
      userChar = scnr.next().charAt(0);
      System.out.print("Enter a string: ");
      userString = scnr.next();

      System.out.println(userDouble + " " + userInt + " " + userChar + " " + userString);
      // FIXME (2): Output a line where the character is added on both sides of the String
      System.out.println(userChar + "" + userString + "" + userChar);
      // FIXME (3): Divide the double by the integer
      double result = userDouble / userInt;
      System.out.println(userDouble + "/" + userInt + "=" + result);
      // FIXME (4): Cast the double to an integer and do the same operation as integer division
      int i = (int)userDouble;
      System.out.println(i + "/" + userInt + "=" + (i / userInt));
   }
}