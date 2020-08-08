package PackageChapter04;

import java.util.Scanner;

public class C0426 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an amount in double, for example 11.56: ");
		String amount = input.nextLine();

		String numberOfOneDollars = amount.substring(0, amount.indexOf(','));
		int decimal = Integer.parseInt(amount.substring(amount.indexOf(',') + 1));

		int numberOfQuarters = decimal / 25;
		decimal = decimal % 25;

		int numberOfDimes = decimal / 10;
		decimal = decimal % 10;

		int numberOfNickels = decimal / 5;
		decimal = decimal % 5;

		int numberOfPennies = decimal;

		System.out.println("Your amount $" + amount + " consists of");
		System.out.println(" " + numberOfOneDollars + " dollars");
		System.out.println(" " + numberOfQuarters + " quarters ");
		System.out.println(" " + numberOfDimes + " dimes");
		System.out.println(" " + numberOfNickels + " nickels");
		System.out.println(" " + numberOfPennies + " pennies");

		input.close();
	}
}
