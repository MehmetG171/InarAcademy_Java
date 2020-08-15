package PackageChapter05;

public class C0507 {
	public static void main(String[] args) {
		
		int year = 1;
		double tuition = 10000;
		double coefficient = 1.05;

		System.out.println("Year         Tuition");

		while (year < 11) {
			tuition = tuition * coefficient;
			System.out.printf("%-8d  $%9.3f\n", year, tuition);
			year++;
		}

		double total = tuition * coefficient + tuition * Math.pow(coefficient, 2) + tuition * Math.pow(coefficient, 3)
				+ tuition * Math.pow(coefficient, 4);

		System.out.printf("The total cost of four years’ worth of tuition after the tenth year is $%.3f", total);

	}
}
