package PackageChapter02;

import java.util.Scanner;

public class C0214 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Health application: computing Body Mass Index (BMI)");
		System.out.println("Enter weight in pounds:");
		double weight = input.nextDouble();
		System.out.println("Enter height in inches:");
		double height = input.nextDouble();

		double kg = weight * 0.45359237;
		double m = height * 0.0254;
		double bmi = kg / (m * m);

		System.out.println("BMI is " + bmi);
		
		input.close();
	}
}
