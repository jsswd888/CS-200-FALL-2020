///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           DrawHalfArrow
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

public class DrawHalfArrow {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int arrowBaseHeight = 0;
        int arrowBaseWidth  = 0;
        int arrowHeadWidth = 0;

        int i = 0;
        int j = 0;

        System.out.print("Enter arrow base height: ");
        arrowBaseHeight = scnr.nextInt();

        System.out.print("Enter arrow base width: ");
        arrowBaseWidth = scnr.nextInt();

        System.out.print("Enter arrow head width: ");
        arrowHeadWidth = scnr.nextInt();

        //make sure arrow head width is larger than base width
        while (arrowHeadWidth <= arrowBaseWidth) {
            System.out.print("Enter arrow head width: ");
            arrowHeadWidth = scnr.nextInt();
        }
        System.out.println("");

        //draw arrow base
        for (i = 0; i < arrowBaseHeight; i++) {
            for (j = 0; j < arrowBaseWidth; j++) {
                System.out.print("*");
            }
            System.out.println();
        } 
        //draw arrow head
        for (i = 0; i < arrowHeadWidth; i++) {
            for (j = arrowHeadWidth; j>i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
