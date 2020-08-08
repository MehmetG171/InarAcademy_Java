package PackageChapter03;

import java.util.Scanner;

public class C0305 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter today's day:");
		int day = input.nextInt();
		System.out.println("Enter the number of days elapsed since today:");
		int ElapsedDays = input.nextInt();

		int FutureDay = (day + ElapsedDays) % 7;

		switch (day) {
		case 0:
			System.out.print("Today is Sunday");
			break;
		case 1:
			System.out.print("Today is Monday");
			break;
		case 2:
			System.out.print("Today is Tuesday");
			break;
		case 3:
			System.out.print("Today is Wednesday");
			break;
		case 4:
			System.out.print("Today is Thursday");
			break;
		case 5:
			System.out.print("Today is Friday");
			break;
		case 6:
			System.out.print("Today is Saturday");
			break;
		default:
		}

		System.out.print(" and the future day is ");

		switch (FutureDay) {
		case 0:
			System.out.print("Sunday");
			break;
		case 1:
			System.out.print("Monday");
			break;
		case 2:
			System.out.print("Tuesday");
			break;
		case 3:
			System.out.print("Wednesday");
			break;
		case 4:
			System.out.print("Thursday");
			break;
		case 5:
			System.out.print("Friday");
			break;
		case 6:
			System.out.print("Saturday");
			break;
		default:
		}

		input.close();
	}

}
