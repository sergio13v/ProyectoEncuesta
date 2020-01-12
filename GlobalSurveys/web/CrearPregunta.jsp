<%-- 
    Document   : CrearPregunta
    Created on : 08-ene-2020, 20:23:23
    Author     : Articuno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Creador de Preguntas</title>
    </head>
    <body>
        <form action="ServletCrear">
             <input type="hidden" name="id" value="0" />
            CREADOR DE PREGUNTAS <br/> Enunciado de la pregunta:<input type="text" name="pregunta" value="" /> <br/>
            
            
           
           <input type="submit" value="Enviar" />
        </form>
    </body>
</html>