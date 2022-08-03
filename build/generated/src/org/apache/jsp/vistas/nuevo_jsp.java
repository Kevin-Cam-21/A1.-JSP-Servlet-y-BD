package org.apache.jsp.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import servlets.SAlumnos;

public final class nuevo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Nuevo registro</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>AGREGAR ALUMNO</h1>\n");
      out.write("        <form method=\"post\" action=\"SAlumnos\">\n");
      out.write("            \n");
      out.write("            MATRICULA: <br>\n");
      out.write("            <input input='text' name='tfMatricula'><br>\n");
      out.write("            NOMBRE: <br>\n");
      out.write("            <input input='text' name='tfNombre'><br>\n");
      out.write("            APELLIDO PATERNO: <br>\n");
      out.write("            <input input='text' name='tfApellidoPaterno'><br>\n");
      out.write("            APELLIDO MATERNO: <br>\n");
      out.write("            <input input='text' name='tfApellidoMaterno'><br>\n");
      out.write("            DDI: <br>\n");
      out.write("            <input input='number' name='tfDdi'><br>\n");
      out.write("            DWI: <br>\n");
      out.write("            <input input='number' name='tfDwi'><br>\n");
      out.write("            ECBD: <br>\n");
      out.write("            <input input='number' name='tfEcbd'><br>\n");
      out.write("            \n");
      out.write("            <input type='submit' name='action' value='Agregar'>\n");
      out.write("            <a href=\"SAlumnos\">Regresar</a>\n");
      out.write("            \n");
      out.write("        </form>\n");
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
