package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class success_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org./TR/html4/loose.dtd\">\n");
      out.write("\n");
      com.dvd.model.DVDItem dvdItem = null;
      dvdItem = (com.dvd.model.DVDItem) _jspx_page_context.getAttribute("dvdItem", PageContext.REQUEST_SCOPE);
      if (dvdItem == null){
        throw new java.lang.InstantiationException("bean dvdItem not found within scope");
      }
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>DVD Library Application : Add DVD Success</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <h1>Add DVD Success (JSP)</h1>\n");
      out.write("        \n");
      out.write("        You have add the following DVD: </br>\n");
      out.write("        Title: ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.dvd.model.DVDItem)_jspx_page_context.findAttribute("dvdItem")).getTitle())));
      out.write("<br/>\n");
      out.write("        Year Released: ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.dvd.model.DVDItem)_jspx_page_context.findAttribute("dvdItem")).getYear())));
      out.write("<br/>\n");
      out.write("        Genre of film: ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.dvd.model.DVDItem)_jspx_page_context.findAttribute("dvdItem")).getGenre())));
      out.write("<br/>\n");
      out.write("        \n");
      out.write("        <br/><a href='index.html'>Home</a>\n");
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
