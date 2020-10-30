///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           MethodLibrary
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
import java.util.Arrays;
import java.util.Scanner;
/**
 * This class contains some methods that performs certain executions.
 * @author Shi Kaiwen
 */
public class MethodLibrary {
    /**
     * Below is the main method. It displays a method library with various diaplay types
     * by calling different methods to show each method's different functions
     * @param numDisplay    displays how this method display several numbers in 
     *                      inputted series
     * @param characters    displays how this method swap sequences of the array
     * @param bigNumCompare find out the biggest number in the input array
     * @param dataArranging format numbers in input arrays from smallest
     *                      to biggest
     * @param interValTest  test whether input value is in between the given interval
     */
    public static void main(String args[]) {
        System.out.println("MethodLibrary");

        System.out.println("Example use of methods");
        int[] numDisplay = { 2, 1, 7, 4, 3 };
        display("display:", numDisplay);

        char[] characters = { 'a', 'b', 'c', 'd', 'e', 'f' };
        charSequenceChange(characters, 2);
        System.out.print("after charSequenceChange: ");
        System.out.println(characters);

        int[] bigNumsCompare = { 1234, 20001, 3764, 20947, 9099 };
        System.out.println("after numMagnitudeCompare: " + numMagnitudeCompare(bigNumsCompare));

        int[] dataArranging = { 8, 7, 3, 4, 5, 0, 1 };
        dataArranging(dataArranging, true);
        System.out.println("after dataArranging: " + Arrays.toString(dataArranging));

        Scanner inputContext = new Scanner("-5 0 error 25 happy 20 14 end");
        int scannedValue = interValTest(inputContext, "Enter a number between 1 and 20, inclusive", 1, 20);
    }

    /**
     * This method prints the description followed by the contents of . The 
     * begins with '[', ends with ']' and each element is separated with ', '.
     * Example: display( "a description", new int[]{1,2,3}) a description [1, 2, 3]
     * 
     * @param description The text printed out before the  of integers.
     * @param list        The array of integers to be printed.
     */
    public static void display(String description, int[] list) {
        System.out.print(description);
        System.out.print(" [");
        for (int i = 0; i < list.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(list[i]);
        }
        System.out.println("]");
    }

    /**
     * This meyhod is used for swap the last n of characters in the array in front 
     * to the first
     * @param original      char storing original  containing charcaters
     * @param newSequenc    char storing the  after sequence is changed
     * @param numOfChangeNeeded position count from end of char where does it need
     *                          a sequence swap 
     */
    public static void charSequenceChange(char[] original, int numOfChangeNeeded) {
        for (int i = 0; i < numOfChangeNeeded; i++) {
            char newSequence = original[original.length - 1];
            for (int j = original.length - 1; j > 0; j--) {
                original[j] = original[j - 1];
            }
            original[0] = newSequence;
        }
    }
    /**
     * This method is used for comparing which is the biggest num in the input array
     * basically comapre bigger or smaller start with first one: if bigger, write its 
     * values in; the final one left is the biggest num
     * @param biggestNum        used for store the temporary and the final biggest number in 
     *                          the array
     * @param bigNumsCompare    input array contain different numbers
     * @return biggestNum the biggestNum in the input array
     */
    public static int numMagnitudeCompare(int[] bigNumsCompare) {
        int biggestNum;
        biggestNum = bigNumsCompare[0];
        for (int i = 0; i < bigNumsCompare.length; i++) {
            if (bigNumsCompare[i] > biggestNum) {
                biggestNum = bigNumsCompare[i];
            }
        }
        return biggestNum;
    }

    /**
     * This method is used for arranging the data in sequence(from smaller value to bigger)
     * start with first one(it should be call as linear search), compare with second; if 
     * second one is smaller, swap the sequence; repeat this step one by one 
     * @param intermediate  stroing values from one number for doing the swap process
     * @param isSmaller     juding whether the second number is smaller than the first number
     * @param originalDataSequence  stores original sequence of input data and also stores 
     *                              any changes made on number sequences 
     */
    public static void dataArranging(int[] originalDataSequence, boolean isSmaller) {
        int intermediate;
        for (int i = 0; i < originalDataSequence.length; i++) {
            for (int j = i + 1; j < originalDataSequence.length; j++) {
                if (isSmaller) {
                    if (originalDataSequence[i] > originalDataSequence[j]) {
                        intermediate = originalDataSequence[i];
                        originalDataSequence[i] = originalDataSequence[j];
                        originalDataSequence[j] = intermediate;
                    }
                } else {
                    if (originalDataSequence[i] < originalDataSequence[j]) {
                        intermediate = originalDataSequence[i];
                        originalDataSequence[i] = originalDataSequence[j];
                        originalDataSequence[j] = intermediate;
                    }
                }
            }
        }
    }
    /**
     * This method check whether the scanned integer is in the a certain interval
     * if it is not, it will remind user "Value must be between something and something"
     * 
     * @param inputContext          inputted context, used for further scan comparison
     * @param intervalDescription   words describing number intervals for user input
     * @param lowerBound            min number accepted from user input
     * @param upperBound            max number accepted from user input
     * @param scannedValue          scan number from inputContext, used for further 
     *                              comparison
     * @param isInTheInterval       judge whether the value is in between the required
     *                              interval or not
     * @return satisfied or unsatisfied scanned value
     */
    public static int interValTest(Scanner inputContext, String intervalDescription, int lowerBound, int upperBound) {
        System.out.println(intervalDescription);
        boolean isInTheInterval = false;
        int scannedValue = 0;
        do {
            if (inputContext.hasNextInt()) {
                scannedValue = inputContext.nextInt();
                if (scannedValue >= lowerBound && scannedValue <= upperBound) {
                    isInTheInterval = true;
                } else {
                    System.out.println("Value must be between " + lowerBound + " and " + upperBound + ".");
                }
            } else {
                inputContext.next();
            }
        } while (!isInTheInterval);
        return scannedValue;
    }
}
