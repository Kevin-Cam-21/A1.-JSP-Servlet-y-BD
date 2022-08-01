<%-- 
    Document   : nuevo
    Created on : 6/07/2022, 05:40:45 PM
    Author     : Yonathan Uriel Pastrana Tepectzin y Kevin Ulises Garcia Camacho
--%>
<%@page import="servlets.SAlumnos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo registro</title>
    </head>
    <body>
        <h1>AGREGAR ALUMNO</h1>
        <form method="post" action="SAlumnos">
            
            MATRICULA: <br>
            <input input='text' name='tfMatricula'><br>
            NOMBRE: <br>
            <input input='text' name='tfNombre'><br>
            APELLIDO PATERNO: <br>
            <input input='text' name='tfApellidoPaterno'><br>
            APELLIDO MATERNO: <br>
            <input input='text' name='tfApellidoMaterno'><br>
            DDI: <br>
            <input input='number' name='tfDdi'><br>
            DWI: <br>
            <input input='number' name='tfDwi'><br>
            ECBD: <br>
            <input input='number' name='tfEcbd'><br>
            
            <button type="submit" name="accion" value="agregar">Agregar</button>
            <a href="SAlumnos">Regresar</a>
            
        </form>
    </body>
</html>
