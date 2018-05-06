package sistemaventas.modelo.adm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import sistemaventas.dao.Conecta;
import sistemaventas.vo.Usuario;

public class SeguridadAdmSQLOra implements 
        ISeguridadAdm{

    
    public Usuario validarUsuario(String usuario, String clave) {
 Usuario usuObj = null;
        
        Conecta conecta = new Conecta();
        Connection conn = conecta.getConnection();

        try {

            PreparedStatement ps = conn.prepareStatement(
                    "select DNI, ID_PERFIL, AP_PATERNO, "
                            + "AP_MATERNO, NOMBRES from "
                            + "usuario where dni = ? and "
                            + "clave = ?");
            ps.setString(1, usuario);
            ps.setString(2, clave);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                usuObj = new Usuario();
                usuObj.setDni(rs.getString(1));
                usuObj.setIdPerfil(rs.getDouble(2));
                usuObj.setApePaterno(rs.getString(3));
                usuObj.setApeMaterno(rs.getString(4));
                usuObj.setNombres(rs.getString(5));
            }
            
            rs.close();
            ps.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("No se pudo validar las credenciales en la base de datos. Mensaje: "+ e.getMessage());
        }           
        
        return usuObj;        
    }
    
}
