package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Profile</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("<link href=\"https://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css\" rel=\"stylesheet\">\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("\t.menu {\n");
      out.write("\t\tmargin-left: -15px; \n");
      out.write("\t\tmargin-right: 15px;\n");
      out.write("\t}\n");
      out.write("\t.daftar{\n");
      out.write("\t\tborder: 2px solid #e5e5e5; \n");
      out.write("\t\tborder-radius: 5px; \n");
      out.write("\t\tpadding: 5px;\n");
      out.write("\t}\n");
      out.write("\t.table th, .table td{\n");
      out.write("\t\ttext-align: center;\n");
      out.write("\t}\n");
      out.write("\t.nav{\n");
      out.write("\t\tpadding: 5px; \n");
      out.write("\t\tborder: 2px solid #e5e5e5;\n");
      out.write("\t\tborder-radius: 5px;\n");
      out.write("\t}\n");
      out.write("\t.nav li{\n");
      out.write("\t\tborder-bottom: 2px solid #e5e5e5;\n");
      out.write("\t\tborder-radius: 5px;\n");
      out.write("\t}\n");
      out.write("\t.daftar h3{\n");
      out.write("                margin-top: 50px;\n");
      out.write("\t\tmargin-bottom: 25px;\n");
      out.write("\t}\n");
      out.write("\t</style>\n");
      out.write("</head>\n");
      out.write(" <style type=\"text/css\">\n");
      out.write("      .jumbotron.new {\n");
      out.write("          position: relative;\n");
      out.write("          background: url(img/bg-jumbotron.jpg) center center;\n");
      out.write("          color:#fff;\n");
      out.write("          width: 100%;\n");
      out.write("          height: 100%;\n");
      out.write("          background-size: cover;\n");
      out.write("          overflow: hidden;\n");
      out.write("      }\n");
      out.write("      body{\n");
      out.write("          background-image:url(img/bg-body.jpg);\n");
      out.write("          color:#fff;\n");
      out.write("\t  background-size:cover;\n");
      out.write("\t  background-attachment: fixed;\n");
      out.write("\t\t}\n");
      out.write("       .warna{\n");
      out.write("          font-size:24px; \n");
      out.write("          background-color:white;\n");
      out.write("          color:blue;\n");
      out.write("\t\t}\n");
      out.write("    </style>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"jumbotron new\">\n");
      out.write("\t<center><h2><b>Data Mahasiswa</b></h2>\n");
      out.write("\t<p>Modul RSBK - Kelompok20</p>\n");
      out.write("        <h5>Selamat Datang, ");
      out.print(session.getAttribute("userName"));
      out.write("</h6></center>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row content col-md-8 col-md-offset-2\">\n");
      out.write("\t<div class=\"col-md-3 menu\">\n");
      out.write("\t<ul class=\"nav nav-pills nav-stacked\" style=\"\">\n");
      out.write("            <li><a href=\"./StudentServlet\">Home<span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("            <li><a href=\"./login.jsp\">Logout</a></li>\n");
      out.write("            <li><a href=\"#\"><span class=\"glyphicon glyphicon-user warna\" ></i></span></a></li>\n");
      out.write("\t</ul>\n");
      out.write("\t</div>\n");
      out.write("         \n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row mt-3\">\n");
      out.write("        <div class=\"col-md-6\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                <h2>Haloo</h2></center>\n");
      out.write("            <p class=\"card-text\">Perkenalkan,kami dari kelompok 20 praktikum RSBK, yang terdiri dari : <br>1. Mutiara Victorina M (21120116120010) <br>2. Nisrina Fauziah (21120116120031)<br> Kami adalah mahasiswa Teknik Komputer Universitas Diponegoro angkatan 2016.</p>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
