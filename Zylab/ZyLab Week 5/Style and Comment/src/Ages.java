///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           MessedUp.java for coding exercise
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
public class Ages {
	public static void main(String[] args) {
        int johnAge = 5;
        int mattAge= 10;
        int sarahAge = 14;
        int emilyAge = 6;

        System.out.println("Ages of John " + johnAge + ", Matt " + mattAge + ", Sarah " + sarahAge + ", Emily " + emilyAge);
        int averageAgeBefore = (int)getAverageAge(5, 10, 14, 6);
        System.out.println(averageAgeBefore);

        johnAge = getNextAge(johnAge);
        mattAge = getNextAge(mattAge);
        sarahAge = getNextAge(sarahAge);
        emilyAge = getNextAge(emilyAge);

        System.out.println("Ages next year of John " + johnAge + ", Matt " + mattAge + ", Sarah " + sarahAge + ", Emily " + emilyAge);
        int averageAgeAfter = (int)getAverageAge(johnAge, mattAge, sarahAge, emilyAge);
        System.out.println(averageAgeAfter);
        
    }

    public static int getNextAge(int age){
        int nextAge = age+1;
        return nextAge;
    }

    public static double getAverageAge(int age1, int age2, int age3, int age4){
        double averageAge = (age1+age2+age3+age4)/4.0;
        return averageAge;
    }
}
