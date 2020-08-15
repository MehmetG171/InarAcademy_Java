package PackageChapter05;

public class C0539 {
	public static void main(String[] args) {

		double salary = 5000;
		double goal = 30000;
		double commision = 0;
		double sales = 0;

		while (commision < goal) {
			if (sales <= 5000) {
				commision = salary * 0.08;
			}
			if (5000 < sales && sales <= 10000) {
				commision = salary * 0.10 + salary * 0.08;
			}
			if (10000 < sales) {
				commision = (sales - 2 * salary) * 0.12 + salary * 0.10 + salary * 0.08;
			}
			sales = sales + 0.01;
		}
		System.out.printf("The minimum sales amount to earn $30000 commision in a year is $%.2f", sales - 0.01);
	}
}