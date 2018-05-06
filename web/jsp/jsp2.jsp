<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="sistemaventas.dao.Conecta"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="sistemaventas.controlador.Servicio"%>
<%@page import="sistemaventas.modelo.Computadora"%>
<%@page import="sistemaventas.modelo.Televisor"%>
<%@page import="sistemaventas.modelo.Celular"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reporte de Celulares.</title>
    </head>
    <body>
        <%
        Celular objCel1 = new Celular("CEL001", "SAMSUNG GALAXY 6", 1200, "S6");
        Celular objCel2 = new Celular("CEL002", "NOKIA N8", 900, "N8");
        Celular objCel3 = new Celular("CEL003", "SONY XPERIA", 750, "Z6");
        Celular objCel4 = new Celular("CEL004", "SAMSUNG J7", 800, "J7");
        
        Televisor objTel1 = new Televisor("Tel001", "LG con conexión WIFI", 5000, "60 PULGADAS");
        Computadora objComp = new Computadora("Com1", "HP escritorio con pantalla led de 15 pulgadas", 1000, "Core i7");
        
        Servicio servicio = new Servicio();
        
        servicio.registrarProducto(objCel1);
        servicio.registrarProducto(objCel2);
        servicio.registrarProducto(objCel3);
        servicio.registrarProducto(objCel4);
        
        servicio.registrarProducto(objTel1);
        servicio.registrarProducto(objComp);
        
        %>
        <h1>Lista de celulares</h1>
        <table>
            <tr>
                <td>Código</td>
                <td>Descripción</td>
                <td>Precio</td>
                <td>Modelo</td>
            </tr>
<%
        ArrayList<Celular> listaCelular = servicio.getListaCelular();
        for (int i = 0; i < listaCelular.size(); i++) {
%> 
            <tr>
                <td><%=listaCelular.get(i).getCodigo()%></td>
                <td><%=listaCelular.get(i).getDescripcion()%></td>
                <td><%=listaCelular.get(i).getPrecio()%></td>
                <td><%=listaCelular.get(i).getModelo()%></td>
            </tr>
            
<%
}
%>            
        </table>   
        
        
    <h1>Lista de productos</h1>
        <table>
            <tr>
                <td>Código</td>
                <td>Descripción</td>
                <td>Precio</td>
                <td>Detalle</td>
            </tr>
            
<%
        Map <Integer,Object> listaProductos = servicio.getProductos();
        
        for(Map.Entry<Integer,Object> entry:listaProductos.entrySet()){
            if(entry.getKey()==1){
                List<Celular> listaCelular1 = (List<Celular>)entry.getValue();
                for(int i=0; i<listaCelular1.size();i++){
                   %>
                        <tr>
                            <td><%=listaCelular.get(i).getCodigo()%></td>
                            <td><%=listaCelular.get(i).getDescripcion()%></td>
                            <td><%=listaCelular.get(i).getPrecio()%></td>
                            <td><%=listaCelular.get(i).getModelo()%></td>
                        </tr>                    
                   <%
                    
                }
            }else if (entry.getKey()==2){
                List<Televisor> listaTelevisor = (List<Televisor>)entry.getValue();
                for (int i = 0; i < listaTelevisor.size(); i++) {
                   %>
                        <tr>
                            <td><%=listaTelevisor.get(i).getCodigo()%></td>
                            <td><%=listaTelevisor.get(i).getDescripcion()%></td>
                            <td><%=listaTelevisor.get(i).getPrecio()%></td>
                            <td><%=listaTelevisor.get(i).getPantalla()%></td>
                        </tr>                    
                   <%                        
                    }
                
            }else if (entry.getKey()==3){
                //Listar Computadora    
            }
        }
%>    

            
         </table>   

<h1>Lista de Países.</h1>

<%
        Conecta conecta = new Conecta();
        Connection conn = conecta.getConnection();
        
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select country_id, country_name, region_id from countries");
            int i = 0;
            %>
            <table>
                <tr><td>Id</td>
                    <td>Código</td>
                    <td>Nombre</td>
                    <td>Región Id</td>
                    </tr>
            <%
            while (rs.next()) {
                i++;
            %>
                <tr>
                    <td><%=i%></td>
                    <td><%=rs.getString(1)%></td>
                    <td><%=rs.getString(2)%></td>
                    <td><%=rs.getString(3)%></td>
                </tr>
            <%
            }
            
            %>
            </table>
                    <%
            
        } catch (Exception e) {
            System.out.println("Se tiene el siguiente error: " + e.getMessage() );
        }
%>

    </body>
</html>
