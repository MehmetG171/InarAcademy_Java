package PackageChapter03;

import java.util.Scanner;

public class C0330 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter time zone offset to GMT : ");
		int offset = input.nextInt();

		long TotalMilliSeconds = System.currentTimeMillis();
		long TotalSeconds = TotalMilliSeconds / 1000;
		long TotalMinutes = TotalSeconds / 60;
		long TotalHours = TotalMinutes / 60;
		TotalHours = TotalHours + offset;

		long CurrentSeconds = TotalSeconds % 60;
		long CurrentMinutes = TotalMinutes % 60;
		long CurrentHours = TotalHours % 12;

		System.out.println(
				"The current time is " + CurrentHours + " : " + CurrentMinutes + " : " + CurrentSeconds + " GMT ");

		input.close();
	}
}
