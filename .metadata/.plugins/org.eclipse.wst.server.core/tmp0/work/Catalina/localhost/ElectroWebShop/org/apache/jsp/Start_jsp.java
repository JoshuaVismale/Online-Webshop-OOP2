/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.19
 * Generated at: 2019-05-05 01:36:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Start_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<title>Homepage</title>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Roboto\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Montserrat\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".w3-sidebar a {\r\n");
      out.write("\tfont-family: \"Roboto\", sans-serif\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body, h1, h2, h3, h4, h5, h6, .w3-wide {\r\n");
      out.write("\tfont-family: \"Montserrat\", sans-serif;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<body class=\"w3-content\" style=\"max-width: 1200px\">\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, true);
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "startHeader.jsp", out, true);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- !PAGE CONTENT! -->\r\n");
      out.write("\t<div class=\"w3-main\" style=\"margin-left: 250px\">\r\n");
      out.write("\r\n");
      out.write("\t\t<h3 class=\"w3-center w3-text-indigo\">Welcome to Electro-World!</h3>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Push down content on small screens -->\r\n");
      out.write("\t\t<div class=\"w3-hide-large\" style=\"margin-top: 83px\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Image header -->\r\n");
      out.write("\t\t<div class=\"w3-display-container w3-container\">\r\n");
      out.write("\t\t\t<img src=\"Images/banner1.jpg\" alt=\"Electro\"\r\n");
      out.write("\t\t\t\tstyle=\"max-width: 1200px; width: 100%\">\r\n");
      out.write("\t\t\t<div class=\"w3-display-topleft w3-text-white\"\r\n");
      out.write("\t\t\t\tstyle=\"padding: 24px 48px\">\r\n");
      out.write("\t\t\t\t<h1 class=\"w3-jumbo w3-hide-small\">Large Collection of\r\n");
      out.write("\t\t\t\t\tElectronics</h1>\r\n");
      out.write("\t\t\t\t<h1 class=\"w3-hide-large w3-hide-medium\">Large Collection of\r\n");
      out.write("\t\t\t\t\tElectronics</h1>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<a href=\"/ElectroWebShop/ListAll\" class=\"w3-button w3-black w3-padding-large w3-large\">SHOP\r\n");
      out.write("\t\t\t\t\t\tNOW</a>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- Push down content on small screens -->\r\n");
      out.write("\t\t<div class=\"w3-hide-large\" style=\"margin-top: 83px; width: 100%\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"w3-container w3-xlarge w3-text-black\">\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t<b>Best Sellers</b>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Product grid -->\r\n");
      out.write("\t\t<div class=\"w3-row\">\r\n");
      out.write("\t\t\t<div class=\"w3-col l3 s6\">\r\n");
      out.write("\t\t\t\t<div class=\"w3-container w3-button\">\r\n");
      out.write("\t\t\t\t\t<img src=\"Images/Asus1.jpg\" alt=\"Asus\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"max-width: 100%; width: 100%; height: auto;\">\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\tAsus ROG Strix II<br> <b>$1609.99</b>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"w3-container w3-button\">\r\n");
      out.write("\t\t\t\t\t<img src=\"Images/HP-Omen.jpeg\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"max-width: 100%; width: 100%; height: auto;\">\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\tHP OMEN 15-CE018DX<br> <b>$849.00</b>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"w3-col l3 s6\">\r\n");
      out.write("\t\t\t\t<div class=\"w3-container \" >\r\n");
      out.write("\t\t\t\t\t<a href=\"\"><img src=\"Images/Alienware.jpg\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"max-width: 100%; width: 100%; height: auto;\"><input type=\"button\"  ></a>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\tAlienware M15<br> <b>$1249.99</b>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"w3-container w3-button\">\r\n");
      out.write("\t\t\t\t\t<img src=\"Images/acer.predator.jpeg\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"max-width: 100%; width: 100%; height: auto;\">\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\tAcer Predator 21-X<br> <b>$8999</b>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"w3-col l3 s6\">\r\n");
      out.write("\t\t\t\t<div class=\"w3-container w3-button\">\r\n");
      out.write("\t\t\t\t\t<img src=\"Images/Xbox one.jpg\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"max-width: 100%; width: 100%; height: auto;\">\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\tMicrosoft Xbox One S<br> <b>$269.99</b>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"w3-container w3-button\">\r\n");
      out.write("\t\t\t\t\t<div class=\"w3-display-container\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"Images/Playstation4.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"max-width: 100%; width: 100%; height: auto;\"> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"w3-tag w3-display-topleft\">Sale</span>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"w3-display-middle w3-display-hover\">\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"w3-button w3-black\">\r\n");
      out.write("\t\t\t\t\t\t\t\tBuy now <i class=\"fa fa-shopping-cart\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\tPlaystation 4 Pro 1TB<br> <b class=\"w3-text-red\">$474.99</b>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"w3-col l3 s6\">\r\n");
      out.write("\t\t\t\t<div class=\"w3-container w3-button\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<img src=\"Images/Elegoo.jpg\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"max-width: 100%; width: 100%; height: auto;\">\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\tELEGOO Mega 2560 Starter Kit<br> <b>$50.99</b>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"w3-container w3-button\">\r\n");
      out.write("\t\t\t\t\t<img src=\"Images/Nvidia.jpg\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"max-width: 100%; width: 100%; height: auto;\">\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\tEVGA GeForce GTX 1080 Ti<br> <b>$769.99</b>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- Subscribe section -->\r\n");
      out.write("\t\t<form method=\"get\" action=\"Subscribe\">\r\n");
      out.write("\t\t\t<div class=\"w3-container w3-black w3-padding-32\">\r\n");
      out.write("\t\t\t\t<h1>Subscribe</h1>\r\n");
      out.write("\t\t\t\t<p>To get special offers and VIP treatment:</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<input class=\"w3-input w3-border\" type=\"text\" name=\"email\" required \r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"Enter e-mail\" style=\"width: 100%\">\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"Subscribe\" class=\"w3-red w3-large w3-round\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, true);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t// Accordion \r\n");
      out.write("\t\tfunction myAccFunc() {\r\n");
      out.write("\t\t\tvar x = document.getElementById(\"demoAcc\");\r\n");
      out.write("\t\t\tif (x.className.indexOf(\"w3-show\") == -1) {\r\n");
      out.write("\t\t\t\tx.className += \" w3-show\";\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tx.className = x.className.replace(\" w3-show\", \"\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t// Click on the \"Jeans\" link on page load to open the accordion for demo purposes\r\n");
      out.write("\t\tdocument.getElementById(\"myBtn\").click();\r\n");
      out.write("\r\n");
      out.write("\t\t// Open and close sidebar\r\n");
      out.write("\t\tfunction w3_open() {\r\n");
      out.write("\t\t\tdocument.getElementById(\"mySidebar\").style.display = \"block\";\r\n");
      out.write("\t\t\tdocument.getElementById(\"myOverlay\").style.display = \"block\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction w3_close() {\r\n");
      out.write("\t\t\tdocument.getElementById(\"mySidebar\").style.display = \"none\";\r\n");
      out.write("\t\t\tdocument.getElementById(\"myOverlay\").style.display = \"none\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
