package project;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LogOutControl")
public class LogOutControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	// destroy session
	
	HttpSession session = request.getSession(true);
	session.invalidate();
	
	RequestDispatcher dp = request.getRequestDispatcher("login.jsp");
	dp.forward(request,response);
		
	}

	
	

}
