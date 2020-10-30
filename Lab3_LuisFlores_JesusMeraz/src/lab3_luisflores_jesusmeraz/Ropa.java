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
public class Ropa extends Productos {
    String tipo;
    String talla;

    public Ropa() {
        super();
    }
     public void Actualizar(String tipo, String talla){
        
        this.tipo = tipo;
        this.talla = talla;
    
    }
    public Ropa(String tipo, String talla, String descripcion, String nombre, int precio) {
        super(descripcion, nombre, precio);
        this.tipo = tipo;
        this.talla = talla;
    }
   

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return super.toString()+"Ropa{" + "tipo=" + tipo + ", talla=" + talla + '}';
    }
    
}
