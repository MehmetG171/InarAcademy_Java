package PackageChapter04;

import java.util.Scanner;

public class C0414 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a letter grade:");
		char letterGrade = input.next().charAt(0);

		switch (letterGrade) {
		case 'A':
			System.out.println("The numeric value for grade A is 4");
			break;
		case 'B':
			System.out.println("The numeric value for grade B is 3");
			break;
		case 'C':
			System.out.println("The numeric value for grade C is 2");
			break;
		case 'D':
			System.out.println("The numeric value for grade D is 1");
			break;
		case 'F':
			System.out.println("The numeric value for grade F is 0");
			break;
		default:
			System.out.println(letterGrade + " is an invalid grade");
		}

		input.close();
	}
}
