package ma1;
import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		System.out.print("Enter a month (1-12): ");
		int month = input.nextInt(); 
		input.close();
//		error handling to check that the month is within the range 1-12
		if (month > 12 || month < 1) {
			System.out.println("Month entered must be between 1 & 12.");
		}
		else {
//			checks whether the year entered is a leap year. if it is, 1 is added, if it is not, 0 is added.
			int isLeap = (year % 4 == 0 ? 1 : 0) - (year % 100 == 0 ? 1 : 0) + (year % 400 == 0 ? 1 : 0);        
	    	int daysInMonth = 0;
//	    	if the month entered is not 2, the days in the month are calculated.
	    	if (month != 2) { 
	    		daysInMonth = 31 - (((month - 1) % 7) % 2);
	    	}
//	    	if the month entered is 2, 28 is the default. If the year is a leap year, 1 is added as per the checks.
	    	else {
	    		daysInMonth = 28 + isLeap;
	    	}
	    	System.out.println(daysInMonth + " days");
		}
	}
}
