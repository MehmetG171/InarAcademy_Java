package PackageChapter11;

public class TestPerson {

	public static void main(String[] args) {

		Person person = new Person("Mehmet", "Oran", "1234567", "mehmet07@gmail.com");
		Student student = new Student("Ali", "Cankaya", "7654321", "ali05@hotmail.com", 2);
		Employee employee = new Employee("Veli", "Cukurambar", "17263645", "veli09@yahoo.com", 11, 3000);
		Faculty faculty = new Faculty("Ahmet", "Hosdere", "7162534", "ahmet03@bing.com", 12, 5000, "Doctor (Dr.)",
				"13.00-16.00");
		Staff staff = new Staff("Mustafa", "Yildiz", "4352617", "mustafa01@icloud.com", 13, 4000, "Research Assistant");

		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}
}
