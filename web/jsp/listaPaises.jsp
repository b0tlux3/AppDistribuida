<%@page import="sistemaventas.vo.Usuario"%>
<%@page import="sistemaventas.vo.Pais"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Paises</title>
    </head>
    <body>
        <%Usuario usu = (Usuario)request.getAttribute("aUsuario");%>
        <p>Bienvenido <%= usu.getNombre()  +", "+ usu.getApePaterno() + usu.getApeMaterno()
            
            %></p>
        <h1>Lista de Paises.</h1>
        <%
            ArrayList<Pais> listaPais =  (ArrayList)request.getAttribute("alistaPais");
        %>
        
        <table>
        <%
        for (int i = 0; i < listaPais.size(); i++) {
            
       %>     
       <tr>
           <td>
            <%=listaPais.get(i).getId()%>
                </td>
           <td>
            <%=listaPais.get(i).getNombre()%>
                </td>
           <td>
            <%=listaPais.get(i).getRegionId()%>
                </td>
                
</tr>                
         <%       
            }
        
        
        %>
        </table>        
    </body>
</html>
