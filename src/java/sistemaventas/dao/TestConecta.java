package sistemaventas.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class TestConecta {
    public static void main(String[] args){
        
        Conecta conecta = new Conecta();
        Connection conn = conecta.getConnection();
        
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select country_id, country_name, region_id from countries");
            int i = 0;
            while (rs.next()) {
                i++;
                System.out.print(i+"    ");
                System.out.print("ID"+ rs.getString(1));
                System.out.println("    Nombre"+ rs.getString(2));
            }
            
        } catch (Exception e) {
            System.out.println("Se tiene el siguiente error: " + e.getMessage() );
        }
        
    }
}
