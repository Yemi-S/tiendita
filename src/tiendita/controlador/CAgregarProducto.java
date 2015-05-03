package tiendita.controlador;

import java.io.*;
import tiendita.modelo.Producto;
import tiendita.vista.UIAgregarProducto;

/**
 *
 * @author yuli
 */

public class CAgregarProducto implements IAgregarProducto {
    
    private UIAgregarProducto agregarP;
    private Producto producto;
    
    public CAgregarProducto() {
        agregarP = new UIAgregarProducto(this);
        producto = new Producto();
    }
    
    @Override
    public boolean validarNombre(String nombre) {
        if(nombre.length() > 0) {
            producto.setNombre(nombre);
            return true;
        }
        else
            return false;
    }
    
    @Override
    public boolean validarStock(String stock) {
        try {
            double cantidad = Double.parseDouble(stock);
            if(cantidad > 0) {
                producto.setStock(cantidad);
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
    public boolean validarPrecio(String precio) {
        try {
            double price = Double.parseDouble(precio);
            if(price > 0) {
                producto.setPrecio(price);
                return true;
            }
            else
                return  false;
        }
        catch(NumberFormatException ne)
        {
            return false;
        }
    }
    
    @Override
    public boolean agregarProducto() {
        FileWriter fw = null;
        PrintWriter br = null;
        try {
            fw = new FileWriter("src/Recursos/productos.dat", true);
            br = new PrintWriter(fw);
            
            br.println(producto.getNombre());
            br.println(producto.getStock());
            br.println(producto.getPrecio());
            
            return true;
        } catch (IOException ex) {
            return false;
        } finally {
            try {
                if (null != fw)
                   fw.close();
            } catch (IOException ex) { }
        }
        
    }
    
}
