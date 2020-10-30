///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           PigLatinator
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

public class PigLatinator {

    /**
     * Takes a character array and arranges the characters into it's pig-latin form
     *
     * If a word starts with a consonant, use the startsConsonant method. If a word
     * starts with a vowel, use the startsVowel method. If a word contains no
     * vowels, use the startsConsonant method. Hint: Use your isVowel method to cut
     * down on repetitive code
     *
     * Example: char[] input = {'h', 'e', 'l', 'l', 'o'} gives char[] output = {'e',
     * 'l', 'l', 'o', '-', 'h', 'a', 'y'} char[] input = {'f', 'l', 'a', 'r', 'e'}
     * gives char[] output = {'a', 'r', 'e', '-', 'f', 'l', 'a', 'y'} char[] input =
     * {'i', 't'} gives char[] output = {'i', 't', '-', 'y', 'a', 'y'} char[] input
     * = {'s', 'h', 'h'} gives char[] output = {'s', 'h', 'h', '-', 'a', 'y'}
     * 
     *
     * @param input The char array to rearrange to pig-latin.
     * @return A new char array containing the pig-latin of input. If input is null,
     *         return null.
     */
    public static char[] pigLatin(char[] input) {
        if (input != null) {
            char a = input[0];
            boolean vowelOrNot = isVowel(a);
            if (vowelOrNot == true) {
                return startsVowel(input);
            } else {
                return startsConsonant(input);
            }
        } else {
            return null;
        }
    }

    /**
     * This method is to transform words that begin with a consonant into pig-latin.
     * If a word starts with a consonant, search through the word beginning at index
     * 0 for the first instance of a vowel. Split the array at this vowel, moving
     * the consonants to the back of the array, following a '-'. The add 'ay' at the
     * end of the word. If a word contains no vowels, just add "ay" at the end of
     * the word following a '-'. NOTE: Do not use string methods to rearrange your
     * arrays; you should use the indexes
     * 
     * @param input - The char array to rearrange to pig-latin.
     * @return A new char array containing the pig-latin of input.
     */
    public static char[] startsConsonant(char[] input) {
        if (input != null) {
            int b = 0;

            while (!isVowel(input[b]) && b < input.length) {
                b++;
            }
            if (b == input.length) {
                char[] output = new char[input.length + 4];
                output[input.length - 1] = '-';
                output[input.length + 1] = 'a';
                output[input.length + 1] = 'y';

                return output;
            } else {
                if (b > 1) {
                    char[] output = new char[input.length + 3];

                    int i;

                    for (i = 0; i < input.length - b; ++i) {
                        output[i] = input[b + i];
                    }

                    output[input.length - b] = '-';

                    for (i = 0; i < b; i++) {
                        output[input.length + i - 1] = input[i];
                    }

                    output[input.length + b - 1] = 'a';
                    output[input.length + b] = 'y';
                    return output;
                } else {
                    char[] output = new char[input.length + 3];
                    int i;

                    for (i = 0; i < input.length - b; ++i) {
                        output[i] = input[b + i];
                    }

                    output[input.length - b] = '-';

                    for (i = 0; i < b; i++) {
                        output[input.length + i] = input[i];
                    }

                    output[input.length + b] = 'a';
                    output[input.length + b + 1] = 'y';

                    return output;
                }
            }
        }

        else {

            return null;
        }
    }

    /**
     * This method is to transform words that begin with a vowel into pig-latin. If
     * a word starts with a vowel add the word "yay" at the end of the word
     * following a '-'. NOTE: Do not use string methods to rearrange your arrays;
     * you should use the indexes
     * 
     * @param letter, the letter being checked if it is a vowel
     * @return A new char array containing the pig-latin of input.
     */

    public static char[] startsVowel(char[] input) {
        if (input != null) {
            char[] output = new char[input.length + 4];
            int i;
            for (i = 0; i < input.length; i++) {
                output[i] = input[i];
            }
            output[i] = '-';
            output[i + 1] = 'y';
            output[i + 2] = 'a';
            output[i + 3] = 'y';

            return output;
        } else {
            return null;
        }
    }

    /**
     * Takes a letter, and checks if it is a vowel, then returns true is yes, false
     * if no.
     * 
     * Vowels are: a, e, i, o, u (Note: We are not considering y for this program.)
     * 
     * @param letter, the letter being checked if it is a vowel
     * @return A boolean, true if letter is vowel, otherwise false
     */
    public static boolean isVowel(char firstLetter) {
        if ((firstLetter == 'a') || (firstLetter == 'e') || (firstLetter == 'i') || (firstLetter == 'o')
                || (firstLetter == 'u')) {
            return true;
        } else {
            return false;

        }
    }

    /**
     * This is test method for the pigLatin() method
     * 
     * This method already contains 3 tests, but you should consider adding more to
     * test different input.
     * 
     */
    public static void testPigLatin() {
        char arr[] = { 'f', 'l', 'a', 'r', 'e' };
        char arr2[] = { 'i', 't' };
        char arr3[] = { 'a', 'm' };
        char arr4[] = { 'p', 'l', 'a', 'n', 'e' };
        char arr5[] = { 'j', 'a', 'c', 'k', 'e', 't' };

        System.out.print("Expected: are-flay\nActual: ");
        System.out.println(pigLatin(arr));
        System.out.print("Expected: it-yay\nActual: ");
        System.out.println(pigLatin(arr2));
        System.out.print("Expected: am-yay\nActual: ");
        System.out.println(pigLatin(arr3));
        System.out.print("Expected: ane-play\nActual: ");
        System.out.println(pigLatin(arr4));
        System.out.print("Expected: acket-jay\nActual: ");
        System.out.println(pigLatin(arr5));

    }

    /**
     * This is the main method of your program. This is where we will call our test
     * method.
     * 
     * @param args
     */

    public static void main(String[] args) {
        testPigLatin();
    }
}