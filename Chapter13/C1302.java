package PackageChapter13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C1302 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ArrayList<Number> list = new ArrayList<>();

		System.out.println("Enter the size of the list: ");
		int size = input.nextInt();

		System.out.println("Enter the numbers: ");

		int count = 0;
		while (count < size) {
			int number = input.nextInt();
			list.add(number);
			count++;
		}

		shuffle(list);

		input.close();
	}

	public static void shuffle(ArrayList<Number> list) {
		Collections.shuffle(list);
		System.out.println(list);
	}
}
