package student.service;

import java.util.List;

import student.dao.StudentDAO;
import student.exception.InvalidInputException;
import student.model.Student;

public class StudentService {

	public List<Student> findAll() {
		return StudentDAO.findAll();
	}

	public Student findById(Student student) {
		
		if (student.getStudent_id() == 0)
			try {
				throw new InvalidInputException("ID is invalid");
			} catch (InvalidInputException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else {
			StudentDAO.findById(student);
			
		}
		return student;
	}

	public void insert(Student student) {
		try {
			if (student.getStudent_id() > 100) {
				throw new InvalidInputException("Please enter valid Id");
			}
			StudentDAO.insert(student);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public void update(Student student) {
		try {
			if (student.getStudent_id() > 100||student.getStudent_name()==null) {
				throw new InvalidInputException("Please enter valid Id");
			}
			StudentDAO.update(student);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void delete(Student student) {
		try {
			if (student.getStudent_id() > 100) {
				throw new InvalidInputException("Please enter valid Id");
			}
			StudentDAO.delete(student);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
