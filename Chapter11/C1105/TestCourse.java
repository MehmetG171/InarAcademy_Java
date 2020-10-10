package PackageChapter11;

public class TestCourse {

	public static void main(String[] args) {

		Course a = new Course("Circuit Theory");
		Course b = new Course("Digital Design");

		a.addStudent("Ali");
		a.addStudent("Veli");
		a.addStudent("Ayse");
		b.addStudent("Ahmet");
		b.addStudent("Mehmet");
		b.addStudent("Fatma");

		a.dropStudent("Veli");
		b.dropStudent("Ahmet");

		String[] first = a.getStudents();
		String[] second = b.getStudents();

		System.out.println("Course name --> " + a.getCourseName());
		System.out.print("Number of students --> " + first.length + "\nStudents --> ");

		for (int i = 0; i < first.length; i++) {
			System.out.print(first[i] + " ");
		}

		System.out.println("\n\nCourse name --> " + b.getCourseName());
		System.out.print("Number of students --> " + second.length + "\nStudents --> ");

		for (int i = 0; i < first.length; i++) {
			System.out.print(second[i] + " ");
		}
	}
}
