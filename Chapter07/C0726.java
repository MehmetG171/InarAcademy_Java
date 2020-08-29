package PackageChapter07;

import java.util.Scanner;

public class C0726 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the length of list1:");
		int length1 = input.nextInt();
		System.out.println("Enter the list1:");
		int[] numbers1 = new int[length1];
		for (int j = 0; j < numbers1.length; j++) {
			numbers1[j] = input.nextInt();
		}

		System.out.println("Enter the length of list2:");
		int length2 = input.nextInt();
		System.out.println("Enter the list2:");
		int[] numbers2 = new int[length2];
		for (int i = 0; i < numbers2.length; i++) {
			numbers2[i] = input.nextInt();
		}

		if (equals(numbers1, numbers2)) {
			System.out.println("Two lists are strictly identical.");
		} else {
			System.out.println("Two lists are not strictly identical.");
		}

		input.close();
	}

	public static boolean equals(int[] list1, int[] list2) {
		if (list1.length != list2.length) {
			return false;
		}

		for (int i = 0; i < list1.length; i++) {
			if (list1[i] != list2[i]) {
				return false;
			}
		}

		return true;
	}
}
