package tiendita.controlador;

/**
 *
 * @author yuli
 */

public interface IVenta {
    
    public boolean validarCodigoV(int codigo);
    public boolean validarIDCliente(String idCliente);
    public boolean validarCliente(String cliente);
    public boolean validarDireccion(String direccion);
    
    public void realizarVenta();  
}
