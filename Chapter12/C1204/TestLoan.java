package PackageChapter12;

public class TestLoan {

	public static void main(String[] args) {

		try {
			@SuppressWarnings("unused")
			Loan loan = new Loan(-5, 0, -10);
		} catch (IllegalArgumentException ex) {
			System.out.println("IllegalArgumentException: " + ex.getMessage());
		}
	}
}
