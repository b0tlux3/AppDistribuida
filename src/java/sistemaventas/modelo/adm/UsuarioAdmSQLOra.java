/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaventas.modelo.adm;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import sistemaventas.dao.Conecta;
import sistemaventas.vo.Usuario;

/**
 *
 * @author Admin
 */
public class UsuarioAdmSQLOra implements IUsuarioAdm{

    
    public ArrayList<Usuario> getUsuarios() {
        ArrayList listaUsuarios = new ArrayList();
        Conecta conecta = new Conecta();
        Connection conn = conecta.getConnection();
        
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select dni,id_perfil,ap_paterno,ap_materno, nombres,fec_registro,fec_update from usuario");
            while (rs.next()) {
                Usuario usu = new Usuario();
                usu.setDni(rs.getString(1));
                usu.setIdPerfil(rs.getDouble(2));
                usu.setApePaterno(rs.getString(3));
                usu.setApeMaterno(rs.getString(4));
                usu.setNombres(rs.getString(5));
                usu.setFecRegis(rs.getDate(6));
                usu.setFecModif(rs.getDate(7));
                listaUsuarios.add(usu);
            }
            rs.close();
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("No se pudo obtener los registros de la base de datos. Mensaje: "+ e.getMessage());
        }
        
        return listaUsuarios;
    }

    @Override
    public int insertUsuario(Usuario usu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateUsuario(Usuario usu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
