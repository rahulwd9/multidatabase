package youtube.java.puzzle.model;

import lombok.Data;
import youtube.java.puzzle.college.entity.College;
import youtube.java.puzzle.student.entity.Student;

import java.util.List;

@Data
public class Response {
    public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public List<College> getColleges() {
		return colleges;
	}
	public void setColleges(List<College> colleges) {
		this.colleges = colleges;
	}
	List<Student> students;
    List<College> colleges;
}
