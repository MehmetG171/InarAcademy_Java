package PackageChapter11;

import java.util.ArrayList;
import java.util.Date;

public class TestArrayList {

	public static void main(String[] args) {

		ArrayList<Object> list = new ArrayList<>();

		list.add(new Loan(5000, 5, 1.5));
		list.add(new Date());
		list.add(new String("Test String"));
		list.add(new Circle(5));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString() + "\n");
		}
	}
}
