
package lab3_luisflores_jesusmeraz;

import java.util.ArrayList;


public class Locales {
    private String nombre;
    private ArrayList<Empleados> empleados=new ArrayList();
    private ArrayList<Productos> productos=new ArrayList();
    private String gerente;

    public Locales() {
    }

    public Locales(String nombre, String gerente) {
        this.nombre = nombre;
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleados> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleados> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Productos> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Productos> productos) {
        this.productos = productos;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "Locales{" + "nombre=" + nombre + ", empleados=" + empleados + ", productos=" + productos + ", gerente=" + gerente + '}';
    }
    
}
