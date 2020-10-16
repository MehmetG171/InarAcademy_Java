package PackageChapter11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class C1117 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();

		System.out.println("Enter an integer m:");
		int number = input.nextInt();

		int m = number;

		int count = 2;
		while (count <= number) {
			if (number % count == 0) {
				numbers.add(count);
				number = number / count;
			} else {
				count++;
			}
		}

		Map<Integer, Integer> myMap = new HashMap<>();
		for (int i = 0; i < numbers.size(); i++) {
			Integer c = numbers.get(i);
			if (myMap.containsKey(c)) {
				int sayi = myMap.get(c);
				sayi++;
				myMap.put(c, sayi);
			} else {
				myMap.put(c, 1);
			}
		}

		List<Integer> newlist = new ArrayList<Integer>();

		for (int i = 0; i < numbers.size(); i++) {
			Integer c = numbers.get(i);
			if (newlist.contains(c)) {
				continue;
			} else {
				newlist.add(c);
			}
		}

		int n = 1;

		for (int i = 0; i < myMap.size(); i++) {
			if (myMap.get(newlist.get(i)) % 2 != 0) {
				n = n * newlist.get(i);
			}
		}

		System.out.println("The smallest number n for m * n to be a perfect square is " + n);
		System.out.println(m * n);

		input.close();
	}
}
