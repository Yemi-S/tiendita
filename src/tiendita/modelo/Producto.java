package tiendita.modelo;

/**
 *
 * @author yuli
 */
public class Producto {
    
    private String nombre;
    private double stock;
    private double precio;
    private String imagen;

    public Producto() {
        this("NULL", 0, 0, "NULL");
    }

    public Producto(String nombre, double stock, double precio, String imagen) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double cantidad) {
        this.stock = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
}
