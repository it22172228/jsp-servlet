package project;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateUserControl")
public class UpdateUserControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String mobileNumber = request.getParameter("mobileNumber");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		
         boolean isTrue;
		
		isTrue = UserDBUtill.updateUser( name, email, mobileNumber, password, address);
		
		if(isTrue == true) {
			
			List<User> cus = UserDBUtill.getUserDetails(email);
			request.setAttribute("cus", cus);
			
			RequestDispatcher dis = request.getRequestDispatcher("UserAccount.jsp");
			dis.forward(request, response);
		}
		else {
			List<User> cus = UserDBUtill.getUserDetails(email);
			request.setAttribute("cus", cus);
			
			out.println("<script type = 'text/javascript'>");
			out.println("alert('Error! Try again.');");
			out.println("location = 'UpdateUser.jsp'");
			out.println("</script>");
		}
	}

}
