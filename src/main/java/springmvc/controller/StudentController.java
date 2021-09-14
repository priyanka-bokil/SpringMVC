package springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import springmvc.model.Student;
import springmvc.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;
	
	
	//to show the main page which contains table of student details and a button - add new student
	@RequestMapping("/")
    public String home(Model m)
    {
    	List<Student> students = service.getStudents();
    	m.addAttribute("students", students);
    	m.addAttribute("title", "Students Page");
    	return "index";
    
    }
	//to show the add new student form 
	@RequestMapping("/student-form")
	public String stduentForm(Model m) {
		m.addAttribute("title", "New Student Form");
		return "student-form";
	}
	
	
	@RequestMapping(value="/handle-student", method=RequestMethod.POST)
	public RedirectView addStudent(HttpServletRequest request, @ModelAttribute Student student) {
	System.out.println(student);
	this.service.createStudent(student);
	RedirectView rv = new RedirectView();	
	rv.setUrl(request.getContextPath()+ "/");
	return rv;
}
	
	@RequestMapping(value="/search-student/{roll}" , method=RequestMethod.GET)
	public RedirectView searchStudent(@PathVariable("roll") int roll,HttpServletRequest request) {
		System.out.println("-----------------------------------inside controller");
		this.service.getStudentByName(roll);
		System.out.println(roll);
		RedirectView rv = new RedirectView();	
		rv.setUrl(request.getContextPath()+ "/");
		return rv;
	}
	
	
	
	
	
	
	
	
}
