///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           MinMaxAvg
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

public class MinMaxAvg
{
    int minVal = -9999;
    int maxVal = 9999;
    int sumVal = 0;
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_OF_INPUTNUM = 10;
        int[] numberForTest = new int[NUM_OF_INPUTNUM];
        int i;
        int minVal;
        int maxVal;
        int sumVal = 0;
        double averageNum;

        for (i = 0; i < numberForTest.length; ++i) {
            numberForTest[i] = scnr.nextInt();    
        }

        for(i = 1; i < 2; ++i){
            minVal = numberForTest[i];
            maxVal = numberForTest[i];
            for (i = 0; i < 10; ++i) {
                if (numberForTest[i] < minVal) {
                    minVal = numberForTest[i];
                }

                if (numberForTest[i] > maxVal) {
                    maxVal = numberForTest[i];
                }

                sumVal += numberForTest[i];
            }
            averageNum = sumVal / 10.0;
            System.out.println(minVal + " " + maxVal + " " + averageNum);
        }
        
        


    }
}