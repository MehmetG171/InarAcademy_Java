package PackageChapter13;

import java.util.ArrayList;
import java.util.Scanner;

public class C1303 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Enter the size of the list: ");
		int size = input.nextInt();

		System.out.println("Enter the numbers: ");

		int count = 0;
		while (count < size) {
			int number = input.nextInt();
			list.add(number);
			count++;
		}

		sort(list);

		input.close();
	}

	public static void sort(ArrayList<Integer> list) {
		for (int j = 0; j < list.size(); j++) {
			for (int k = 1; k < list.size(); k++) {
				if (list.get(k - 1) > list.get(k)) {
					int temp = list.get(k);
					list.set(k, list.get(k - 1));
					list.set(k - 1, temp);
				}
			}
		}
		System.out.println(list);
	}
}
