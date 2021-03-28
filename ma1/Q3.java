package ma1;
import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Guess a number from 1-100: ");
			
//		random number is initialised to variable x using Math.random multiplied by 101 so that 100 is included.
		int x = (int) (Math.random() * 101);

//		endless do while loop started to continue prompting the user for inputs until they guess the correct answer.
		do {
			int guess = input.nextInt();
			if (guess == x) {
				System.out.println("Correct!");
				break;
			}
			else if (guess < x) {
				System.out.println("Too low.");
				System.out.print("Guess a number from 1-100: ");
			}
			else if (guess > x) {
				System.out.println("Too high.");
				System.out.print("Guess a number from 1-100: ");
			}
		}while(true);
		input.close();
	}
}
