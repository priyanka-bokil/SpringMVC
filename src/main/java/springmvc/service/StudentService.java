package springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.StudentDao;
import springmvc.model.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDao dao;
	
	public void createStudent(Student student) {
		dao.createStudent(student);
		
	}
	
    public List<Student> getStudents(){
		return dao.getStudents();
				
	}
   public Student getStudentByName(int roll) {
		
	   System.out.println("----------inside service");
	   System.out.println(roll);
		return dao.getStudentByName(roll);
	
	}
//    public Student getStudentByName(String sname) {
//		
//		return dao.getStudentByName(sname);
//	
//	}
//	
}

