import java.util.Scanner;


public class Calendar {
    /**
     * This class contains the entire program to print out a yearly calendar.
     *
     * @author Jim Williams
     * @author Shi Kaiwen
     */
	public static void tc(char c3, int c4) {
		for (int pie = 0; pie < c4; pie++) {
			System.out.print(c3);
		}
	}
	/**
	 * TODO this really should be in a method header JavaDoc comment rather than
	 * hidden in the method. Every year that is exactly divisible by four is a leap
	 * year, except for years that are exactly divisible by 100, but these centurial
	 * years are leap years if they are exactly divisible by 400. For example, the
	 * years 1700, 1800, and 1900 are not leap years, but the years 1600 and 2000
	 * are. https://en.wikipedia.org/wiki/Leap_year
	 * 
	 * @param	leapYearTest	Boolean Variable that output whether the year user input is 
	 * 							leap year or not
	 * @param	inputYear 	    receive user year input
	 * @return 	whether the year user input is leap year or not
	 */
	public static boolean leapYearTest(int inputYear) {
		boolean leapYearTest = false;
		if (inputYear % 4 == 0) {
			if (inputYear % 100 == 0) {
				if (inputYear % 400 == 0) {
					leapYearTest = true;
				} else {
					leapYearTest = false;
				}
			} else {
				leapYearTest = true;
			}

		} else {
			leapYearTest = false;
		}
		return leapYearTest;
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
			if (leapYearTest(year)) {
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
     * This method is used for printing a calendar with method name "PostCalendar"
     * @param n
     * @param h
     * @param it
     */

	public static void PostCalender(String day, int h) {
		final int TOTAL_WIDTH = 28;
		final char MONTH_HEADER_LINE_CHAR = '-';

		System.out.println();
		String it = day + " " + h;
		int spacesBefore = (TOTAL_WIDTH - it.length()) / 2;
		tc(' ', spacesBefore);
		System.out.println(it);
		tc(MONTH_HEADER_LINE_CHAR, TOTAL_WIDTH);
		System.out.println();
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
	}
    /**
     *  
     */
	public static void PostDayNum(int weekDay, int maxDayNum) {
		final char CHAR_BETWEEN_DAYS = ' ';
		final int DAYS_IN_A_WEEK = 7;
		final int LOWEST_SINGLE_DIGIT_DAY = 1;
		final int HIGHEST_SINGLE_DIGIT_DAY = 9;

		tc(CHAR_BETWEEN_DAYS, weekDay * 4);
		for (int dayNum = 1; dayNum <= maxDayNum; dayNum++) {
			if (dayNum >= LOWEST_SINGLE_DIGIT_DAY && dayNum <= HIGHEST_SINGLE_DIGIT_DAY) {
				tc(CHAR_BETWEEN_DAYS, 2);
			} else {
				tc(CHAR_BETWEEN_DAYS, 1);
			}
			System.out.print(dayNum);
			tc(CHAR_BETWEEN_DAYS, 1);
			da++;
			if (da % DAYS_IN_A_WEEK == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

	/**
	 * This prompts for the year and the day of the week of January 1st and then
	 * prints out a calendar for the entire year.
	 *
	 * @param 
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
			p(monthName, year);

			int daysInMonth = getDaysInMonth(month, year);
			d2(startDay, daysInMonth);

			startDay = (startDay + daysInMonth) % DAYS_IN_A_WEEK;
		}
	}
}
