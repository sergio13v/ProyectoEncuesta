<%-- 
    Document   : Login
    Created on : 08-ene-2020, 20:24:24
    Author     : Articuno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form action ="ServletLogin">
            
            introduce tu nombre
            <input type ="text" name="un"/><br>
            
            introduce tu password
            <input type="password" name="pw"/>
            <input type="submit" value="submit">
            
        </form>
            
    </body>
</html>
