package student.controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sms.fujitsu.model.Student;
import sms.fujitsu.service.StudentServices;



/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int student_id = Integer.parseInt(request.getParameter("student_id"));
		String student_name = request.getParameter("student_name");
		String department = request.getParameter("department");
		System.out.println(request.getParameter("mark1"));
		
		System.out.println(request.getParameter("mark2"));
		System.out.println(request.getParameter( "mark3"));
		int  mark1 = Integer.parseInt(request.getParameter("mark1"));
		int  mark2 = Integer.parseInt(request.getParameter("mark2"));
		int  mark3 = Integer.parseInt(request.getParameter("mark3"));
		

		StudentServices service = new StudentServices();
		
		Student student= new Student(student_id, student_name,  department, mark1, mark2, mark3);

		service.insert(student);

		List<Student> studentList = service.findAll() ;
		request.setAttribute("STUDENTLIST", studentList);
		RequestDispatcher rd = request.getRequestDispatcher("list.jsp");
		rd.forward(request, response);
	}

}
