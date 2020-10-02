package PackageChapter10;

public class TestCourse {

	public static void main(String[] args) {
		Course course1 = new Course("Data Structures");
		Course course2 = new Course("Database Systems");

		course1.addStudent("Peter Jones");
		course1.addStudent("Kim Smith");
		course1.addStudent("Anne Kennedy");

		course2.addStudent("Peter Jones");
		course2.addStudent("Steve Smith");

		String[] students = course1.getStudents();

		System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
		for (int i = 0; i < course1.getNumberOfStudents(); i++) {
			System.out.print(students[i] + ", ");
		}
		System.out.println("");

		String[] students2 = course2.getStudents();

		System.out.println("Number of students in course2: " + course2.getNumberOfStudents());
		for (int i = 0; i < course2.getNumberOfStudents(); i++) {
			System.out.print(students2[i] + ", ");
		}
		System.out.println("");

		course1.dropStudent("Peter Jones");

		String[] students3 = course1.getStudents();

		System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
		for (int i = 0; i < course1.getNumberOfStudents(); i++) {
			System.out.print(students3[i] + ", ");
		}
	}
}
