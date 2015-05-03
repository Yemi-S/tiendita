package tiendita.modelo;

/**
 *
 * @author yuli
 */
public class Producto {
    
    private int id;
    private String nombre;
    private double cantidad;
    private double precio;
    private String imagen;

    public Producto() {
        this(-1, "NULL", 0, 0, "NULL");
    }

    public Producto(int id, String nombre, double cantidad, double precio, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
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
