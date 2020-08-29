package PackageChapter07;

import java.util.Scanner;

public class C0734 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string:");
		String s = input.nextLine();

		String str = s.toLowerCase();
		String sorted = sort(str);
		System.out.println("The sorted string is " + sorted);

		input.close();
	}

	public static String sort(String str) {
		String sorted = "";
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		for (int i = 0; i < str.length(); i++) {
			for (int j = 1; j < str.length(); j++) {
				if (ch[j - 1] > ch[j]) {
					char temp = ch[j];
					ch[j] = ch[j - 1];
					ch[j - 1] = temp;
				}
			}
		}
		for (int i = 0; i < str.length(); i++) {
			sorted = sorted + ch[i];
		}
		return sorted;
	}
}
