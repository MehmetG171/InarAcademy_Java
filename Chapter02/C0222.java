package PackageChapter02;

import java.util.Scanner;

public class C0222 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an amount of money whose last two digits represent the cents.");
		System.out.println("For example; 1156 represents 11 dollars and 56 cents.");
		int amount = input.nextInt();

		int NumberOfOneDollars = amount / 100;
		int RemainingAmount = amount % 100;

		int NumberOfQuarters = RemainingAmount / 25;
		RemainingAmount = RemainingAmount % 25;

		int NumberOfDimes = RemainingAmount / 10;
		RemainingAmount = RemainingAmount % 10;

		int NumberOfNickels = RemainingAmount / 5;
		RemainingAmount = RemainingAmount % 5;

		int NumberOfPennies = RemainingAmount;

		System.out.println("Your amount " + amount + " consists of");
		System.out.println(" " + NumberOfOneDollars + " dollars");
		System.out.println(" " + NumberOfQuarters + " quarters ");
		System.out.println(" " + NumberOfDimes + " dimes");
		System.out.println(" " + NumberOfNickels + " nickels");
		System.out.println(" " + NumberOfPennies + " pennies");
		
		input.close();
	}
}
