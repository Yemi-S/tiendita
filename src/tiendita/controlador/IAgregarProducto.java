/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tiendita.controlador;

/**
 *
 * @author yuli
 */
public interface IAgregarProducto {
    
    public boolean validarNombre(String nombre);
    public boolean validarStock(String stock);
    public boolean validarPrecio(String precio);
    
    public void agregarProducto();
    
}
