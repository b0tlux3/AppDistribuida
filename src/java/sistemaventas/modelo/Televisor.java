
package sistemaventas.modelo;

public class Televisor extends Producto implements Promocion{
    String pantalla;
    public Televisor(String codigo, String descripcion, long precio,String pantalla ) {
        super(codigo, descripcion, precio);
        this.pantalla=pantalla;
    }
    
    public int getPromocion() {
        return 20;
    }

    public String getPantalla() {
        return pantalla;
    }
    
}
