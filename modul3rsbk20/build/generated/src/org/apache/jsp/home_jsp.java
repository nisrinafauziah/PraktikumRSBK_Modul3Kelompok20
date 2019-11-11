package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_forEach_var_items.release();
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
      out.write("<title>Home Page</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
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
      out.write("      .warna{\n");
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
      out.write("            <li><a href=\"#\">Home</a></li>\n");
      out.write("            <li><a href=\"./login.jsp\">Logout</a></li>\n");
      out.write("            <li><a href=\"./profile.jsp\"><span class=\"glyphicon glyphicon-user warna\" ></i></span></a></li>\n");
      out.write("\t</ul>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"col-md-9 daftar\">\n");
      out.write("            <form action=\"./StudentServlet\" method=\"POST\">\n");
      out.write("                <table class=\"table table-bordered\">\n");
      out.write("                <tr>\n");
      out.write("                <td>Student ID</td>\n");
      out.write("                <td><input class=\"form-control\" type=\"text\" name=\"studentId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.studentId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                <td>First Name</td>\n");
      out.write("                <td><input class=\"form-control\" type=\"text\" name=\"firstname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                <td>Last Name</td>\n");
      out.write("                <td><input class=\"form-control\" type=\"text\" name=\"lastname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                <tr>\n");
      out.write("                <td>Address</td>\n");
      out.write("                <td><input class=\"form-control\" type=\"text\" name=\"address\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                <td colspan=\"2\">\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\" name=\"action\" value=\"Add\"><span class=\"glyphicon glyphicon-plus\"></span> Add</button>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-default\" name=\"action\" value=\"Edit\"><span class=\"glyphicon glyphicon-edit\"></span> Edit</button>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-danger\" name=\"action\" value=\"Delete\"><span class=\"glyphicon glyphicon-trash\"></span> Delete</button>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-warning\" name=\"action\" value=\"Search\"><span class=\"glyphicon glyphicon-search\"></span> Search</button>\n");
      out.write("                </td>\n");
      out.write("                </tr>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("            <h3 align=\"center\">Informasi Data</h3>\n");
      out.write("\t\t<table class=\"table table-bordered table-hover\">\n");
      out.write("                    <thead>\n");
      out.write("                    <tr>\n");
      out.write("                    <th>No. ID</th>\n");
      out.write("                    <th>First Name</th>\n");
      out.write("                    <th>Last Name</th>\n");
      out.write("                    <th>Address</th>\n");
      out.write("                    </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                    ");
      if (_jspx_meth_s_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("\t</div>\n");
      out.write("    </div>\n");
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

  private boolean _jspx_meth_s_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_s_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_s_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_s_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_s_forEach_0.setParent(null);
    _jspx_th_s_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${allStudents}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_s_forEach_0.setVar("stud");
    int[] _jspx_push_body_count_s_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_s_forEach_0 = _jspx_th_s_forEach_0.doStartTag();
      if (_jspx_eval_s_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <tr>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stud.studentId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stud.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stud.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stud.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    </tr>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_s_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_s_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_forEach_0.doFinally();
      _jspx_tagPool_s_forEach_var_items.reuse(_jspx_th_s_forEach_0);
    }
    return false;
  }
}
