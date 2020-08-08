package PackageChapter04;

import java.util.Scanner;

public class C0418 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter two characters:");
		String MajorStatus = input.next();
		char major = MajorStatus.toUpperCase().charAt(0);
		char status = MajorStatus.charAt(1);

		switch (major) {
		case 'M':
			System.out.print("Mathematics");
			break;
		case 'C':
			System.out.print("Computer Science");
			break;
		case 'I':
			System.out.print("Information Technology");
			break;
		default:
			System.out.print("Invalid input.");
			System.exit(0);
		}

		switch (status) {
		case '1':
			System.out.print(" Freshman");
			break;
		case '2':
			System.out.println(" Sophomore");
			break;
		case '3':
			System.out.println(" Junior");
			break;
		case '4':
			System.out.println(" Senior");
			break;
		default:
			System.out.print("Invalid input.");
			System.exit(0);
		}

		input.close();
	}

}
