
package lab3_luisflores_jesusmeraz;


public class Comida extends Productos{
    String fecha;
    String tipo_productos;

    public Comida() {
        super();
    }

    public Comida(String fecha, String tipo_productos, String descripcion, String nombre, int precio) {
        super(descripcion, nombre, precio);
        this.fecha = fecha;
        this.tipo_productos = tipo_productos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo_productos() {
        return tipo_productos;
    }

    public void setTipo_productos(String tipo_productos) {
        this.tipo_productos = tipo_productos;
    }

    @Override
    public String toString() {
        return super.toString()+"Comida{" + "fecha=" + fecha + ", tipo_productos=" + tipo_productos + '}';
    }
    
}
