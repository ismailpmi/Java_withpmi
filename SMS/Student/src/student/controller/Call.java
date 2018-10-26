package student.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Call
 */
@WebServlet("/Call")
public class Call extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String phone=request.getParameter("phone");
		
		
		int len=name.length();
		String ucase=name.toUpperCase();
		
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		session.setAttribute("address", address);
		session.setAttribute("phone", phone);
		session.setAttribute("len", len);
		session.setAttribute("ucase", ucase);
		
		response.sendRedirect("success.jsp");
	}

}
