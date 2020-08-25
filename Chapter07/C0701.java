package PackageChapter07;

import java.util.Scanner;

public class C0701 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of students:");
		int number = input.nextInt();
		System.out.println("Enter " + number +" scores:");

		int[] grades = new int[number];

		for (int i = 0; i < grades.length; i++) {
			int score = input.nextInt();
			grades[i] = score;
		}
		int best = -1;
		for (int j = 0; j < grades.length; j++) {
			if (grades[j] > best) {
				best = grades[j];
			}
		}

		for (int k = 0; k < grades.length; k++) {
			if (best - 10 <= grades[k]) {
				System.out.println("Student " + k + " score is " + grades[k] + " and grade is A.");
			} else if ((best - 20 <= grades[k]) && (grades[k] < best - 10)) {
				System.out.println("Student " + k + " score is " + grades[k] + " and grade is B.");
			} else if ((best - 30 <= grades[k]) && (grades[k] < best - 20)) {
				System.out.println("Student " + k + " score is " + grades[k] + " and grade is C.");
			} else if ((best - 40 <= grades[k]) && (grades[k] < best - 30)) {
				System.out.println("Student " + k + " score is " + grades[k] + " and grade is D.");
			} else {
				System.out.println("Student " + k + " score is " + grades[k] + " and grade is F.");
			}
		}
		input.close();
	}
}
