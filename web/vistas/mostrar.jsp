<%-- 
    Document   : mostrar
    Created on : 6/07/2022, 05:40:29 PM
    Author     : Yonathan Uriel Pastrana Tepectzin y Kevin Ulises Garcia Camacho
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="beans.Alumno"%>
<%@page import="dao.DAOAlumno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostar</title>
    </head>
    <body>
        <h1>Lista de alumnos</h1>
        <div>
            <a href="SAlumnos?accion=nuevo">Agregar Nuevo</a>
        </div>
        
        <%
            DAOAlumno daoAlumno = new DAOAlumno();
            ArrayList<Alumno> listAlumnos = daoAlumno.mostrar();
            Alumno alumno = null;
            for(int i = 0; i<listAlumnos.size(); i++)
            {
                alumno = listAlumnos.get(i);
        %>
        
    <tr>
        <td><%= alumno.getMatricula()%></td>
        <td><%= alumno.getNombre()%></td>
        <td><%= alumno.getApellidoPaterno()%></td>
        <td><%= alumno.getApellidoMaterno()%></td>
        <td><%= alumno.getDdi()%></td>
        <td><%= alumno.getDwi()%></td>
        <td><%= alumno.getEcbd()%></td>
        <td><%= alumno.getProm()%></td>
        <td><a href="SAlumnos?accion=editar&matricula=<%= alumno.getMatricula()%>">Editar</a></td> 
        <td><a href="SAlumnos?accion=eliminar&matricula=<%= alumno.getMatricula()%>">Eliminar</a></td> 
    </tr>
        <%}%>
    </body>
</html>