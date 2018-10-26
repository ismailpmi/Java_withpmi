package student.test;

import java.util.Scanner;

import student.controller.StudentController;
import student.dao.StudentDAO;
import student.model.Student;

public class StudentTest {
	static Student student1=new Student();
	

	public static void main(String[] args) {
		StudentController studentController = new StudentController();
		
		int choice;
		do {
			Student student = new Student();
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Your Choice");
			System.out.println(
					"\n1.Add Student Details \n2.Find all\n3.Update Student Details  \n4.Delete Student Details\n5.Find Student Details by ID \n6. Generate report by id\n7. Exit");
			choice = scan.nextInt();
			// studentController.getStudent();
			switch (choice) {
			case 1:
				StudentController.insert(studentController.getStudent());
				break;

			case 2:
				StudentController.findAll();
				break;

			case 3:
				System.out.println("enter id you want to update");
				int id = scan.nextInt();
				System.out.println("enter name you want to update");
				String name = scan.next();

				student.setStudent_id(id);
				student.setStudent_name(name);
				StudentController.update(student);
				break;

			case 4:
				System.out.println("enter the id you wish to delete");
				int id1 = scan.nextInt();
				student.setStudent_id(id1);
				StudentController.delete(student);
				break;

			case 5:
				System.out.println("enter the id you wish to search ");
				int id2 = scan.nextInt();
				student.setStudent_id(id2);
				
				
				student1=StudentController.findById(student);
				System.out.println(student1);
				
				break;

			case 6:
				System.out.println("Enter the id you want to Generate report ");
				int id3 = scan.nextInt();
				student.setStudent_id(id3);
				StudentDAO.ReportGeneration(student);
				break;

			case 7:
				break;
			}

		} while (choice != 7);

	}

}
