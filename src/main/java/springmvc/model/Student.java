package springmvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details_mvc")
public class Student {

	@Id
	private int roll;
	private String name;
	private String college;
	private String city;
	public Student() {
		super();
	}
	public Student(int roll, String name, String college, String city) {
		super();
		this.roll = roll;
		this.name = name;
		this.college = college;
		this.city = city;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", college=" + college + ", city=" + city + "]";
	}
	
	
	
	
	
}
