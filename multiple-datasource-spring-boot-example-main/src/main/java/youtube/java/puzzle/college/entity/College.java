package youtube.java.puzzle.college.entity;

import lombok.Data;
import youtube.java.puzzle.student.entity.Student;

import java.util.Set;

import javax.persistence.*;

@Data
@Entity
@Table(name = "college")
public class College {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "collegeId")
    int id;
    @Column(name = "collegeName")
    String name;
    @Column(name = "collegeLocation")
    String location;
    @OneToOne
    @JoinColumn(name = "Student_Id")
    private Student student;

    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
