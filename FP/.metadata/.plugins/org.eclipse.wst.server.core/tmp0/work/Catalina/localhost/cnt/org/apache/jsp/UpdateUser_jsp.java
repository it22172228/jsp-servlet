/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.82
 * Generated at: 2023-10-26 08:06:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UpdateUser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/normalHeader.jsp", Long.valueOf(1698117716856L));
    _jspx_dependants.put("/normalFooter.jsp", Long.valueOf(1698117994120L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("     ");
      out.write("\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>MyAccount</title>\n");
      out.write("    <link href=\"css/style.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("   \n");
      out.write(" </head>\n");
      out.write("    <!-- header section starts  -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<header class=\"header\">\n");
      out.write("\n");
      out.write("    <a href=\"#\" class=\"logo\"><span>T</span>ECH<span>Z</span>ONE</a>\n");
      out.write("\n");


     
	String Semail = (String)session.getAttribute("emailu");



      out.write("\n");
      out.write("    <nav class=\"navbar\">\n");
      out.write("         <a href=\"#home\">home</a>\n");
      out.write("        <a href=\"UserSignUp.jsp\">SignUp</a>\n");
      out.write("        <a href=\"login.jsp\">logIn</a>\n");
      out.write("        <a href=\"uac\">Account</a>\n");
      out.write("        <a href=\"logout\">logOut</a>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div id=\"menu-bars\" class=\"fas fa-bars\"></div>\n");
      out.write("\n");
      out.write("</header>");
      out.write("\n");
      out.write("     \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<link href=\"css/updateuser.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- catching the values from UserAccount page -->\n");
      out.write("\n");

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String mobileNumber = request.getParameter("mobileNumber");
		String password = request.getParameter("password");
		String address = request.getParameter("address");

      out.write("\n");
      out.write("\n");
      out.write("<center><h2>Change Details</h2></center>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Display details  -->\n");
      out.write("\n");
      out.write("<form action=\"updateuser\" method=\"post\">\n");
      out.write("	<table class=\"center\">\n");
      out.write("		<tr>\n");
      out.write("		<td>Email</td>\n");
      out.write("		<td><input type=\"text\" name=\"email\" value=\"");
      out.print( email );
      out.write("\" readonly></td>\n");
      out.write("	</tr>\n");
      out.write("		\n");
      out.write("		<tr>\n");
      out.write("			<td>Name</td>\n");
      out.write("			<td><input type=\"text\" name=\"name\" value=\"");
      out.print( name );
      out.write("\"></td>\n");
      out.write("		</tr>\n");
      out.write("			<tr>\n");
      out.write("		<td>Phone number</td>\n");
      out.write("		<td><input type=\"text\" name=\"mobileNumber\" value=\"");
      out.print( mobileNumber );
      out.write("\"></td>\n");
      out.write("	</tr>\n");
      out.write("	<tr>\n");
      out.write("		<td>Address</td>\n");
      out.write("		<td><input type=\"text\" name=\"address\" value=\"");
      out.print( address );
      out.write("\"></td>\n");
      out.write("	</tr>\n");
      out.write("	<tr>\n");
      out.write("		<td>Password</td>\n");
      out.write("		<td><input type=\"password\" name=\"password\" value=\"");
      out.print( password );
      out.write("\"></td>\n");
      out.write("	</tr>		\n");
      out.write("	</table>\n");
      out.write("	<br>\n");
      out.write("	<input class=\"button\" type=\"submit\" name=\"submit\" value=\"Update My Data\">\n");
      out.write("	</form>\n");
      out.write("	<br><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("	<meta charset=\"ISO-8859-1\">\n");
      out.write("	<title></title>\n");
      out.write("	<link rel=\"stylesheet\" href=\"css/footer.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	<!-- footer section starts  -->\n");
      out.write("\n");
      out.write("	<section class=\"footer\">\n");
      out.write("	\n");
      out.write("	    <div class=\"box-container\">\n");
      out.write("	        \n");
      out.write("	        <div class=\"box\">\n");
      out.write("	            <h3>contact info</h3>\n");
      out.write("	            <a href=\"#\"> <i class=\"fas fa-phone\"></i> +94751170941 </a>\n");
      out.write("	            <a href=\"#\"> <i class=\"fas fa-phone\"></i> +94753211645 </a>\n");
      out.write("	            <a href=\"#\"> <i class=\"fas fa-envelope\"></i> chanithtranchal@gmail.com </a>\n");
      out.write("	            <a href=\"#\"> <i class=\"fas fa-envelope\"></i> cntrox@gmail.com </a>\n");
      out.write("	            <a href=\"#\"> <i class=\"fas fa-map-marker-alt\"></i> colombo, sri lanka - 400104 </a>\n");
      out.write("	        </div>\n");
      out.write("	\n");
      out.write("	        <div class=\"box\">\n");
      out.write("	            <h3>follow us</h3>\n");
      out.write("	            <a href=\"#\"> <i class=\"fab fa-facebook-f\"></i> facebook </a>\n");
      out.write("	            <a href=\"#\"> <i class=\"fab fa-twitter\"></i> twitter </a>\n");
      out.write("	            <a href=\"#\"> <i class=\"fab fa-instagram\"></i> instagram </a>\n");
      out.write("	            <a href=\"#\"> <i class=\"fab fa-linkedin\"></i> linkedin </a>\n");
      out.write("	        </div>\n");
      out.write("	\n");
      out.write("	    </div>                                  \n");
      out.write("	\n");
      out.write("	    <div class=\"credit\"> created by <span>Heta dawase weerayo</span> | all rights reserved </div>\n");
      out.write("	\n");
      out.write("	</section>\n");
      out.write("	\n");
      out.write("	<!-- footer section ends -->\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
