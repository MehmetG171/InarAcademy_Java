package PackageChapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class C1112 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Double> numbers = new ArrayList<>();

		System.out.println("Enter 5 numbers:");

		for (int i = 0; i < 5; i++) {
			numbers.add(input.nextDouble());
		}

		System.out.println("The sum is " + sum(numbers));

		input.close();
	}

	public static double sum(ArrayList<Double> list) {
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum = sum + list.get(i);
		}
		return sum;
	}
}
