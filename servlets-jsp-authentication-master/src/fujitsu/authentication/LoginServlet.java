package fujitsu.authentication;

import java.io.IOException;

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

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

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
