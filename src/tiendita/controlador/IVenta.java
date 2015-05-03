package tiendita.controlador;

import java.util.ArrayList;
import javax.swing.JList;
import javax.swing.JTable;
import tiendita.modelo.Producto;

/**
 *
 * @author yuli
 */

public interface IVenta {
      
    public boolean validarCodigoV(String codigo);
    public boolean validarIDCliente(String idCliente);
    public boolean validarCliente(String cliente);
    public boolean validarDireccion(String direccion);
    public ArrayList<Producto> getLista();
    public void inicializarProductos(JList list);
    public void agregarCesta(JList jlist, JTable jtable);
    public void realizarVenta(JTable jtable);  
}
