package tiendita.controlador;

import javax.swing.JList;

/**
 *
 * @author yuli
 */

public interface IVenta {
    
    public boolean validarCodigoV(String codigo);
    public boolean validarIDCliente(String idCliente);
    public boolean validarCliente(String cliente);
    public boolean validarDireccion(String direccion);
    public boolean inicializarProductos(JList list);
    
    public void realizarVenta();  
}
