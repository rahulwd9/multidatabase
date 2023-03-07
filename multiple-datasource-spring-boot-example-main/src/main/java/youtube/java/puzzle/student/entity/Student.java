package youtube.java.puzzle.student.entity;

import lombok.Data;
import youtube.java.puzzle.college.entity.College;

import javax.persistence.*;

@Data
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employeeId")
    private int id;
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Column(name = "studentName")
    private String name;
    @Column(name = "studentAge")
    private String age;
    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private College college;
}
