package org.apache.jsp.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.DAOAlumno;
import beans.Alumno;
import servlets.SAlumnos;

public final class editar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos.css\">\n");
      out.write("        <title>Editar alumno</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Editar alumno</h1>\n");
      out.write("        ");

         DAOAlumno dao = new DAOAlumno();
         String matricula = request.getAttribute("matricula").toString();
         Alumno alumno = dao.buscar(matricula);
        
      out.write("\n");
      out.write("        <div class='form-register'>\n");
      out.write("            <form action='SAlumnos' method='post' id='formulario'>\n");
      out.write("                <div class='form-group'>\n");
      out.write("                    <label for='lblMatricula'>MATRICULA</label>\n");
      out.write("                    <input type='text' class='controls' name='tfMatricula' value=\"");
      out.print(alumno.getMatricula());
      out.write("\" placeholder=\"Ingrese la matricula\" required> \n");
      out.write("                </div>\n");
      out.write("                <div class='form-group'>\n");
      out.write("                    <label for='lblNombre'>NOMBRE</label>\n");
      out.write("                    <input type='text' class='controls' name='tfNombre' value=\"");
      out.print(alumno.getNombre());
      out.write("\" placeholder=\"Ingrese el nombre\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class='form-group'>\n");
      out.write("                    <label for='lblApellidoPaterno'>APELLIDO PATERNO</label>\n");
      out.write("                    <input type='text' class='controls' name='tfApellidoPaterno' value=\"");
      out.print(alumno.getApellidoPaterno());
      out.write("\" placeholder=\"Ingrese el apellido paterno\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class='form-group'>\n");
      out.write("                    <label for='lblApellidoMaterno'>APELLIDO MATERNO</label>\n");
      out.write("                    <input type='text' class='controls' name='tfApellidoMaterno' value=\"");
      out.print(alumno.getApellidoMaterno());
      out.write("\" placeholder=\"Ingrese el apellido materno\" required> \n");
      out.write("                </div>\n");
      out.write("                <div class='form-group'>\n");
      out.write("                    <label for='lblDdi'>DDI</label>\n");
      out.write("                    <input type='number' class='controls' name='tfDdi' value=\"");
      out.print(alumno.getDdi());
      out.write("\" placeholder=\"Ingrese la calificación de DDI\" required> \n");
      out.write("                </div>\n");
      out.write("                <div class='form-group'>\n");
      out.write("                    <label for='lblDwi'>DWI</label>\n");
      out.write("                    <input type='number' class='controls' name='tfDwi' value=\"");
      out.print(alumno.getDwi());
      out.write("\" placeholder=\"Ingrese la calificación de DWI\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class='form-group'>\n");
      out.write("                    <label for='lblEcbd'>ECBD</label>\n");
      out.write("                    <input type='number' class='controls' name='tfEcbd' value=\"");
      out.print(alumno.getEcbd());
      out.write("\" placeholder=\"Ingrese la calificación de ECBD\" required>\n");
      out.write("                </div>\n");
      out.write("                <button type='submit' class='botons' name='btnRegistrar' value=\"Actualizar\">Registrar</button>\n");
      out.write("                <a href=\"SAlumnso\">Regresar</a>\n");
      out.write("            </form> \n");
      out.write("        </div> \n");
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
