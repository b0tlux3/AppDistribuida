/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaventas.modelo;

/**
 *
 * @author Docente
 */
public class Producto {
    private String codigo;
    private String descripcion;
    private long precio;

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @return the precio
     */
    public long getPrecio() {
        return precio;
    }
    
    Producto(String codigo, String descripcion, long precio){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }
}
