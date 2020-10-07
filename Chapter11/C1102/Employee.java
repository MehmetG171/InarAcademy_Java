package PackageChapter11;

public class Employee extends Person {

	private int office;
	private double salary;
	private MyDate date;

	public Employee(String name, String address, String phone, String email, int office, double salary) {
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
		date = new MyDate();
	}

	public int getOffice() {
		return office;
	}

	public void setOffice(int office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDate() {
		return date.getDay() + "-" + date.getMonth() + "-" + date.getYear();
	}

	public void setDate(MyDate date) {
		this.date = date;
	}

	public String toString() {
		return super.toString() + "\nOffice --> " + getOffice() + "\nSalary --> $" + getSalary() + "\nDate --> "
				+ getDate();
	}
}
