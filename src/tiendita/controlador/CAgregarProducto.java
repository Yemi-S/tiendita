package tiendita.controlador;

import java.io.*;
import java.util.ArrayList;
import tiendita.modelo.Producto;
import tiendita.vista.UIAgregarProducto;

/**
 *
 * @author yuli
 */

public class CAgregarProducto implements IAgregarProducto {
    
    private UIAgregarProducto agregarP;
    private Producto producto;
    private ArrayList<Producto> listaP;
    
    public CAgregarProducto(ArrayList<Producto> listaP) {
        this.listaP = listaP;
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
    public void agregarProducto() {
        listaP.add(producto);
    }
    
    public ArrayList<Producto> getLista() {
        return listaP;
    }
    
}
