<%@page import="sistemaventas.vo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
Usuario busuario = session.getAttribute("bUsuario")!=null?(Usuario)session.getAttribute("bUsuario"):new Usuario();
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
    int n1 = 20;
    int n2 = 40;
    %>
    <body>
        <p align="rigth">Usuario: <%=busuario.getNombres()%>, <%=busuario.getApePaterno()%>  </p>
        <h1>Hola Mundo!</h1>
        <p> El resultado de la suma de n1 y n2 es: <%=n1 + n2%>
    </body>
</html>
