package ma2;
import java.util.*;
public class Q1 {
//	method calculates the future value of the investment using formula given
	public static double futureVal(double amount, double monthlyRate, int years) {
		double monthlyRatePow = Math.pow(1 + monthlyRate, years * 12);
		return amount * monthlyRatePow;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an investment amount: ");
		double amount = input.nextDouble();
		System.out.print("Enter annual percentage interest rate: ");
		double apr = input.nextDouble();
		input.close();
		double monthlyRate = apr/1200;
		int years = 30;
		
//		conditionals check whether the amount entered is valid
		if (amount < 0) {
			System.out.println("Amount must be greater than 0.");
		}
		else {
			System.out.println("Years      Value");
			for (int i = 1; i <= years; i++) {
				double fVal = futureVal(amount, monthlyRate, i);
				System.out.println(i + String.format("         %.2f", fVal));
			}
		}
	}
}
