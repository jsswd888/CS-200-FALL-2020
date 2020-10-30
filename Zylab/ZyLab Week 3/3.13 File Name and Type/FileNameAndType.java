///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           descriptive title of the program making use of this file
// Course:          course number, term, and year
//
// Author:          kaiwen shi
// Email:           kshi42@wisc.edu email address
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

public class FileNameAndType {
	
	public static void main(String[] args) {
	   Scanner scnr = new Scanner(System.in);
	   String file1 = scnr.nextLine();
	   String gotFileName1 = getFileName(file1);
	   String gotFileType1 = getFileType(file1);
	   
	   String file2 = scnr.nextLine();
	   String gotFileName2 = getFileName(file2);
	   String gotFileType2 = getFileType(file2);
	   
	   String file3 = scnr.nextLine();
	   String gotFileName3 = getFileName(file3);
	   String gotFileType3 = getFileType(file3);
	   
	   System.out.print("Name: " + gotFileName1 + ", ");
	   System.out.println("Type: " + gotFileType1);
	   
	   System.out.print("Name: " + gotFileName2 + ", ");
	   System.out.println("Type: " + gotFileType2);
	   
	   System.out.print("Name: " + gotFileName3 + ", ");
	   System.out.println("Type: " + gotFileType3);
	}
	 /**
     * Returns of the name of the file. Hint: look up indexOf and substring in the String Class
     * 
     * @param file The complete file String
     * @return The name of the file
     */
   public static String getFileName(String file) {
      int fileNameDigit = file.indexOf(".");
      String fileName = file.substring(0, fileNameDigit);
      //fileName = fileName.toLowerCase();
      return fileName;
   }

    /**
     * Returns the type of the file as a lower case string. Hint: look up indexOf and substring in the String Class
     * 
     * @param file The complete file String
     * @return The type of the file
     */
   public static String getFileType(String file) {
      int fileTypeDigit = file.indexOf(".");
      String fileType = file.substring(fileTypeDigit + 1);
      fileType = fileType.toLowerCase();
      return fileType; 
   }
     /**
     * Runs tests on the testGetFileName method.
     */
   public static void testGetFileName() {
      System.out.println(getFileName("Homework.txt"));
      System.out.println(getFileName("Homework.pdf"));
      System.out.println(getFileName("Homework.doc"));
   }

    /**
     * Runs tests on the testGetFileType method.
     */
   public static void testGetFileType() {
      System.out.println(getFileType("Homework.txt"));
      System.out.println(getFileType("Homework.pdf"));
      System.out.println(getFileType("Homework.doc"));
   }
   
   
}
