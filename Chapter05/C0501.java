package PackageChapter05;

import java.util.Scanner;

public class C0501 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer, the input ends if it is 0:");

		int number = -1;
		int positives = 0;
		int negatives = 0;
		double total = 0;

		while (0 != number) {

			number = input.nextInt();

			if (0 < number) {
				positives++;
			} else if (number < 0) {
				negatives++;
			}
			total = total + number;
		}
		int TotalNumbers = positives + negatives;

		if (TotalNumbers == 0 && number == 0) {
			System.out.println("No numbers are entered except 0.");
		} else {
			System.out.println("The number of positives is " + positives);
			System.out.println("The number of negatives is " + negatives);
			System.out.println("The total is " + total);
			System.out.printf("The average is %.2f", total / TotalNumbers);
		}
		input.close();
	}
}
