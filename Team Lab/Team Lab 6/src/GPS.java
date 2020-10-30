import java.util.Scanner;

public class GPS {
	public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
		
		//Problem 1: uncomment the next line to always have the same input to the program.
		//Scanner scnr = new Scanner("456\nMain St.\n");
		
        int streetNumber = 0;
        String streetName = "";
        String streetName1 = "";
        boolean haveNumber = false;
        do {
            System.out.print("Enter street number:");
            if (scnr.hasNextInt()) {
                streetNumber = scnr.nextInt();
                haveNumber = true;
                System.out.print("Enter street name:");
                streetName = scnr.next();
                streetName1 = scnr.nextLine();
                
            } else {
                System.out.println("Error, not a number");
                break;
            }
        } while (!haveNumber);
        System.out.println("Address: " + streetNumber + " " + streetName + " " + streetName1);   
    }
}
