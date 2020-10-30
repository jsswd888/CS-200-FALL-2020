
///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           FourPerLine
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

public class FourPerLine
{
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_ELEMENTS = 12;
        int [] yearlyValues = new int[NUM_ELEMENTS];
        int i;
        
        for (i = 0; i < yearlyValues.length; ++i) {
            yearlyValues[i] = scnr.nextInt();    
        }

        for(i = 0; i < 12; i += 4){
            System.out.print(yearlyValues[i] + " ");
            System.out.print(yearlyValues[i + 1] + " ");
            System.out.print(yearlyValues[i + 2] + " ");
            System.out.print(yearlyValues[i + 3]);
            System.out.println();
        }
        
        /*
        for (i = 1; i < 13; i ++) {
            yearlyValues[i] = scnr.nextInt();
            if(i % 4 == 0){
                System.out.print(yearlyValues[i]);
                System.out.print('\n');
            }else{
                System.out.print(yearlyValues[i] + " ");
            }
        }
        */
    }
}