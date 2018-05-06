package sistemaventas.modelo.adm;

import java.util.ArrayList;
import sistemaventas.vo.Usuario;

public interface IUsuarioAdm {
    public ArrayList getUsuarios();
    public int insertUsuario(Usuario usu);
    public int updateUsuario(Usuario usu);    
    
}
