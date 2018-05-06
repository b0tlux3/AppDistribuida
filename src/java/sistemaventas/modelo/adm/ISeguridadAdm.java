package sistemaventas.modelo.adm;

import sistemaventas.vo.Usuario;

public interface ISeguridadAdm {
    public Usuario validarUsuario
        (String usuario, String clave);        
}
