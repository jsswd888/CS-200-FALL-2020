///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Calendar
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

/**
 * This class contains the entire program to print out a yearly calendar.
 *
 * @author Jim Williams
 * @author Shi Kaiwen
 */
public class Calendar {
    
    /**
     * This method is a formatConvert. It is been used for aligning texts in the 
     * calendar; basically formatting is through outputing formattingChar in
     * "formattingNum" times.
     * @param formattingChar store value for any characters want to format when using 
     *                       this method
     * @param formattingNum  store value for any numbers want to format when using 
     *                       this method
     * @param compareNum     used in for loop for achieveing the method goal
     */
    public static void formatConvert(char formattingChar, int formattingNum) {
        for (int compareNum = 0; compareNum < formattingNum; compareNum++) {
            System.out.print(formattingChar);
        }
    }

    /** 
	 * Every year that is exactly divisible by four is a leap year, except for years 
     * that are exactly divisible by 100, but these centurial years are leap years 
     * if they are exactly divisible by 400. For example, the years 1700, 1800, 
     * and 1900 are not leap years, but the years 1600 and 2000 are. 
     * https://en.wikipedia.org/wiki/Leap_year
     * @param	leapYearTestResult  Boolean Variable that output whether the year user 
     *                              input is leap year or not
	 * @param	inputYear 	        received user year input for judgement
	 * @return 	whether the year user input is leap year or not
	 */    
	public static boolean leapYearTestResult(int inputYear) {
		boolean leapYearTestResult = false;
		if (inputYear % 4 == 0) {
			if (inputYear % 100 == 0) {
				if (inputYear % 400 == 0) {
					leapYearTestResult = true;
				} else {
					leapYearTestResult = false;
				}
			} else {
				leapYearTestResult = true;
			}

		} else {
			leapYearTestResult= false;
		}
		return leapYearTestResult;
	}

	/**
	 * This returns the number of days in the specified month of year.
	 *
	 * @param month The month to return the number of days.
	 * @param year  The year is used for determining whether it is a leap year.
	 * @return The number of days in the specified month of the year.
	 */
	public static int getDaysInMonth(int month, int year) {
		int daysInMonth = 0;
		switch (month) {
		// 31 days
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			daysInMonth = 31;
			break;

		// 30 days
		case 4:
		case 6:
		case 9:
		case 11:
			daysInMonth = 30;
			break;

		case 2: // 28 or 29 days
			if (leapYearTestResult(year)) {
				daysInMonth = 29;
			} else {
				daysInMonth = 28;
			}
			break;
		}
		return daysInMonth;
	}

	/**
	 * Returns the name of the month, given the number of the month.
	 *
	 * @param month The month where 1 is January and 12 is December.
	 * @return The name of the month.
	 */
	public static String getMonthName(int month) {
		String monthStr;
		switch (month) {
		case 1:
			monthStr = "January";
			break;
		case 2:
			monthStr = "February";
			break;
		case 3:
			monthStr = "March";
			break;
		case 4:
			monthStr = "April";
			break;
		case 5:
			monthStr = "May";
			break;
		case 6:
			monthStr = "June";
			break;
		case 7:
			monthStr = "July";
			break;
		case 8:
			monthStr = "August";
			break;
		case 9:
			monthStr = "September";
			break;
		case 10:
			monthStr = "October";
			break;
		case 11:
			monthStr = "November";
			break;
		case 12:
			monthStr = "December";
			break;
		default:
			monthStr = "UNKNOWN";
			break;
		}
		return monthStr;
	}
    
    /**
     * This method is formating basic headers in each months' calendar: which month,
     * which year, seperate lines from Header and date, and marknig of Mondat to Sunday.
     * @param yearInHeader              shows which year calendar represents
     * @param blankSpacesBeforeText     formating the calendar header to make it in the middle
     * @param calendarHeader            connecting month and year to display in the header line
     */
	public static void calendarHeader(String monthInHeader, int yearInHeader) {
		final int TOTAL_WIDTH = 28;
		final char MONTH_HEADER_LINE_CHAR = '-';

		System.out.println();
		String calendarHeader = monthInHeader + " " + yearInHeader;
		int blankSpacesBeforeText = (TOTAL_WIDTH - calendarHeader.length()) / 2;
		formatConvert(' ', blankSpacesBeforeText);
		System.out.println(calendarHeader);
		formatConvert(MONTH_HEADER_LINE_CHAR, TOTAL_WIDTH);
		System.out.println();
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
	}

    /**
     * This method is for displaying every dates in calendar
     * @param dayNum        used for deciding which date(Mon-Sun) to start, and then fill number
     *                      into Calendar;
     * @param dayNumFormatter       used for counting position of dayNum, and then used 
     *                              for format calendar
     * @param totalDaysPerMonth used for comparing with dayNum, check whether specific month's 
     *                          calendar has reached end.
     */
	public static void daysInCalendar(int dayNumFormatter, int totalDaysPerMonth) {
		final char CHAR_BETWEEN_DAYS = ' ';
		final int DAYS_IN_A_WEEK = 7;
		final int LOWEST_SINGLE_DIGIT_DAY = 1;
		final int HIGHEST_SINGLE_DIGIT_DAY = 9;

		formatConvert(CHAR_BETWEEN_DAYS, dayNumFormatter * 4);
		for (int dayNum = 1; dayNum <= totalDaysPerMonth; dayNum++) {
			if (dayNum >= LOWEST_SINGLE_DIGIT_DAY && dayNum <= HIGHEST_SINGLE_DIGIT_DAY) {
				formatConvert(CHAR_BETWEEN_DAYS, 2);
			} else {
				formatConvert(CHAR_BETWEEN_DAYS, 1);
			}
			System.out.print(dayNum);
			formatConvert(CHAR_BETWEEN_DAYS, 1);
			dayNumFormatter++;
			if (dayNumFormatter % DAYS_IN_A_WEEK == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

	/**
	 * This prompts for the year and the day of the week of January 1st and then
	 * prints out a calendar for the entire year.
	 *
	 * @param year      receieve user input for year
     * @param startDay  receive user input of the day of start day
     * @param daysInMonth used for record and show how many days in particular month
     * @param monthName   used for record and show month name for specific month calendar 
	 */
	public static void main(String[] args) {
		final char FIRST_MONTH = 1;
		final char LAST_MONTH = 12;
		final int DAYS_IN_A_WEEK = 7;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter year:");
		int year = input.nextInt();
		System.out.print("Enter day of week of Jan 1 (0-Sunday, 1-Monday, etc):");
		int startDay = input.nextInt();

		for (int month = FIRST_MONTH; month <= LAST_MONTH; ++month) {
			String monthName = getMonthName(month);
			calendarHeader(monthName, year);

			int daysInMonth = getDaysInMonth(month, year);
			daysInCalendar(startDay, daysInMonth);

			startDay = (startDay + daysInMonth) % DAYS_IN_A_WEEK;
		}
	}
}
