package PackageChapter06;

import java.util.Scanner;

public class C0625 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the milliseconds:");
		long millis = input.nextLong();

		System.out.println(convertMillis(millis));

		input.close();
	}

	public static String convertMillis(long millis) {
		long totalseconds =  millis / 1000;
		long currentseconds = totalseconds % 60;
		long totalminutes = totalseconds / 60;
		long currentminutes = totalminutes % 60;
		long totalhours = totalminutes / 60;
		String time = totalhours + ":" + currentminutes + ":" + currentseconds;
		return time;
	}
}
