package PackageChapter02;

import java.util.Scanner;

public class C0205 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the a subtotal and a gratuity rate : ");
		double subtotal = input.nextDouble();
		double rate = input.nextDouble();

		double gratuity = (subtotal * rate) / 100;
		double total = gratuity + subtotal;

		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
		
		input.close();
	}
}
