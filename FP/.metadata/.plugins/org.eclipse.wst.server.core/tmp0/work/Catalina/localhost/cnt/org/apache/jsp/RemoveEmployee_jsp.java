/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.82
 * Generated at: 2023-10-24 02:12:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RemoveEmployee_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1698111229973L));
    _jspx_dependants.put("/adminHeader.jsp", Long.valueOf(1698111229956L));
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/home-style.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<script src='https://kit.fontawesome.com/a076d05399.js'></script>\n");
      out.write("</head>\n");
      out.write("    <!--Header-->\n");
      out.write("    <br>\n");
      out.write("    <div class=\"topnav sticky\">\n");
      out.write("   \n");
      out.write("            <center><h2>ADMINISTRATOR</h2></center>\n");
      out.write("            <a href=\"addNewEmployee.jsp\">Add New Employee  <i class='fas fa-plus-square'></i></a>\n");
      out.write("            <a href=\"updateEmployeeDetails.jsp\">Update Employee  <i class='fab fa-elementor'></i></a>\n");
      out.write("            <a href=\"RemoveEmployee.jsp\">Delete Employee <i class='fas fa-window-close'></i></a>\n");
      out.write("           <a href=\"logout\">Logout <i class='fas fa-share-square'></i></a>\n");
      out.write("          </div>\n");
      out.write("           <br>\n");
      out.write("           <!--table-->");
      out.write('\n');
      out.write(" <div class=\"footer\">\n");
      out.write("          <p>created by MMBP Designers</p>\n");
      out.write("      </div>");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/addNewProduct-style.css\">\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>remove employee</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<form action =\"removeEmployee\" method = \"post\">\n");
      out.write("\n");
      out.write("<div class=\"left-div\">\n");
      out.write(" <h3>Enter Name</h3>\n");
      out.write(" <center><input class = \"T\" type=\"text\" name=\"name\" required></center>\n");
      out.write(" </div>\n");
      out.write(" \n");
      out.write("<hr>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"right-div\">\n");
      out.write("<h3>Enter Email</h3>\n");
      out.write("<center><input class = \"T\" type=\"email\" name=\"email\" required></center>\n");
      out.write(" </div>\n");
      out.write("<hr>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"right-div\">\n");
      out.write("<h3>Enter Department</h3>\n");
      out.write("<center><input class = \"T\" type=\"text\" name=\"department\" required></center>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<hr>\n");
      out.write("	\n");
      out.write(" <br>\n");
      out.write(" <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("<button class = \"button\">Remove</button>\n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write(" </form>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
