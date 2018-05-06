/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaventas.dao;
import sistemaventas.vo.Usuario;
/**
 *
 * @author Admin
 */
public class UsuarioAdm {
    
    public Usuario getUsuario(String userName){
        Usuario usu = new Usuario();
        
        /*
            Conectar a la BD y obtener los datos del usuario.
        Considerar clausula WHERE = userName
        */
        
        usu.setUsername(userName);
        usu.setApeMaterno("Vargas");
        usu.setApePaterno("Farfan");
        usu.setNombre("Juan");
        usu.setClave("12345");
        return usu;
        
    }
    
}
