package Admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/addEmployeeConrol")
public class addEmployeeControl extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		
		String eid = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String department = request.getParameter("department");
		
	boolean istrue;
		
		istrue = AdminDBUtil.addEmployee(eid,name, email, address, phone , department);
		
		if(istrue == true)
		{
			out.println("<script type = 'text/javascript'>");
			out.println("alert('Successfully added!');");
			out.println("location = 'addNewEmployee.jsp'");
			out.println("</script>");
		}
		else
		{
			out.println("<script type = 'text/javascript'>");
			out.println("alert('ERROR! Try Again');");
			out.println("location = addNewEmployee.jsp'");
			out.println("</script>");

		}
		
		
		
		
	}


}

