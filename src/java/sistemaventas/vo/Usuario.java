package sistemaventas.vo;

import java.sql.Date;

public class Usuario {
    private String username;
    private String nombre;
    private String apePaterno;
    private String apeMaterno;
    private String clave;
    private String dni = "";
    private double idPerfil = 0;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(double idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Date getFecRegis() {
        return fecRegis;
    }

    public void setFecRegis(Date fecRegis) {
        this.fecRegis = fecRegis;
    }

    public Date getFecModif() {
        return fecModif;
    }

    public void setFecModif(Date fecModif) {
        this.fecModif = fecModif;
    }
    private String nombres ="";
    private Date   fecRegis;  
    private Date   fecModif;      

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }
    
    
    
}
