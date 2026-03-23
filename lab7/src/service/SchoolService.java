package service;

import model.Student;
import java.util.ArrayList;

public class SchoolService {
	private ArrayList students = new ArrayList<>();
	
	public void addStudent(Student s) {
		students.add(s);
	}

	public ArrayList getStudents() {
		return students;
	}
}