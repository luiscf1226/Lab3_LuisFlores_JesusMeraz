package lab3_luisflores_jesusmeraz;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_LuisFlores_JesusMeraz {

    static Scanner leer = new Scanner(System.in);
    static boolean signedInAdmin = false;
    static boolean signedInUser = false;
    static ArrayList<Personas> personas = new ArrayList();
    static ArrayList<Locales> locales = new ArrayList();
    static ArrayList<Productos> productos = new ArrayList();
    static ArrayList<Tiendas> tiendas = new ArrayList();
    static ArrayList<Quisco> quisco = new ArrayList();
    static ArrayList<Restaurantes> restaurantes = new ArrayList();
    static ArrayList<Empleados> empleados = new ArrayList();
    static ArrayList<Clientes> clientes = new ArrayList();
    static ArrayList<Ropa> ropa = new ArrayList();
    static ArrayList<Juguetes> juguetes = new ArrayList();
    static ArrayList<Comida> comida = new ArrayList();

    public static void main(String[] args) {
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("Recuerde...");
            System.out.println("User admin: SUDO");
            System.out.println("Contra: clau123");
            System.out.println("Mall");
            System.out.println("1. Log in SUDO");
            System.out.println("2. Log in Cliente");
            System.out.println("3. Salir");
            System.out.println("Ingrese Opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese Usuario: ");
                    String user = leer.next();
                    System.out.println("Ingrese password: ");
                    String pass = leer.next();
                    if (user.equals("SUDO") && pass.equals("clau123")) {
                        signedInAdmin = true;
                        System.out.println("Bienvenido SUDO");
                    } else {
                        System.out.println("Incorrecto");
                    }
                    while (signedInAdmin) {
                        int opc = 14;
                        while (opc!=13){
                            System.out.println("1. Crear Local");
                            System.out.println("2. Crear Personas");
                            System.out.println("3. Crear Productos");
                            System.out.println("4. Listar Local");
                            System.out.println("5. Listar Personas");
                            System.out.println("6. Listar Productos");
                            System.out.println("7. Modificar Local");
                            System.out.println("8. Modificar Personas");
                            System.out.println("9. Modificar Productos");
                            System.out.println("10. Eliminar Local");
                            System.out.println("11. Eliminar Personas");
                            System.out.println("12. Eliminar Productos");
                            System.out.println("13. Salir");
                            opc=leer.nextInt();
                            switch(opc){
                                case 13:
                                   
                                    signedInAdmin=false;
                                    System.out.println("SALIENDO");
                                break;
                                case 1:
                                    
                                break;
                                case 2:
                                break;
                                case 3:
                                break;
                                case 4:
                                break;
                            }
                           
                        }
                    }
            }
        }
    }
}
