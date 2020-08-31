package PackageChapter07;

import java.util.Scanner;

public class C0732 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the size of list:");
		int size = input.nextInt();
		System.out.println("Enter list:");
		int[] list = new int[size];

		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
		}

		int[] list1 = partition1(list);
		int[] list2 = partition2(list);

		for (int j = 0; j < list1.length; j++) {
			if (list1[j] != 0) {
				System.out.print(list1[j] + " ");
			}
		}

		System.out.print(list[0] + " ");

		for (int k = 0; k < list2.length; k++) {
			if (list2[k] != 0) {
				System.out.print(list2[k] + " ");
			}
		}

		input.close();
	}

	public static int[] partition1(int[] list) {
		int pivot = list[0];
		int[] list1 = new int[list.length];
		int a = 0;

		for (int j = 1; j < list.length; j++) {
			if (list[j] < pivot) {
				list1[a] = list[j];
				a++;
			}
		}
		return list1;
	}

	public static int[] partition2(int[] list) {
		int pivot = list[0];
		int[] list2 = new int[list.length];
		int a = 0;

		for (int j = 1; j < list.length; j++) {
			if (list[j] > pivot) {
				list2[a] = list[j];
				a++;
			}
		}
		return list2;
	}
}
