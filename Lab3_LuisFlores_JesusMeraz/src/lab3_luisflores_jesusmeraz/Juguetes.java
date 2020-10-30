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
public class Juguetes extends Productos {

    private String descripcion2;

    public Juguetes() {
        super();
    }

    public Juguetes(String descripcion2, String descripcion, String nombre, int precio) {
        super(descripcion, nombre, precio);
        this.descripcion2 = descripcion;
    }
     public void act(String descripcion2) {
      
        this.descripcion2 = descripcion2;
    }

    public String getDescripcion2() {
        return descripcion2;
    }

    public void setDescripcion2(String descripcion2) {
        this.descripcion2 = descripcion2;
    }

    @Override
    public String toString() {
        return super.toString()+"Juguetes{" + "descripcion2=" + descripcion2 + '}';
    }
    
}
