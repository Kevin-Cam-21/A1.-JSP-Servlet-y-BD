<%-- 
    Document   : editar
    Created on : 6/07/2022, 05:40:16 PM
    Author     : Yonathan Uriel Pastrana Tepectzin y Kevin Ulises Garcia Camacho
--%>

<%@page import="dao.DAOAlumno"%>
<%@page import="beans.Alumno"%>
<%@page import="servlets.SAlumnos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
       <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="recursos/css/estilos.css">
    <link href="recursos/bootstrap/css/theme.css" rel="stylesheet">
    <link href="recursos/css/style.css" rel="stylesheet">
    <script
    src="https://kit.fontawesome.com/ac778e692e.js"
    crossorigin="anonymous"
  ></script>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

        <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,300,700,100' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Raleway:300,700,900,500' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/typicons/2.0.7/typicons.min.css">
        <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="/assets/css/pushy.css">
        <link rel="stylesheet" href="/assets/css/masonry.css">
        <link rel="stylesheet" href="/assets/css/animate.css">
        <link rel="stylesheet" href="/assets/css/magnific-popup.css">
        <link rel="stylesheet" href="/assets/css/odometer-theme-default.css">
        <script>
        window.odometerOptions = {
          selector: '.odometer',
          format: '(,ddd)', 
          duration: 13000, 
          theme: 'default'
        };
        </script>
        
        <title>Editar alumno</title>
    </head>
    <body>
         <div class="site-overlay"></div>

      <header id="home">
          <div class="container-fluid">
              <div class="container">
                  <div class="row">
                      <div class="col-md-3 col-xs-10">
                          <a href="#" class="thumbnail logo">
                        </a>
                      </div>
                      <div class="col-md-1 col-md-offset-8 col-xs-2 text-center">
                        <div class="menu-btn"><span class="hamburger">&#9776;</span></div>
                      </div>
                  </div>
                  <div class="jumbotron">
                      <h1><small></small></br>
          <strong>Editar alumno
                      </strong></h1>
                  </div>
              </div>
          </div>
      </header>
        <%
            DAOAlumno dao = new DAOAlumno();
            String matricula = request.getAttribute("matricula").toString();
            Alumno alumno = dao.buscar(matricula);
        %>
        <div class='form-register'>
            <form action='SAlumnos' method='post' id='formulario'>
                <div class='form-group'>
                    <input type="hidden" name="tfMatriculaOld" value="<%=alumno.getMatricula() %>">
                </div>
                <div class='form-group'>
                    <label for='lblMatricula'>MATRICULA</label>
                    <input type='text' class='controls' name='tfMatricula' value="<%=alumno.getMatricula()%>" placeholder="Ingrese la matricula" required> 
                </div>
                <div class='form-group'>
                    <label for='lblNombre'>NOMBRE</label>
                    <input type='text' class='controls' name='tfNombre' value="<%=alumno.getNombre()%>" placeholder="Ingrese el nombre" required>
                </div>
                <div class='form-group'>
                    <label for='lblApellidoPaterno'>APELLIDO PATERNO</label>
                    <input type='text' class='controls' name='tfApellidoPaterno' value="<%=alumno.getApellidoPaterno()%>" placeholder="Ingrese el apellido paterno" required>
                </div>
                <div class='form-group'>
                    <label for='lblApellidoMaterno'>APELLIDO MATERNO</label>
                    <input type='text' class='controls' name='tfApellidoMaterno' value="<%=alumno.getApellidoMaterno()%>" placeholder="Ingrese el apellido materno" required> 
                </div>
                <div class='form-group'>
                    <label for='lblDdi'>DDI</label>
                    <input type='number' class='controls' name='tfDdi' value="<%=alumno.getDdi()%>" placeholder="Ingrese la calificación de DDI" required> 
                </div>
                <div class='form-group'>
                    <label for='lblDwi'>DWI</label>
                    <input type='number' class='controls' name='tfDwi' value="<%=alumno.getDwi()%>" placeholder="Ingrese la calificación de DWI" required>
                </div>
                <div class='form-group'>
                    <label for='lblEcbd'>ECBD</label>
                    <input type='number' class='controls' name='tfEcbd' value="<%=alumno.getEcbd()%>" placeholder="Ingrese la calificación de ECBD" required>
                </div>
                <button type='submit' class='botons' name='accion' value="actualizar">Actualizar</button>
                <a href="SAlumnos">Regresar</a>
            </form> 
        </div> 
                 <footer>
    <div class="container">
        <div class="row">
            <div class="col-md-8">
                <h3>UT Chilapa</h3>
                <p>© Derechos reservados © UT Chilapa<a target="_blank" href=""></a></p>
            </div>
            <div class="col-md-4">
                <p class="text-right social"><i class="typcn typcn-social-facebook-circular"></i><i class="typcn typcn-social-twitter-circular"></i></p>
            </div>
        </div>
    </div>
</footer>
            <script src="/assets/js/jquery.min.js"></script>
            <script src="/bootstrap/js/bootstrap.min.js"></script>
            <script src="https://netdna.bootstrapcdn.com/twitter-bootstrap/2.0.4/js/bootstrap-scrollspy.js"></script>
            <script src="/assets/js/ie10-viewport-bug-workaround.js"></script>
            <script src="http://masonry.desandro.com/masonry.pkgd.js"></script>
            <script src="/assets/js/masonry.js"></script>
            <script src="/assets/js/pushy.min.js"></script>
            <script src="/assets/js/jquery.magnific-popup.min.js"></script>
            <script src="/assets/js/wow.min.js"></script>
            <script src="/assets/js/scripts.js"></script>
            <script src="/assets/js/odometer.js"></script>
            <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"
          ></script>
    </body>
</html>
