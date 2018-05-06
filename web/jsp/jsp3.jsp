<%@page import="java.util.ArrayList"%>
<%@page import="sistemaventas.dao.PaisAdm"%>
<%@page import="sistemaventas.vo.Pais"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    PaisAdm paisAdm = new PaisAdm();
    ArrayList<Pais> listaPais = paisAdm.getListaPais();

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
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
