package PackageChapter03;

import java.util.Scanner;

public class C0306 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter weight in pounds:");
		double weightPounds = input.nextDouble();
		System.out.println("Enter feet:");
		double HeightFeet = input.nextDouble();
		System.out.println("Enter inches:");
		double HeightInches = input.nextDouble();

		double weightKilograms = weightPounds * 0.45359237;
		double HeightMeters = (HeightFeet * 12 + HeightInches) * 0.0254;
		double bmi = (weightKilograms) / (HeightMeters * HeightMeters);

		System.out.println("BMI is " + bmi);

		if (bmi < 18.5) {
			System.out.println("Underweight");
		} 
		else if (bmi < 25) {
			System.out.println("Normal");
		} 
		else if (bmi < 30) {
			System.out.println("Overweight");
		} 
		else {
			System.out.println("Obese");
		}

		input.close();
	}

}
