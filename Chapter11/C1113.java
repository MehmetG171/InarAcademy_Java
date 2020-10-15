package PackageChapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class C1113 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Enter ten integers:");
		for (int i = 0; i < 10; i++) {
			list.add(input.nextInt());
		}

		removeDuplicate(list);

		input.close();
	}

	public static void removeDuplicate(ArrayList<Integer> list) {

		ArrayList<Integer> newlist = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			if (!newlist.contains(list.get(i))) {
				newlist.add(list.get(i));
			}
		}

		System.out.println(newlist);
	}
}
