package PackageChapter02;

import java.util.Scanner;

public class C0206 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number between 0 and 1000 :");
		int number = input.nextInt();

		int birler = number % 10;
		int onlar = (number / 10) % 10;
		int yuzler = number / 100;
		int toplam = birler + onlar + yuzler;

		System.out.println("The sum of digits is " + toplam);
		
		input.close();
	}
}
