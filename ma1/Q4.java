package ma1;
import java.util.Scanner;
public class Q4 {
//	method which iterates over the strings entered to check for prefixes.
	public static String commonPrefix(String str1, String str2) {
//		checks which string is shorter in order to know how far the for loop must run.
		int minLength = Math.min(str1.length(), str2.length());
	    for (int i = 0; i < minLength; i++) {
	        if (str1.charAt(i) != str2.charAt(i)) {
	            return str1.substring(0, i);
	        }
	    }
	    String subString1 = str1.substring(0, minLength);
	    if (subString1.isEmpty()) {
	    	return "No common prefixes.";
	    }
	    return subString1;
	}
//	main method which prompts the user for 2 strings and calls the commonPrefix method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string 1: ");
		String str1 = input.nextLine();
		System.out.print("Enter string 2: ");
		String str2 = input.nextLine();
		input.close();
		
		System.out.println("String 1: " + str1);
		System.out.println("String 2: " + str2);
		
		System.out.println(commonPrefix(str1, str2));
	}
}
