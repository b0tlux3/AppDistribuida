/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaventas.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import sistemaventas.vo.Pais;
import java.util.ArrayList;


public class PaisAdm {
    
    public ArrayList<Pais> getListaPais(){
        Conecta conecta = new Conecta();
        Connection conn = conecta.getConnection();        
        ArrayList<Pais> listaPais = new ArrayList();
        
        Pais pais1 = new Pais();
        Pais pais2 = new Pais();
        Pais pais3 = new Pais();
        
        pais1.setId("01");
        pais1.setNombre("Peru");
        pais1.setRegionId("01");
        
        pais2.setId("02");
        pais2.setNombre("Brasil");
        pais2.setRegionId("01");
        
        pais3.setId("03");
        pais3.setNombre("Venezuela");
        pais3.setRegionId("01");
        
        listaPais.add(pais1);
        listaPais.add(pais2);
        listaPais.add(pais3);
        /*
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select country_id, country_name, region_id from countries");
            
            while (rs.next()) {                
                Pais pais = new Pais();
                pais.setId(rs.getString(1));
                pais.setNombre(rs.getString(2));
                pais.setRegionId(rs.getString(3));
                listaPais.add(pais);
                
            }
                
            
        } catch (Exception e) {
            System.out.println("Se tiene el siguiente error: " + e.getMessage() );
        }
        */
        return listaPais;
    }
    
}
