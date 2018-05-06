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
public class Celular extends Producto {
    String modelo;
    
    public Celular(String codigo, String descripcion, long precio, String modelo) {
        super(codigo, descripcion, precio);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }


    
    
}
