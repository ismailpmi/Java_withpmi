package sms.fujitsu.service;

import java.util.ArrayList;


import java.util.Iterator;
import java.util.List;

import sms.fujitsu.exception.InvalidInputException;
import sms.fujitsu.model.Student;

import sms.fujitsu.dao.StudentDAO;


public class StudentServices {
	
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


