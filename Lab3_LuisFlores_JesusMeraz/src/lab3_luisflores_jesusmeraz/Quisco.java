
package lab3_luisflores_jesusmeraz;


public class Quisco extends Locales {
    String nombre_tienda;
    Ropa ropa;
    Juguetes juguetes;
   

    public Quisco() {
        super();
    }

    public Quisco(String nombre_tienda, Ropa ropa, Juguetes juguetes,  String nombre, String gerente) {
        super(nombre, gerente);
        this.nombre_tienda = nombre_tienda;
        this.ropa = ropa;
        this.juguetes = juguetes;
        
    }

    public String getNombre_tienda() {
        return nombre_tienda;
    }

    public void setNombre_tienda(String nombre_tienda) {
        this.nombre_tienda = nombre_tienda;
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

    @Override
    public String toString() {
        return super.toString()+"Quisco{" + "nombre_tienda=" + nombre_tienda + ", ropa=" + ropa + ", juguetes=" + juguetes + '}';
    }

   

  
    
}
