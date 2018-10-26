package student.service;

import java.util.List;


import student.dao.StudentDAO;
import student.exception.InvalidInputException;
import student.model.Student;

public class StudentService {
	
	public List<Student>findAll(){
		return StudentDAO.findAll();
	}
	public void insert(Student student){
		try {
			if(student.getStudent_id()>100){
				throw new InvalidInputException("Please enter vallid Id");
			}
			StudentDAO.insert(student);
		} catch ( Exception e) {
			
			e.printStackTrace();
		}
	}
}
