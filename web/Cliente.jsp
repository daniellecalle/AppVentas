<%-- 
    Document   : Cliente
    Created on : 20/05/2018, 04:07:55 PM
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
            <div class="card-header"><h2>Registro de Clientes</h2></div>
            <div class="card-body">
                <form method="post" action="Cliente.jsp">
                    <div class="form-group">
                        <label>Cedula </label>
                        <input type="text" class="form-control"  placeholder="Ingrese Documento ID">                     
                    </div>
                    <div class="form-group">
                        <label>Nombre</label>
                        <input type="text" class="form-control"  
                               placeholder="Ingrese Arituculo" name="txtNombre">                     
                    </div>
                    <div class="form-group">
                        <label>Apellido </label>
                        <input type="text" class="form-control"  
                               placeholder="Ingrese Arituculo" name="txtApellido">                   
                    </div>
                    <div class="form-group">
                        <label>Genero: </label><br>
                        <div class="custom-control custom-radio custom-control-inline">
                            <input type="radio" id="customRadioInline1" name="customRadioInline1" class="custom-control-input">
                            <label class="custom-control-label" for="customRadioInline1">Masculino</label>
                        </div>
                        <div class="custom-control custom-radio custom-control-inline">
                            <input type="radio" id="customRadioInline2" name="customRadioInline1" class="custom-control-input">
                            <label class="custom-control-label" for="customRadioInline2">Femenino</label>
                        </div>             
                    </div>
                    <div class="form-group">
                        <label>Direccion: </label>
                        <input type="text" class="form-control"  placeholder="Ingrese direccion"
                               name="txtDireccion">                     
                    </div>
                
                    <button type="submit" class="btn btn-primary">Guardar</button> 
            </div>
            </form>

            <div class="card-footer bg-light bg-light"></div>
        </div>
    </div>
</center>
</body>
</html>
