package tiendita.controlador;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
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
    public boolean validarCodigoV(String codigo) {
        try{
            int code = Integer.parseInt(codigo);
            if(code > 0) {
                venta.setId(code);
                return true;
            }
            else
                return false;
        }
        catch(NumberFormatException ne)
                {
                    return false;
                }
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
    
    public void inicializarProductos(JList list)
    {
        DefaultListModel lista = new DefaultListModel();
        /* LEER DE UN ARCHIVO */
        lista.addElement("Pony");
        list.setModel(lista);
    }
}
