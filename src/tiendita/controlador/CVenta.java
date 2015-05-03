package tiendita.controlador;

import java.awt.print.PrinterException;
import java.io.*;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import tiendita.modelo.Producto;
import tiendita.modelo.Venta;
import tiendita.vista.UIMain;

/**
 *
 * @author yuli
 */

public class CVenta implements IVenta{
    
    private UIMain ventanaPrincipal;
    private Venta venta;
    private ArrayList <Producto> listaP;
    
    public CVenta(ArrayList <Producto> listaProductos) {
        this.listaP = listaProductos;
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
    public void realizarVenta(JTable jtable){
        try {
            jtable.print();
        } catch (PrinterException ex) { }
    }
    
    public void agregarCesta(JList jlist, JTable jtable)
    {
        int index = jlist.getSelectedIndex();
        String cantidad = JOptionPane.showInputDialog(null, 
        "Ingrese cantidad:", 
        "Cantidad", 
        JOptionPane.INFORMATION_MESSAGE);
        
        double c = Double.parseDouble(cantidad);

        if(c <= listaP.get(index).getStock())
        {   
            listaP.get(index).setStock(listaP.get(index).getStock() - c);
            DefaultTableModel model = (DefaultTableModel) (jtable.getModel());
            Vector<Object> data = new Vector<Object>();
            data.add(c);
            data.add(listaP.get(index).getNombre());
            data.add(listaP.get(index).getPrecio());
            data.add(listaP.get(index).getPrecio()*Double.parseDouble(cantidad));
            model.addRow(data);
        }
        else
            JOptionPane.showMessageDialog(null, "Stock excedido", "Error", ERROR_MESSAGE);
    }
    
    public ArrayList<Producto> getLista()
    {
        return listaP;
    }
    
    public void inicializarProductos(JList jlist)
    {
        DefaultListModel list = new DefaultListModel();
        for(int i = 0; i < listaP.size(); i++) {
            list.addElement(listaP.get(i).getNombre());
        }
        jlist.setModel(list);
    }
}
