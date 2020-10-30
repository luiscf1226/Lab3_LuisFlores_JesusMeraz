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
public class Tiendas extends Locales {
    Ropa ropa;
    Juguetes juguetes;
    Comida comida;

    public Tiendas() {
        super();
    }

    public Tiendas(Ropa ropa, Juguetes juguetes, Comida comida, String nombre, String gerente) {
        super(nombre, gerente);
        this.ropa = ropa;
        this.juguetes = juguetes;
        this.comida = comida;
    }

    public Ropa getRopa() {
        return ropa;
    }

    public void setRopa(Ropa ropa) {
        this.ropa = ropa;
    }

    public Juguetes getJuguetes() {
        return juguetes;
    }

    public void setJuguetes(Juguetes juguetes) {
        this.juguetes = juguetes;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    @Override
    public String toString() {
        return super.toString()+"Tiendas{" + "ropa=" + ropa + ", juguetes=" + juguetes + ", comida=" + comida + '}';
    }
    
    
}
