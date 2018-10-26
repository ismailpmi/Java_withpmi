package student.controller;

import java.util.List;
import java.util.Scanner;

import student.model.Student;
import student.service.StudentService;

public  class StudentController {
	static StudentService studentService = new StudentService();
	Scanner scan = new Scanner(System.in);
	
	 public Student getStudent(){
		System.out.println("Enter Student ID, Name, Department and Marks of 3 subjects ");
		int id = scan.nextInt();
		String name = scan.next();
		String department = scan.next();
		int m1 = scan.nextInt();
		int m2 = scan.nextInt();
		int m3 = scan.nextInt();
		Student student = new Student(id,name,department,m1,m2,m3);
		
		return student;
	}
	
	public static void insert(Student student){
		studentService.insert(student);
	}
	public static void update(Student student){
		studentService.update(student);
	}
	
	public static void delete(Student student){
		studentService.delete(student);
	}
	
	public static List<Student> findAll(){
		 return studentService.findAll();
	
	}
	public static Student findById(Student student){
		return studentService.findById(student);
	}
	
}
