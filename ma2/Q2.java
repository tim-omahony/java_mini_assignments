package ma2;
import java.util.*;
public class Q2 {
	
//	method to check that the length of the password is valid
	public static boolean strLength(int pWordLength) {
		if (pWordLength > 10) {
			return true;
		}
		return false;
	}
	
//	method to check that the password is alphanumeric and doesn't contain any special characters
	public static boolean alphaNum(String pWord) {
		String pWordLower = pWord.toLowerCase();
		char[] charArray = pWordLower.toCharArray();
//		for loop iterates over the string and checks that each of the characters is either a letter or digit
		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];
			if (!(ch >= 'a' && ch <= 'z') && !(ch >= '0' && ch <= '9')) {
				return false;
			}
		}
        return true;
	}
	
//	method to check that there are at least 3 digits in the password
	public static boolean numDigits(String pWord, int pWordLength) {
		int count=0;
//		for loop iterates over the password string and adds 1 to the count each time a digit is found
		for (int i=0; i<pWordLength; i++) {
			if (Character.isDigit(pWord.charAt(i))) {
				count++;
			}
		}
		if (count >= 3) {
			return true;
		}	
		return false;
	}

	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a password: ");
		String pWord = input.nextLine();
		input.close();
		int pWordLength = pWord.length();
//		valid password only if all 3 methods return "true"
		if (strLength(pWordLength) && alphaNum(pWord) && numDigits(pWord, pWordLength)) {
			System.out.println("Valid Password :)");
		}
//		else condition called if any of the 3 methods return "false"
		else {
			System.out.println("Invalid Password :(");
		}
	}
}
