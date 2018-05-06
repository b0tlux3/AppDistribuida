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
public class Computadora extends Producto{
    String procesador;
    
    public Computadora(String codigo, String descripcion, long precio, String procesador) {
        super(codigo, descripcion, precio);
        this.procesador =  procesador;
    }
    
}
