package tiendita.controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import tiendita.modelo.Venta;

/**
 *
 * @author yuli
 */

public class VentaDAO {
    /*public boolean guardar(ArrayList<Venta> lista)
    {
        FileWriter fw = null;
        PrintWriter br = null;
        try {
            fw = new FileWriter("src/Recursos/ventas.dat");
            br = new PrintWriter(fw);
            Producto p;
            for(int i = 0; i < lista.size(); i++) {
                p = lista.get(i);
                br.println(p.getNombre());
                br.println(p.getStock());
                br.println(p.getPrecio());
            }
            
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
    
    public ArrayList<Venta> leer() {
        ArrayList<Venta> lista = new ArrayList<Venta>();
        File archivoProducto = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            archivoProducto = new File ("src/Recursos/ventas.dat");
            fr = new FileReader (archivoProducto);
            br = new BufferedReader(fr);

            String linea, nombre = "";
            double stock = 0, precio = 0;
            
            int count = 0;

            while((linea = br.readLine()) != null)
            {
                switch (count % 3)
                {
                    case 0:
                        nombre = linea;            
                        break;
                    case 1:
                        stock = Double.parseDouble(linea);
                        break;
                    case 2:
                        precio = Double.parseDouble(linea);
                        lista.add(new Producto(nombre, stock, precio, ""));
                        break;
                }
                count++;
            }
            
            return lista;
        }
        catch(IOException e){
            return null;
        }
        finally {
            try {                    
                if( null != fr ) {   
                   fr.close();     
                }                  
            }
            catch (IOException e2){ }
        }
    }*/
}
