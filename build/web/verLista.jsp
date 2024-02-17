<%-- 
    Document   : verLista
    Created on : 12-feb-2024, 20:16:08
    Author     : alumno
--%>
<%@page import="Modelo.ListaElementos"%>
<%@page import="Modelo.Elemento"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="lista.css">
        <title>Ver lista</title>
    </head>
    <body>
        <header>
            <h1>Lista de paises y continentes</h1>
        </header>
        
        
        <section>
            <hr>
            <h3>Paises</h3>
            <hr>

            <%ArrayList<Elemento> listaE;
             ListaElementos l= new ListaElementos();
             listaE=l.getElemento();
              for (Elemento elemento: listaE){ %>
           
              <%if (elemento.getGrupo().equals("Países")) {%>
              
                <article>
                    <h4><%=elemento.getNombre()%></h4>
                    <p>Grupo:<%=elemento.getGrupo()%>.</p>
                    <p>Numero:<%=elemento.getNumero()%>.</p>
                    <p>Fecha:<%=elemento.getFecha()%>.</p>
                    <p>Imagen:<%=elemento.getFoto()%></p>
                </article>  
                
               <% } }%>
        </section>
            
                    
        <section>
            <hr>
            <h3>Continente</h3>
            <hr>

            <%  listaE=l.getElemento();
                for (Elemento elemento: listaE){ %>
           
              <%if (elemento.getGrupo().equals("Continente")) {%>
              
                <article>
                    <h4><%=elemento.getNombre()%></h4>
                    <p>Grupo:<%=elemento.getGrupo()%>.</p>
                    <p>Numero:<%=elemento.getNumero()%>.</p>
                    <p>Fecha:<%=elemento.getFecha()%>.</p>
                    <p>Imagen:<%=elemento.getFoto()%></p>
                </article>  
                
               <% } }%>
            <hr>
        </section>
            
        <br>
        <nav>
            <p>volver al inicio <a href="index.jsp">aqui</a></p>
        </nav>
    </body>
</html>