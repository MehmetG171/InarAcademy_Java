package PackageChapter05;

import java.util.Scanner;

public class C0508 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number of students :");
		int NumberOfStudents = input.nextInt();

		int limit = NumberOfStudents * 2;
		double highscore = -1;

		String highName = "";

		while (NumberOfStudents < limit) {

			System.out.println("Enter the name of student:");
			String NameOfStudent = input.next();

			System.out.println("Enter the score of student:");
			double ScoreOfStudent = input.nextDouble();

			if (highscore < ScoreOfStudent) {
				highName = NameOfStudent;
				highscore = ScoreOfStudent;
			}

			NumberOfStudents++;

		}

		System.out.println(highName + " is in the 1. place with " + highscore + " score.");

		input.close();
	}

}
