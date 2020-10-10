package PackageChapter11;

import java.util.ArrayList;

public class Course {

	private String courseName;
	ArrayList<String> students;

	public Course(String courseName) {
		this.courseName = courseName;
		students = new ArrayList<String>();
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String studentName) {
		students.remove(studentName);
	}

	public int getNumberOfStudents() {
		return students.size();
	}

	public void addStudent(String studentName) {
		students.add(studentName);
	}

	public String[] getStudents() {
		String[] newStudents = new String[students.size()];
		return students.toArray(newStudents);
	}
}
