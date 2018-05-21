<%-- 
    Document   : Empleado
    Created on : 20/05/2018, 03:32:21 PM
    Author     : daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </head>
    <body>
        <center>      
        <div class="card bg-light mb-3" style="max-width: 24rem; margin-top: 30px;">
            <div class="card-header"><h2>Registro <br> de Empleados</h2></div>
            <div class="card-body">
                 <form method="post" action="Login.jsp">
                     <div class="form-group">
                        <label>Cedula</label>
                        <input type="number" class="form-control"  placeholder="Ingrese documento ID">                     
                    </div>
                    <div class="form-group">
                        <label>Nombre</label>
                        <input type="text" class="form-control"  placeholder="Ingrese Nombre">                     
                    </div>
                     <div class="form-group">
                        <label>Apellido</label>
                        <input type="text" class="form-control"  placeholder="Ingrese Apellido">                     
                    </div>
                    <div class="form-group">
                        <label>N° de Dias Laborados</label>
                        <input type="number" class="form-control"  placeholder="Ingrese usuario">                     
                    </div>
                    <div class="form-group">
                        <label>Valor Hora</label>
                        <input type="number" class="form-control" placeholder="Ingrese Contraseña">
                    </div>
                    <button type="submit" class="btn btn-primary">Guardar</button> 
                </form>
            </div>
            <div class="card-footer bg-light bg-light"></div>
        </div>
    </center>
    </body>
</html>
