package ma2;
import java.util.*;
public class Q3 {
	
//	method checks the total points by iterating over the array of characters
//	it adds 3 for each 'W' in the string and 1 for each 'D' in the string
	public static int totalPoints(String lowResults, int total) {
		char[] charArray = lowResults.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];
			if (ch == 'w') {
				total+= 3;
			}
			else if (ch == 'd') {
				total += 1;
			}
		}
		return total;
	}
	
//	method converts the total from integer to double and returns the average by 
//	dividing the total by the length of the string entered
	public static double averagePoints(String lowResults, int total, int lengthR) {
		double dTotal = totalPoints(lowResults, total);
		return dTotal/lengthR;
	}
	
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string representing any number of wins, draws and losses e.g. \"WWDLDL\": ");
		String results = input.nextLine();
		input.close();
		String lowResults = results.toLowerCase();
		int lengthR = results.length();
		int total=0;
		
//		checks that the string entered contains only the characters 'W', 'D' or 'L'
		if (lowResults.matches("^[wdl]+$")) {
		System.out.println("Total points: "+ totalPoints(lowResults, total));
			if (totalPoints(lowResults, total) >= 15) {
				System.out.println("that's a lot of points :o");
			}
		System.out.println("Average points: " + averagePoints(lowResults, total, lengthR));
			if (averagePoints(lowResults, total, lengthR)>=1.5) {
				System.out.println("hey that's pretty good!");
			}
		}
		else {
			System.out.println("Invalid format :( enter again.");
		}
	}
}
