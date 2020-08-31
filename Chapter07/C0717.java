package PackageChapter07;

import java.util.Scanner;

public class C0717 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of students:");
		int length = input.nextInt();

		String[] names = new String[length];
		int[] grades = new int[length];

		System.out.println("Enter the students' names and their scores:");

		for (int i = 0; i < length; i++) {
			names[i] = input.next();
			grades[i] = input.nextInt();
		}

		for (int j = 0; j < grades.length; j++) {
			for (int k = 1; k < grades.length; k++) {
				if (grades[k - 1] > grades[k]) {
					int temp = grades[k];
					grades[k] = grades[k - 1];
					grades[k - 1] = temp;
					String temp1 = names[k];
					names[k] = names[k - 1];
					names[k - 1] = temp1;
				}
			}
		}

		System.out.println("The student names in decreasing order of their scores: ");
		for (int m = names.length - 1; 0 <= m; m--) {
			System.out.print(names[m] + " ");
		}

		input.close();
	}
}
