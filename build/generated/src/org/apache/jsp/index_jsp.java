package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"ES\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Inicio</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"aspecto.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Practica 9 JAVA Web: JSP</h1>\n");
      out.write("        <h3>Autores: </h3>\n");
      out.write("        <ul>\n");
      out.write("            <li>Fernado Rodriguez Gelo</li>\n");
      out.write("            <li>Victor Lozano Granja</li>\n");
      out.write("            <li>José Abel Venegas Aramguren</li>\n");
      out.write("        </ul>\n");
      out.write("        <p>Descripcion: </p>\n");
      out.write("        \n");
      out.write("        <nav>\n");
      out.write("            <p>Los puntos a tratar son: verZodiaco, <a href=\"verLista.jsp\">verLista</a> , <a href=\"verTabla.jsp\">verTabla</a></p>\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("        <hr>\n");
      out.write("        <form action=\"verZodiaco.jsp\" method=\"post\">\n");
      out.write("            <nav>\n");
      out.write("                <label for=\"Nombre\">Nombre: </label>\n");
      out.write("                <input type=\"Text\" id=\"Nombre\" name=\"nombre\">\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <nav>\n");
      out.write("                <label for=\"Apellido\">Apellido: </label>\n");
      out.write("                <input type=\"Text\" id=\"Apellido\" name=\"apellido\">\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <nav>\n");
      out.write("                <label for=\"Date\">Fecha Nacimiento: </label>\n");
      out.write("                <input type=\"date\" id=\"Date\" name=\"FechaNacimiento\">\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <nav>\n");
      out.write("                <input type=\"submit\" value=\"Ver Zodiaco\">\n");
      out.write("            </nav>\n");
      out.write("        </form>\n");
      out.write("        <hr>\n");
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
