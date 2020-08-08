package PackageChapter02;

import java.util.Scanner;

public class C0213 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the monthly saving amount : ");
		double saving = input.nextDouble();

		double year1 = saving * (1 + 0.05 / 12);
		double year2 = (saving + year1) * (1 + 0.05 / 12);
		double year3 = (saving + year2) * (1 + 0.05 / 12);
		double year4 = (saving + year3) * (1 + 0.05 / 12);
		double year5 = (saving + year4) * (1 + 0.05 / 12);
		double year6 = (saving + year5) * (1 + 0.05 / 12);

		System.out.println("After sixth month, the account value is " + year6);
		
		input.close();
	}
}
