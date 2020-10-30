///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           BinaryToDecimal
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

public class BinaryToDecimal
{
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int BINARY_DIGIT = 8;
        int[] biToDeciConvert = new int[BINARY_DIGIT];
        int i;
        int twosSquare = 7;
        int storeResult = 0;
        
        for (i = 0; i < biToDeciConvert.length; ++i) {
            biToDeciConvert[i] = scnr.nextInt();
        }

        for (i = 0; i < 8; ++i){
            storeResult += biToDeciConvert[i] * (int)Math.pow(2, twosSquare);
            twosSquare -= 1;
        }

        System.out.println(storeResult);
    }
}
