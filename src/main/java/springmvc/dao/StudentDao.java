package springmvc.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import springmvc.model.Student;

@Component
public class StudentDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//save a new student data from form-----------method name .save
	@Transactional
	public void createStudent(Student student) {
		this.hibernateTemplate.save(student);
		
	}
	
	//to display student detailssss in a table-------method name .loadAll
	public List<Student> getStudents(){
		
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
				
	}
		
	
public Student getStudentByName(int roll) {
		
		System.out.println("************inside dao");
		System.out.println(roll);
		//String sql = "SELECT s FROM Student s where s.name= :sname";
		Student s = hibernateTemplate.get(Student.class, roll);
		System.out.println(s.getName());
		System.out.println(s.getCity());
		System.out.println(s.getCollege());
		return s;	 
	}




}
