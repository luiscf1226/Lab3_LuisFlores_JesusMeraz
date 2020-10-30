/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_luisflores_jesusmeraz;

import java.util.ArrayList;

/**
 *
 * @author Luis Carlos Flores
 */
public class Clientes extends Personas{
    private double dinero;
    ArrayList <Productos> productos = new ArrayList();

    public Clientes() {
        super();
    }

    public Clientes(double dinero, int id, String username, String contra, String correo, String nombre) {
        super(id, username, contra, correo, nombre);
        this.dinero = dinero;
    }
    public void act(double dinero) {
        
        this.dinero = dinero;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Productos> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Productos> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Clientes{" + "dinero=" + dinero + ", productos=" + productos + '}';
    }
    
    
}
