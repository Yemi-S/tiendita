package tiendita.controlador;

import tiendita.modelo.Venta;
import tiendita.vista.UIMain;

/**
 *
 * @author yuli
 */

public class CVenta implements IVenta{
    
    private UIMain ventanaPrincipal;
    private Venta venta;
    
    public CVenta() {
        venta = new Venta();
        ventanaPrincipal = new UIMain(this);
    }
    
    @Override
    public boolean validarCodigoV(int codigo){
        if(codigo > 0) {
            venta.setId(codigo);
            return true;
        }
        else
            return false;
    }
    
    @Override
    public boolean validarIDCliente(String idCliente) {
        if(idCliente.length() > 8) {
            venta.setIdCliente(idCliente);
            return true;
        }
        else
            return false;
    }
    
    @Override
    public boolean validarCliente(String cliente){
        if(cliente.length() > 0) {
            venta.setNombreCliente(cliente);
            return true;
        }
        else
            return false;
    }
    
    @Override
    public boolean validarDireccion(String direccion){
        if(direccion.length() > 0) {
            venta.setDireccionCliente(direccion);
            return true;
        }
        else
            return false;
    }
    
    @Override
    public void realizarVenta(){
        
    }
    
}
