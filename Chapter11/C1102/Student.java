package PackageChapter11;

public class Student extends Person {

	private int status;

	public final static int FRESHMAN = 1;
	public final static int JUNIOR = 2;
	public final static int SOPHOMORE = 3;
	public final static int SENIOR = 4;

	public Student(String name, String address, String phone, String email, int status) {
		super(name, address, phone, email);
		this.status = status;
	}

	public String getStatus() {

		String statusStr = "";

		if (status == 1) {
			statusStr = "freshman";
		} else if (status == 2) {
			statusStr = "sophomore";
		} else if (status == 3) {
			statusStr = "junior";
		} else if (status == 4) {
			statusStr = "senior";
		} else {
			statusStr = "empty";
		}

		return statusStr;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String toString() {
		return super.toString() + "\nStatus --> " + getStatus();
	}

}
