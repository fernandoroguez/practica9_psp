<%-- 
    Document   : verTabla
    Created on : 12-feb-2024, 20:16:19
    Author     : alumno
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="Modelo.ListaElementos"%>
<%@page import="Modelo.Elemento"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="tablas.css">
</head>
<body>
<table>
        <thead>
            <tr>
                <th>Nombre</th>
                <th>Grupo</th>
                <th>Numero</th>
                <th>Fecha</th>
            </tr>
        </thead>
        <tbody>
    <%
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy");  

        ArrayList<Elemento> lista;
        ListaElementos li = new ListaElementos();
        lista = li.getElemento();
            for (Elemento elem : lista) {%>
            <tr class="hover">
                    <td ><%=elem.getNombre()%> </td>
                 <td ><%=elem.getGrupo()%></td>
                  <td ><%=elem.getNumero()%></td>
                  <td ><%=dateFormat.format(elem.getFecha())%></td>
            </tr>
            <%
                }
             %>
        </tbody>
    </table>
    
    <nav>
        <p>volver al inicio <a href="index.jsp">aqui</a></p>
    </nav>
</body>
</html>
