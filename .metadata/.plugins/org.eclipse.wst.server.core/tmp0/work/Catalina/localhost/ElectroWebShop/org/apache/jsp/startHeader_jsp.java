/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.19
 * Generated at: 2019-04-29 23:42:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class startHeader_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Header</title>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Roboto\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Montserrat\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".w3-sidebar a {\r\n");
      out.write("\tfont-family: \"Roboto\", sans-serif\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body, h1, h2, h3, h4, h5, h6, .w3-wide {\r\n");
      out.write("\tfont-family: \"Montserrat\", sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=text] {\r\n");
      out.write("\twidth: 130px;\r\n");
      out.write("\t-webkit-transition: width 0.4s ease-in-out;\r\n");
      out.write("\ttransition: width 0.4s ease-in-out;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* When the input field gets focus, change its width to 100% */\r\n");
      out.write("input[type=text]:focus {\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Dropdown Content (Hidden by Default) */\r\n");
      out.write(".dropdown-content {\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tbackground-color: #f9f9f9;\r\n");
      out.write("\tmin-width: 50px;\r\n");
      out.write("\tbox-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);\r\n");
      out.write("\tz-index: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Links inside the dropdown */\r\n");
      out.write(".dropdown-content a {\r\n");
      out.write("\tcolor: black;\r\n");
      out.write("\tpadding: 8px 10px;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Change color of dropdown links on hover */\r\n");
      out.write(".dropdown-content a:hover {\r\n");
      out.write("\tbackground-color: #f1f1f1\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Show the dropdown menu on hover */\r\n");
      out.write(".drop:hover .dropdown-content {\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Change the background color of the dropdown button when the dropdown content is shown */\r\n");
      out.write(".drop:hover .dropbtn {\r\n");
      out.write("\tbackground-color: #3e8e41;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<body class=\"w3-content\" style=\"max-width: 100%\">\r\n");
      out.write("\t<div class=\"w3-main\" style=\"margin-left: 250px\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Top menu on small screens -->\r\n");
      out.write("\t\t<header class=\"w3-bar w3-top w3-hide-large w3-black w3-xlarge\">\r\n");
      out.write("\t\t\t<div class=\"w3-bar-item w3-padding-24 w3-wide\">Electro-World</div>\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\"\r\n");
      out.write("\t\t\t\tclass=\"w3-bar-item w3-button w3-padding-24 w3-right\"\r\n");
      out.write("\t\t\t\tonclick=\"w3_open()\"> <i class=\"fa fa-bars\"></i>\r\n");
      out.write("\t\t\t</a> <a href=\"login.jsp\"\r\n");
      out.write("\t\t\t\tclass=\"w3-bar-item w3-button w3-padding-24 w3-right\"\r\n");
      out.write("\t\t\t\tonclick=\"login()\"> <i class=\"material-icons\">person</i>\r\n");
      out.write("\t\t\t</a> <a href=\"Start.jsp\"\r\n");
      out.write("\t\t\t\tclass=\"w3-bar-item w3-button w3-padding-24 w3-right\"> <i\r\n");
      out.write("\t\t\t\tclass=\"material-icons\">home</i>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Push down content on small screens -->\r\n");
      out.write("\t\t<div class=\"w3-hide-large\" style=\"margin-top: 83px; width: 100%\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Top header -->\r\n");
      out.write("\t\t<header class=\"w3-container w3-xlarge\">\r\n");
      out.write("\t\t\t<p class=\"w3-left w3-text-blue\">\r\n");
      out.write("\t\t\t\t<b>For all your Electronic needs</b>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<p class=\"w3-right w3-hide-small\">\r\n");
      out.write("\t\t\t\t<a href=\"login.jsp\" class=\"material-icons w3-margin-right w3-button\">person</a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<p class=\"w3-right\">\r\n");
      out.write("\t\t\t\t<i class=\"fa fa-shopping-cart w3-button\" onclick=\"checkout()\"></i>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<form method=\"get\" action=\"Search\">\r\n");
      out.write("\t\t\t\t<p class=\"w3-left\" style=\"margin-left: 20px\" onclick=\"search()\">\r\n");
      out.write("\t\t\t\t\t<i class=\"w3-medium\"><input type=\"text\" name=\"search\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"Search..\"><input type=\"submit\" name=\"search\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"Search\"></i>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<p class=\"w3-right w3-hide-small\">\r\n");
      out.write("\t\t\t\t<a href=\"Start.jsp\" class=\"material-icons w3-button\">home</a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction login() {\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction checkout() {\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction search() {\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
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
