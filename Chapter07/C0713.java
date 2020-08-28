package PackageChapter07;

import java.util.Scanner;

public class C0713 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the excluding numbers from 1 to 54:");
		System.out.println("(If the score is out of range, the process will be terminated.)");

		int[] numbers = new int[54];
		int exclude = 0;
		int i = 0;

		while (0 <= exclude && exclude <= 54) {
			exclude = input.nextInt();
			numbers[i] = exclude;
			i++;
		}
		i = i - 1;

		int random = getRandom(numbers);
		System.out.println("Random number is " + random);

		input.close();
	}

	public static int getRandom(int... numbers) {
		int randomNumber = (int) (Math.random() * 54 + 1);
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == randomNumber) {
				randomNumber = (int) (Math.random() * 54 + 1);
				i = -1;
			}
		}
		return randomNumber;
	}
}
