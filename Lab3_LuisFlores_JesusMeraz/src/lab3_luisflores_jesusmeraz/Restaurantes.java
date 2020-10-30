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
public class Restaurantes extends Locales {
    Empleados empleado1;
    Empleados empleado2;
    Empleados empleado3;
    Empleados empleado4;
    ArrayList<Comida>comidas=new ArrayList();

    public Restaurantes() {
        super();
    }

    public Restaurantes(Empleados empleado1, Empleados empleado2, Empleados empleado3, Empleados empleado4, String nombre, String gerente) {
        super(nombre, gerente);
        this.empleado1 = empleado1;
        this.empleado2 = empleado2;
        this.empleado3 = empleado3;
        this.empleado4 = empleado4;
    }

    public Empleados getEmpleado1() {
        return empleado1;
    }

    public void setEmpleado1(Empleados empleado1) {
        this.empleado1 = empleado1;
    }

    public Empleados getEmpleado2() {
        return empleado2;
    }

    public void setEmpleado2(Empleados empleado2) {
        this.empleado2 = empleado2;
    }

    public Empleados getEmpleado3() {
        return empleado3;
    }

    public void setEmpleado3(Empleados empleado3) {
        this.empleado3 = empleado3;
    }

    public Empleados getEmpleado4() {
        return empleado4;
    }

    public void setEmpleado4(Empleados empleado4) {
        this.empleado4 = empleado4;
    }

    public ArrayList<Comida> getComidas() {
        return comidas;
    }

    public void setComidas(ArrayList<Comida> comidas) {
        this.comidas = comidas;
    }

    @Override
    public String toString() {
        return "Restaurantes{" + "empleado1=" + empleado1 + ", empleado2=" + empleado2 + ", empleado3=" + empleado3 + ", empleado4=" + empleado4 + ", comidas=" + comidas + '}';
    }
    
}
