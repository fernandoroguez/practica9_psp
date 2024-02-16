<%-- 
    Document   : verZodiaco
    Created on : 12-feb-2024, 20:25:47
    Author     : alumno
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ES">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos personales y Zodiaco</title>
    </head>
    <body>
        <%@page import="zodiaco.CalcularZodiaco" %>
        <% 
            String Nombre = request.getParameter("nombre");
            String Apellido = request.getParameter("apellido");
            String FechaNacimiento = request.getParameter("FechaNacimiento");
            
            String ZodiacoNombre;
            int edad;
            
            CalcularZodiaco calcular = new CalcularZodiaco(FechaNacimiento);
            ZodiacoNombre = calcular.getZodiaco();
            edad = calcular.getEdad();
        %>
        
        <h1>Datos personales y Zodiaco</h1>
        <section>
            <article>
                <hr>
                <h3>Datos personales</h3>
                <label>Nombre: <%= Nombre %> <%= Apellido %></label>
                <br>
                <label>Edad: <%= edad %> </label>
                <hr>
            </article>
            
            <article>
                <hr>
                <h3>Zodiaco</h3>
                <label>Tu signo es: <%= ZodiacoNombre %></label>
                <hr>
            </article>
        </section>
        <br>
        <nav>
            <p>volver al inicio <a href="index.jsp">aqui</a></p>
        </nav>
    </body>
</html>
