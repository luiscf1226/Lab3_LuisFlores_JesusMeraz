/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_luisflores_jesusmeraz;

/**
 *
 * @author Luis Carlos Flores
 */
public class Empleados extends Personas {
    private String horario;
    private int productos;

    public Empleados() {
        super();
    }

    public Empleados(String horario, int productos, int id, String username, String contra, String correo, String nombre) {
        super(id, username, contra, correo, nombre);
        this.horario = horario;
        this.productos = productos;
    }

    public Empleados(String horario, int productos) {
        this.horario = horario;
        this.productos = productos;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getProductos() {
        return productos;
    }

    public void setProductos(int productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return super.toString()+"Empleados{" + "horario=" + horario + ", productos=" + productos + '}';
    }
    
}
