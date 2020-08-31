package PackageChapter07;

import java.util.Scanner;

public class C0731 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the length of list1:");
		int lengthList1 = input.nextInt();

		int[] list1 = new int[lengthList1];

		System.out.println("Enter list1:");
		for (int i = 0; i < lengthList1; i++) {
			list1[i] = input.nextInt();
		}

		System.out.println("Enter the length of list2:");
		int lengthList2 = input.nextInt();

		int[] list2 = new int[lengthList2];

		System.out.println("Enter list2:");
		for (int i = 0; i < lengthList2; i++) {
			list2[i] = input.nextInt();
		}

		int[] newList1 = sort(list1);
		int[] newList2 = sort(list2);
		int[] list3 = merge(newList1, newList2);

		System.out.println("The merged list is ");
		for (int k = 0; k < list3.length; k++) {
			System.out.print(list3[k] + " ");
		}

		input.close();
	}

	public static int[] merge(int[] list1, int[] list2) {
		int[] list3 = new int[list1.length + list2.length];
		int j = 0;
		int k = 0;

		for (int i = 0; i < list3.length; i++) {
			if (j < list1.length && list1[j] < list2[k]) {
				list3[i] = list1[j];
				j++;
			} else if (k < list2.length) {
				list3[i] = list2[k];
				k++;
			}
		}

		return list3;
	}

	public static int[] sort(int[] list) {
		for (int j = 0; j < list.length; j++) {
			for (int k = 1; k < list.length; k++) {
				if (list[k - 1] > list[k]) {
					int temp = list[k];
					list[k] = list[k - 1];
					list[k - 1] = temp;
				}
			}
		}
		return list;
	}
}
