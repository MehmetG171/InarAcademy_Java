package PackageChapter11;

import java.util.ArrayList;

public class C1107 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 100; i++) {
			list.add(i);
		}

		shuffle(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%3d ", list.get(i));
			if ((i + 1) % 10 == 0) {
				System.out.println("");
			}
		}
	}

	public static void shuffle(ArrayList<Integer> list) {
		java.util.Collections.shuffle(list);
	}
}
