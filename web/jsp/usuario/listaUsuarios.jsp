<%@page import="sistemaventas.vo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
Usuario busuario = session.getAttribute("bUsuario")!=null?(Usuario)session.getAttribute("bUsuario"):new Usuario();
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Usuarios</title>
    </head>
    <body>
        <p align="rigth">Usuario: <%=busuario.getNombres()%>, <%=busuario.getApePaterno()%>  </p>
        <h1>Hello World!</h1>
    </body>
</html>
