package PackageChapter02;

import java.util.Scanner;

public class C0207 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of minutes : ");
		double minutes = input.nextDouble();
		int years = (int) (minutes / 60 / 24 / 365);
		int days = (int) (minutes % 525600) / 1440;

		System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
		
		input.close();
	}
}
