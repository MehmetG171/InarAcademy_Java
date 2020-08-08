package PackageChapter05;

import java.util.Scanner;

public class C0509 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number of students :");
		int NumberOfStudents = input.nextInt();

		int limit = NumberOfStudents * 2;
		double HighScore = -1;
		double SecondHighScore = -2;

		String HighName = "";
		String SecondHighName = "";

		while (NumberOfStudents < limit) {

			System.out.println("Enter the name of student:");
			String NameOfStudent = input.next();

			System.out.println("Enter the score of student:");
			double ScoreOfStudent = input.nextDouble();

			if (HighScore < ScoreOfStudent) {
				SecondHighName = HighName;
				SecondHighScore = HighScore;
				HighName = NameOfStudent;
				HighScore = ScoreOfStudent;
			}

			NumberOfStudents++;

		}

		System.out.println(HighName + " is in the 1. place with " + HighScore + " score.");
		System.out.println(SecondHighName + " is in the 2. place with " + SecondHighScore + " score.");

		input.close();

	}
}
