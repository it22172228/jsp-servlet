/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.82
 * Generated at: 2023-10-24 03:22:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserSignUp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1698109907586L));
    _jspx_dependants.put("jar:file:/C:/Users/DELL/Desktop/FP/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/cnt/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/normalHeader.jsp", Long.valueOf(1698117716856L));
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
      out.write("    \n");
      out.write("    ");
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
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Form</title>\n");
      out.write("    <link href=\"css/signup.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("   \n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("  	<div class=\"container\">\n");
      out.write("  	<center><h1 class = \"h1\" >SignUp</h1></center>\n");
      out.write("        <br>\n");
      out.write("      <form  action =\"Signup\" method=\"post\" autocomplete=\"on\">\n");
      out.write("      \n");
      out.write("        <!-- name-->\n");
      out.write("    		<div class=\"box\">\n");
      out.write("          <label for=\"firstName\" class=\"fl fontLabel\">Name: </label>\n");
      out.write("    		\n");
      out.write("    			<div class=\"fr\">\n");
      out.write("    					<input type=\"text\" name=\"name\" placeholder=\"Name\"\n");
      out.write("              class=\"textBox\"  required>\n");
      out.write("    			</div>\n");
      out.write("    			<div class=\"clr\"></div>\n");
      out.write("    		</div>\n");
      out.write("    		<!-- name-->\n");
      out.write("    		\n");
      out.write("    		<!---Email ID---->\n");
      out.write("    		<div class=\"box\">\n");
      out.write("          <label for=\"email\" class=\"fl fontLabel\"> Email ID: </label>\n");
      out.write("    			\n");
      out.write("    			<div class=\"fr\">\n");
      out.write("    					<input type=\"email\" required name=\"email\" placeholder=\"Email Id\" class=\"textBox\">\n");
      out.write("    			</div>\n");
      out.write("    			<div class=\"clr\"></div>\n");
      out.write("    		</div>\n");
      out.write("    		<!--Email ID----->\n");
      out.write("    		\n");
      out.write("    		<!-- Address-->\n");
      out.write("    		<div class=\"box\">\n");
      out.write("          <label for=\"firstName\" class=\"fl fontLabel\"> Address : </label>\n");
      out.write("    		\n");
      out.write("    			<div class=\"fr\">\n");
      out.write("    					<input type=\"text\" name=\"address\" placeholder=\"Address\"\n");
      out.write("              class=\"textBox\" required>\n");
      out.write("    			</div>\n");
      out.write("    			<div class=\"clr\"></div>\n");
      out.write("    		</div>\n");
      out.write("    		<!-- address-->\n");
      out.write("    		\n");
      out.write("\n");
      out.write("    		<!---Phone No.------>\n");
      out.write("    		<div class=\"box\">\n");
      out.write("          <label for=\"phone\" class=\"fl fontLabel\"> Phone No.: </label>\n");
      out.write("    			\n");
      out.write("    			<div class=\"fr\">\n");
      out.write("    					<input type=\"text\" required name=\"mobileNumber\" maxlength=\"10\" placeholder=\"Phone No.\" class=\"textBox\">\n");
      out.write("    			</div>\n");
      out.write("    			<div class=\"clr\"></div>\n");
      out.write("    		</div>\n");
      out.write("    		<!---Phone No.---->\n");
      out.write("\n");
      out.write("\n");
      out.write("    		<!---Password------>\n");
      out.write("    		<div class=\"box\">\n");
      out.write("          <label for=\"password\" class=\"fl fontLabel\"> Password </label>\n");
      out.write("    			\n");
      out.write("    			<div class=\"fr\">\n");
      out.write("    					<input type=\"Password\" id=\"pass\" name=\"password\" placeholder=\"Password\" class=\"textBox\" required>\n");
      out.write("    			</div>\n");
      out.write("    			<div class=\"clr\"></div>\n");
      out.write("    		</div>\n");
      out.write("    		<!---Password---->\n");
      out.write("           \n");
      out.write("           \n");
      out.write("    		<!--Terms and Conditions------>\n");
      out.write("    		<div class=\"box terms\">\n");
      out.write("    				<input type=\"checkbox\" name=\"Terms\" required> &nbsp; I accept the terms and conditions\n");
      out.write("    		</div>\n");
      out.write("    		<!--Terms and Conditions------>\n");
      out.write("				\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    		<!---Submit Button------>\n");
      out.write("    		<div class=\"box\" style=\"background: #2d3e3f\">\n");
      out.write("    				<input type=\"Submit\" name=\"Submit\" class=\"submit\" value=\"SUBMIT\">\n");
      out.write("    		</div>\n");
      out.write("    		<!---Submit Button----->\n");
      out.write("      </form>\n");
      out.write("  </div>\n");
      out.write("	\n");
      out.write(" \n");
      out.write("  <!--Body of Form ends--->\n");
      out.write("  \n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("    ");
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
