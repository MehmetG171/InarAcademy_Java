package PackageChapter10;

import java.util.Scanner;

public class TestBMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a name:");
		String name = input.nextLine();
		System.out.println("Enter an age:");
		int age = input.nextInt();
		System.out.println("Enter weight in pounds:");
		double weight = input.nextDouble();
		System.out.println("Enter feet:");
		double feet = input.nextDouble();
		System.out.println("Enter inches:");
		double inches = input.nextDouble();

		BMI bmi = new BMI(name, age, weight, feet, inches);

		System.out.println("Name: " + bmi.getName());
		System.out.println("Age: " + bmi.getAge());
		System.out.println("BMI: " + bmi.computeBMI());
		System.out.println("Status: " + bmi.Status());

		input.close();
	}
}
