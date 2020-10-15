package PackageChapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class C1111 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();

		System.out.println("Enter 5 numbers:");

		for (int i = 0; i < 5; i++) {
			numbers.add(input.nextInt());
		}

		sort(numbers);

		input.close();
	}

	public static void sort(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size() - 1; j++) {
				if (list.get(j + 1) < list.get(j)) {
					int a = list.get(j + 1);
					int b = list.get(j);
					list.set(j + 1, b);
					list.set(j, a);
				}
			}
		}

		System.out.println(list);
	}
}
