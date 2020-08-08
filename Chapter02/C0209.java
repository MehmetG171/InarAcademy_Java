package PackageChapter02;

import java.util.Scanner;

public class C0209 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter v0,v1 in the unit of meters and t in the unit of seconds :");
		double vFirst = input.nextDouble();
		double vLast = input.nextDouble();
		double time = input.nextDouble();

		double acc = (vFirst - vLast) / time;

		System.out.println("The average acceleration is " + acc + " m/s ");
		
		input.close();
	}
}
