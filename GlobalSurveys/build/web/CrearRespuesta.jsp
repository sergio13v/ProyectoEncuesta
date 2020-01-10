<%-- 
    Document   : CrearRespuesta
    Created on : 09-ene-2020, 19:05:59
    Author     : Articuno
--%>


<%@page import="java.util.List"%>
<%@page import="GlobalSurveys.Entity.Pregunta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Creador de respuesta</title>
    </head>
    
    <%
        
        List<Pregunta> ListaPreguntas = (List)request.getAttribute("preguntas");
    %>  
    <body>
        <form action="ServletRespuestaGuardar">
             <input type="hidden" name="id" value="0" />
            CREADOR DE RESPUESTAS 
            
            <br/> Enunciado de la respuesta:<input type="text" name="respuesta" value="" /> <br/>
            
            
            A que pregunta quieres asignar esta respuesta?
            
            <select name="preguntas">
                <%
                    for (Pregunta pregunta:ListaPreguntas) {
        
                 %>                       
  <option value="<%= pregunta.getIdPregunta()%>"><%= pregunta.getPregunta() %></option>
                 <%
                     }
                 %>
            
            
           
           <input type="submit" value="Enviar" />
        </form>
    </body>
</html>
