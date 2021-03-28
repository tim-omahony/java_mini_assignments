package ma1;
import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number for v (speed): ");
		double v = input.nextDouble();
		
		System.out.print("Enter a number for a (acceleration): ");
		double a = input.nextDouble();
		
		System.out.print("Enter a 'w' or 'd' to indicate whether runway is wet or dry: ");
		char ch = input.next().charAt(0);
		
		input.close();
//		wet and dry conditions are set to a boolean variable in order to use them later in the conditional statements.
		char lower = Character.toLowerCase(ch);
		boolean isWet = lower == 'w';
		boolean isDry = lower == 'd';
			
		double dryLength = (Math.pow(v, 2))/(2*a);
//		wet length is calculated by adding 15% of the dry length to the existing dry length.
		double wetLength = dryLength + (dryLength * 0.15); 
		
		if (isDry) {
			System.out.println("The runway is dry, minimum length is " + dryLength);
		}
		else if (isWet) {
			System.out.println("The runway is wet, minimum length is " + wetLength);
		}
		else {
			System.out.println("Error. Please enter either 'W' or 'D'." );
		}
	}
}
