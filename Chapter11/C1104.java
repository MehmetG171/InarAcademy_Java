package PackageChapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class C1104 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Enter a sequence of numbers ending with 0: ");
		Integer num = input.nextInt();

		while (num != 0) {
			list.add(num);
			num = input.nextInt();
		}

		System.out.println("Maximum value is " + max(list));

		input.close();
	}

	public static Integer max(ArrayList<Integer> list) {
		if (list.size() == 0) {
			return null;
		}

		Integer max = 0;
		for (int i = 0; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
			}
		}

		return max;
	}
}
