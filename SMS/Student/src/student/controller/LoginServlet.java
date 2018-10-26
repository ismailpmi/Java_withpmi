package student.controller;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		
		 /*
		   // Creating a Hashtable
		   Hashtable<String, String> hashtable = 
		              new Hashtable<String, String>();
		 
		   // Adding Key and Value pairs to Hashtable
		   hashtable.put("admin","admin");
		   hashtable.put("hello","hello");
		   
		 */

		if (username.equals(password)) {
			HttpSession session = request.getSession();
			session.setAttribute("USERNAME", username);
			// RequestDispatcher rd =
			// request.getRequestDispatcher("success.jsp");
			// rd.forward(request, response);
			response.sendRedirect("success.jsp");
		} else {
			response.getWriter().print("Invalid username/password");
			response.setContentType("text/html");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}

	}

}
