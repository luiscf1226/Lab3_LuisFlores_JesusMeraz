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
                                    int o1=0;
                                    while (o1!=4){
                                        System.out.println("Creando Local");
                                        System.out.println("1. Crear Tienda");
                                        System.out.println("2. Crear Quisco");
                                        System.out.println("3. Crear Restaurante");
                                        System.out.println("Escoja Opcion: ");
                                        o1=leer.nextInt();
                                        switch(o1){
                                            case 1: 
                                                CrearTienda();
                                            break;
                                            case 2:
                                                Crearquisco();
                                            break;
                                            case 3:
                                                Creares();
                                            break;
                                        }
                                    }
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
    public static void CrearTienda(){
     //  public Tiendas(Ropa ropa, Juguetes juguetes, Comida comida, String nombre, String gerente)
     // 1.Ropa(String tipo, String talla, String descripcion, String nombre, int precio)
     //2.  public Juguetes(String descripcion2, String descripcion, String nombre, int precio)
     //3. public Comida(String fecha, String tipo_productos, String descripcion, String nombre, int precio
        System.out.println(" Ingrese tipo de ropa: ");
        String tipo=leer.next();
        System.out.println("Ingrese su talla: ");
        String talla=leer.next();
        System.out.println("Ingrese Descripcion: ");
        String descripcion=leer.next();
        System.out.println("Nombre Ropa: ");
        String nombre_ropa=leer.next();
        System.out.println("Ingrese Precio: ");
        int precio=leer.nextInt();
        Ropa ropa1=new Ropa(tipo,talla,descripcion,nombre_ropa,precio);//OBJETO ROPA
        System.out.println("Ingrese Descripcion Producto: ");
        String desc_prod=leer.next();
        System.out.println("Ingrese Descripcion Juguete: ");
        String descripcion2=leer.next();
        System.out.println("Ingrese Nombre Juguete: ");
        String name_jug=leer.next();
        System.out.println("Ingrese Precio: ");
        int precio_jug=leer.nextInt();
        Juguetes jug1= new Juguetes (desc_prod,descripcion2,name_jug,precio_jug);//OBJETO JUGUETE
       
        System.out.println("Nombre Tienda: ");
        String nametienda=leer.next();
        System.out.println("Nombre Gerente: ");
        String nameger=leer.next();
        Tiendas t= new Tiendas(ropa1,jug1,nametienda,nameger);//OBJETO Tienda
        locales.add(t);
        tiendas.add(t);
    }
    public static void Crearquisco(){
        // public Quisco(String nombre_tienda, Ropa ropa, Juguetes juguetes, Comida comida, String nombre, String gerente)
        System.out.println(tiendas);
        System.out.println("Ingrese Nombre Tienda: ");
        String ntienda=leer.next();
        System.out.println(" Ingrese tipo de ropa: ");
        String tipo=leer.next();
        System.out.println("Ingrese su talla: ");
        String talla=leer.next();
        System.out.println("Ingrese Descripcion: ");
        String descripcion=leer.next();
        System.out.println("Nombre Ropa: ");
        String nombre_ropa=leer.next();
        System.out.println("Ingrese Precio: ");
        int precio=leer.nextInt();
        precio=precio/2;
        Ropa ropa1=new Ropa(tipo,talla,descripcion,nombre_ropa,precio);//OBJETO ROPA
        System.out.println("Ingrese Descripcion Producto: ");
        String desc_prod=leer.next();
        System.out.println("Ingrese Descripcion Juguete: ");
        String descripcion2=leer.next();
        System.out.println("Ingrese Nombre Juguete: ");
        String name_jug=leer.next();
        System.out.println("Ingrese Precio: ");
        int precio_jug=leer.nextInt();
        precio_jug/=2;
        Juguetes jug1= new Juguetes (desc_prod,descripcion2,name_jug,precio_jug);//OBJETO JUGUETE
        
        System.out.println("Nombre Quisco: ");
        String namequisco=leer.next();
        System.out.println("Nombre Gerente: ");
        String nameger=leer.next();
        Quisco q= new Quisco(ntienda,ropa1,jug1,namequisco,nameger);
        quisco.add(q);
        locales.add(q);
    }
    public static void Creares(){
      //  public Restaurantes(Empleados empleado1, Empleados empleado2, Empleados empleado3, Empleados empleado4, String nombre, String gerente)
      //public Empleados(String horario, int productos, int id, String username, String contra, String correo, String nombre) 
        System.out.println("Horario 1: ");
        String h1=leer.next();
        System.out.println("Productos Empleados");
        int p1=leer.nextInt();
        System.out.println("ID empleado: ");
        int id1=leer.nextInt();
        System.out.println("User Empleado 1: ");
        String u1=leer.next();
        System.out.println("Contra Empleado1: ");
        String c1=leer.next();
        System.out.println("Correo empleado 1: ");
        String correo1=leer.next();
        System.out.println("Nombre Empleado 1: ");
        String n1=leer.next();
        Empleados e1= new Empleados(h1,p1,id1,u1,c1,correo1,n1);//EMPLEADO 1
        System.out.println("Horario 2: ");
        String h2=leer.next();
        System.out.println("Productos Empleados");
        int p2=leer.nextInt();
        System.out.println("ID empleado: ");
        int id2=leer.nextInt();
        System.out.println("User Empleado 2: ");
        String u2=leer.next();
        System.out.println("Contra Empleado 2: ");
        String c2=leer.next();
        System.out.println("Correo empleado 2: ");
        String correo2=leer.next();
        System.out.println("Nombre Empleado 2: ");
        String n2=leer.next();
        Empleados e2= new Empleados(h2,p2,id2,u2,c1,correo2,n2);//EMPLEADO 2
        System.out.println("Horario 3: ");
        String h3=leer.next();
        System.out.println("Productos Empleados");
        int p3=leer.nextInt();
        System.out.println("ID empleado: ");
        int id3=leer.nextInt();
        System.out.println("User Empleado 3: ");
        String u3=leer.next();
        System.out.println("Contra Empleado 3: ");
        String c3=leer.next();
        System.out.println("Correo empleado 3: ");
        String correo3=leer.next();
        System.out.println("Nombre Empleado 3: ");
        String n3=leer.next();
        Empleados e3= new Empleados(h3,p3,id3,u3,c3,correo3,n3);//EMPLEADO 3
         System.out.println("Horario 4: ");
        String h4=leer.next();
        System.out.println("Productos Empleados");
        int p4=leer.nextInt();
        System.out.println("ID empleado: ");
        int id4=leer.nextInt();
        System.out.println("User Empleado 4: ");
        String u4=leer.next();
        System.out.println("Contra Empleado 4: ");
        String c4=leer.next();
        System.out.println("Correo empleado 4: ");
        String correo4=leer.next();
        System.out.println("Nombre Empleado 4: ");
        String n4=leer.next();
        Empleados e4= new Empleados(h4,p4,id4,u4,c4,correo4,n4);//EMPLEADO 4
        System.out.println("Nombre restaurante: ");
        String res=leer.next();
        System.out.println("Nombre Gerente: ");
        String g=leer.next();
        Restaurantes r= new Restaurantes(e1,e2,e3,e4,res,g);
        locales.add(r);
        restaurantes.add(r);
    }
}
