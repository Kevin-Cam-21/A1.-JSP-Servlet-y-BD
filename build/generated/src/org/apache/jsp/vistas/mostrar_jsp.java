package org.apache.jsp.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import beans.Alumno;
import dao.DAOAlumno;
import servlets.SAlumnos;

public final class mostrar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Mostar</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Lista de alumnos</h1>\n");
      out.write("        <div>\n");
      out.write("            <a href=\"SAlumnos?accion=nuevo\">Agregar Nuevo</a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        ");

            DAOAlumno daoAlumno = new DAOAlumno();
            ArrayList<Alumno> listAlumnos = daoAlumno.mostrar();
            Alumno alumno = null;
            for(int i = 0; i<listAlumnos.size(); i++)
            {
                alumno = listAlumnos.get(i);
        
      out.write("\n");
      out.write("        \n");
      out.write("    <tr>\n");
      out.write("        <td>");
      out.print( alumno.getMatricula());
      out.write("</td>\n");
      out.write("        <td>");
      out.print( alumno.getNombre());
      out.write("</td>\n");
      out.write("        <td>");
      out.print( alumno.getApellidoPaterno());
      out.write("</td>\n");
      out.write("        <td>");
      out.print( alumno.getApellidoMaterno());
      out.write("</td>\n");
      out.write("        <td>");
      out.print( alumno.getDdi());
      out.write("</td>\n");
      out.write("        <td>");
      out.print( alumno.getDwi());
      out.write("</td>\n");
      out.write("        <td>");
      out.print( alumno.getEcbd());
      out.write("</td>\n");
      out.write("        <td>");
      out.print( alumno.getProm());
      out.write("</td>\n");
      out.write("        <td><a href=\"SAlumnos?accion=editar&matricula=");
      out.print( alumno.getMatricula());
      out.write("\">Editar</a></td> \n");
      out.write("        <td><a href=\"SAlumnos?accion=eliminar&matricula=");
      out.print( alumno.getMatricula());
      out.write("\">Eliminar</a></td> \n");
      out.write("    </tr>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
