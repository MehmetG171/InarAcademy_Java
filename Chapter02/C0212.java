package PackageChapter02;

import java.util.Scanner;

public class C0212 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("One birth every 7 seconds.");
		System.out.println("One death every 13 seconds.");
		System.out.println("One new immigrant every 45 seconds.");
		System.out.println("The current population is 312,032,486");
		System.out.println("Enter the number of years :");
		int year0 = input.nextInt();
		
		int TotalSecondsInYear = 365 * 24 * 60 * 60;
		int TotalBirthInYear = TotalSecondsInYear / 7;
		int TotalDeathInYear = TotalSecondsInYear / 13;
		int TotalImmigrantInYear = TotalSecondsInYear / 45;
		int year1 = 312032486 + (TotalImmigrantInYear + TotalBirthInYear - TotalDeathInYear) * year0;

		System.out.println("The population after " + year0 + " years is " + year1);
		
		input.close();
	}
}