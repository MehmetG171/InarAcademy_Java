package PackageChapter02;

import java.util.Scanner;

public class C0203 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Feet into meters conversion.");
		System.out.println("Enter the feet value :");
		double feet = input.nextDouble();
		double meters = feet * 0.305;

		System.out.println(feet + " feet is " + meters + " meters");
		
		input.close();
	}
}
