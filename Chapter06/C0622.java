package PackageChapter06;

import java.util.Scanner;

public class C0622 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer:");
		long n = input.nextLong();

		double result = sqrt(n);
		System.out.printf("The square root of %d is approximately equal to %.3f", n, result);

		input.close();
	}

	public static double sqrt(long n) {
		double LastGuess = -1;
		double NextGuess = 1;
		while (Math.abs(LastGuess - NextGuess) > 0.0001) {
			LastGuess = NextGuess;
			NextGuess = (LastGuess + n / LastGuess) / 2;
		}
		return NextGuess;
	}
}
