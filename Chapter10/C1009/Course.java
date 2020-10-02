package PackageChapter10;

public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String student) {
		int delete = findStudent(student);

		if (0 <= delete) {

			String[] studentsNew = new String[students.length - 1];

			for (int j = 0, i = 0; j < studentsNew.length; j++, i++) {
				if (j == delete) {
					i++;
				}
				studentsNew[j] = students[i];
			}

			numberOfStudents--;
			students = studentsNew;

		} else {
			System.out.println(student + " is not in the course: " + courseName);
		}
	}

	public int findStudent(String student) {
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(student)) {
				return i;
			}
		}
		return -1;
	}

	public void clear() {
		students = new String[1];
		numberOfStudents = 0;
	}
}
