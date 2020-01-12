<%-- 
    Document   : CrearUsuario
    Created on : Jan 10, 2020, 6:09:56 PM
    Author     : sergio13v
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Creador de Usuarios</title>
    </head>
    <body>
        <form action="ServletUsuarioCrear">
             <input type="hidden" name="id" value="0" />
            CREADOR DE USUARIOS<br/>
            Usuario:<input type="text" name="nombreUsuario" value="" /> <br/>
            Contraseña:<input type="password" name="passwordUsuario" value="" /> <br/>
            Este usuario es administrador:<br/>
            <input type="radio" name="adminUsuario" value="true"> Si<br/>
            <input type="radio" name="adminUsuario" value="false"> No<br/>
            
            
           
           <input type="submit" value="Enviar" />
        </form>
    </body>
</html>