package sistemaventas.controlador;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import sistemaventas.modelo.Celular;
import sistemaventas.modelo.Computadora;
import sistemaventas.modelo.Televisor;

public class Servicio {
    
    ArrayList<Celular> listaCelular = new ArrayList();
    ArrayList<Televisor> listaTelevisor = new ArrayList();
    ArrayList<Computadora> listaComputadora = new ArrayList();
    
    public void registrarProducto(Celular objCelular){
        this.listaCelular.add(objCelular);
    }
    
    public void registrarProducto(Televisor objTelevisor){
        this.listaTelevisor.add(objTelevisor);
    }
    
    public void registrarProducto(Computadora objComputadora){
        this.listaComputadora.add(objComputadora);
    }
    public void imprimirProductos(){
        System.out.println("Pendiente");
        //Imprimir las tres listas.
    }
    public Map<Integer,Object> getProductos(){
        Map<Integer,Object> listaProductos = new HashMap<>();
            listaProductos.put(1, listaCelular);
            listaProductos.put(2, listaTelevisor);
            listaProductos.put(3, listaComputadora);
        return listaProductos;
    }
    
    public ArrayList<Celular> getListaCelular(){
        return this.listaCelular;
    }
    
}
