package tiendita.controlador;

import java.util.ArrayList;
import tiendita.modelo.Producto;

/**
 *
 * @author yuli
 */

public class Main {
    
    private CVenta venta;
    private ArrayList <Producto> listaProductos;
    
    public Main() {
        ProductoDAO aux = new ProductoDAO();
        listaProductos = aux.leer();
        venta = new CVenta(listaProductos);
    }
    
    public static void main(String[] args) {
        new Main();
    } 
}
