package tiendita.controlador;

import java.util.ArrayList;
import javax.swing.JList;
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
    
    public void realizarVenta();  
}
