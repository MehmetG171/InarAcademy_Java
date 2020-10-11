package PackageChapter11;

public class Loan {

	private double loan;
	private double numberOfYears;
	private double InterestRate;
	private java.util.Date date;

	public Loan(double loan, int numberOfYears, double InterestRate) {
		this.InterestRate = InterestRate;
		this.numberOfYears = numberOfYears;
		this.loan = loan;
		date = new java.util.Date();
	}

	public double getLoan() {
		return loan;
	}

	public void setLoan(double loan) {
		this.loan = loan;
	}

	public double getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(double numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	public double getInterestRate() {
		return InterestRate;
	}

	public void setInterestRate(double interestRate) {
		InterestRate = interestRate;
	}

	public double getMonthlyInterestRate() {
		return InterestRate / 1200;
	}

	public double getMonthlyPayment() {
		return loan * getMonthlyInterestRate() / (1 - 1 / Math.pow(1 + getMonthlyInterestRate(), numberOfYears * 12));
	}

	public double getTotalPayment() {
		return getMonthlyPayment() * numberOfYears * 12;
	}

	public String getDate() {
		return date.toString();
	}

	public String toString() {
		return "Loan --> $" + getLoan() + "\nNumber of Years --> " + getNumberOfYears() + "\nAnnual Interest Rate --> %"
				+ getInterestRate() + "\nMonthly Payment --> $" + String.format("%.2f", getMonthlyPayment())
				+ "\nTotal Payment --> $" + String.format("%.2f", getTotalPayment()) + "\nDate --> " + getDate();
	}
}
