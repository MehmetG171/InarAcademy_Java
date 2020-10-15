package PackageChapter11;

import java.util.Scanner;

public class TestMyStack {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		MyStack list = new MyStack();

		int count = 0;

		while (count < 5) {
			System.out.println("Enter " + (count+1) + ". string:");
			String str = input.nextLine();
			list.push(str);
			count++;
		}

		while (list.getSize() > 0) {
			System.out.println(list.pop() + " ");
		}

		input.close();
	}
}
