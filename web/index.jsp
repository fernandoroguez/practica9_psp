<%-- 
    Document   : index
    Created on : 12-feb-2024, 19:41:41
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ES">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        <link rel="stylesheet" href="aspecto.css">
    </head>
    <body>
        <h1>Practica 9 JAVA Web: JSP</h1>
        <h3>Autores: </h3>
        <ul>
            <li>Fernado Rodriguez Gelo</li>
            <li>Victor Lozano Granja</li>
            <li>José Abel Venegas Aramguren</li>
        </ul>
        <p>Descripcion: </p>
        
        <nav>
            <p>Los puntos a tratar son: verZodiaco, <a href="verLista.jsp">verLista</a> , <a href="verTabla.jsp">verTabla</a></p>
        </nav>
        
        <hr>
        <form action="verZodiaco.jsp" method="post">
            <div>
                <label for="Nombre">Nombre: </label>
                <input type="Text" id="Nombre" name="nombre">
            </div>

            <div>
                <label for="Apellido">Apellido: </label>
                <input type="Text" id="Apellido" name="apellido">
            </div>

            <div>
                <label for="Date">Fecha Nacimiento: </label>
                <input type="date" id="Date" name="FechaNacimiento">
            </div>

            <div>
                <input type="submit" value="Ver Zodiaco">
            </div>
        </form>
        <hr>
    </body>
</html>
