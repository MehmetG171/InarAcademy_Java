package PackageChapter07;

import java.util.Scanner;

public class C0704 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the scores from 0 to 100:");
		System.out.println("(If the score is out of range, the process will be terminated.)");

		int[] grades = new int[100];

		int score = 0;
		int i = 0;
		int total = 0;
		double average;

		while (0 <= score && score <= 100) {
			score = input.nextInt();
			total = total + score;
			grades[i] = score;
			i++;
		}
		i = i - 1;
		total = total - score;
		average = (double) (total / i);

		int countAbove = 0;
		int countBelow = 0;
		for (int j = 0; j < i; j++) {
			if (grades[j] < average) {
				countBelow++;
			} else {
				countAbove++;
			}
		}

		System.out.println("The number of scores above the average: " + countAbove);
		System.out.println("The number of scores below the average: " + countBelow);
		input.close();
	}
}
