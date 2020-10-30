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
                        while (opc != 13) {
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
                            opc = leer.nextInt();
                            switch (opc) {
                                case 13:

                                    signedInAdmin = false;
                                    System.out.println("SALIENDO");
                                    break;
                                case 1:
                                    int o1 = 0;
                                    while (o1 != 4) {
                                        System.out.println("Creando Local");
                                        System.out.println("1. Crear Tienda");
                                        System.out.println("2. Crear Quisco");
                                        System.out.println("3. Crear Restaurante");
                                        System.out.println("4. Salir");
                                        System.out.println("Escoja Opcion: ");
                                        o1 = leer.nextInt();
                                        switch (o1) {
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
                                    int o2 = 0;
                                    while (o2 != 3) {
                                        System.out.println("Creando Persona");
                                        System.out.println("1. Crear Empleados");
                                        System.out.println("2. Crear Clientes");
                                        System.out.println("3. Salir");
                                        System.out.println("Escoja Opcion: ");
                                        o2 = leer.nextInt();
                                        switch (o2) {
                                            case 1:
                                                CrearEmp();
                                                break;
                                            case 2:
                                                CreaClientes();
                                                break;

                                        }
                                    }
                                    break;
                                case 3:
                                    int o3 = 0;
                                    while (o3 != 4) {
                                        System.out.println("Creando Producto");
                                        System.out.println("1. Crear Ropa");
                                        System.out.println("2. Crear Juguete");
                                        System.out.println("3. Crear Comida");
                                        System.out.println("4. Salir");
                                        System.out.println("Escoja Opcion: ");
                                        o3 = leer.nextInt();
                                        switch (o3) {
                                            case 1:
                                                CrearRopa();

                                                break;
                                            case 2:
                                                Crearjug();
                                                break;
                                            case 3:
                                                CrearCom();
                                                break;

                                        }
                                    }

                                    break;
                                case 4:

                                    System.out.println("LOCALES!!!!");
                                    String salida = "";
                                    for (Object t : locales) {
                                        salida += "" + locales.indexOf(t) + "- " + t + "\n";
                                    }
                                    System.out.println(salida);
                                    break;
                                case 5:
                                    System.out.println("PERSONAS!!!!");
                                    String salida2 = "";
                                    for (Object t : personas) {
                                        salida2 += "" + personas.indexOf(t) + "- " + t + "\n";
                                    }
                                    System.out.println(salida2);

                                    break;
                                case 6:
                                    System.out.println("PRODUCTOS!!!!");
                                    String salida3 = "";
                                    for (Object t : productos) {
                                        salida3 += "" + productos.indexOf(t) + "- " + t + "\n";
                                    }
                                    System.out.println(salida3);
                                    break;
                                case 7:
                                    int o7 = 0;
                                    while (o7 != 4) {
                                        System.out.println("Modificando Local");
                                        System.out.println("1. Tienda");
                                        System.out.println("2. Quisco");
                                        System.out.println("3. Restaurante");
                                        System.out.println("4. Salir");
                                        System.out.println("Escoja Opcion: ");
                                        o7 = leer.nextInt();
                                        switch (o7) {
                                            case 1:
                                                Modtienda();

                                                break;
                                            case 2:
                                                ModQ();

                                                break;
                                            case 3:
                                                ModR();

                                                break;
                                        }
                                    }
                                    break;
                                case 8:
                                    int o8 = 0;
                                    while (o8 != 3) {
                                        System.out.println("Modificar Persona");
                                        System.out.println("1. Empleados");
                                        System.out.println("2.  Clientes");
                                        System.out.println("3. Salir");
                                        System.out.println("Escoja Opcion: ");
                                        o8 = leer.nextInt();
                                        switch (o8) {
                                            case 1:
                                                Mode();

                                                break;
                                            case 2:
                                                Modc();
                                                break;

                                        }
                                    }
                                    break;
                                case 9:
                                    int o9 = 0;
                                    while (o9 != 4) {
                                        System.out.println("Modificando Producto");
                                        System.out.println("1. Comida");
                                        System.out.println("2. Juguete");
                                        System.out.println("3. Ropa");
                                        System.out.println("4. Salir");
                                        System.out.println("Escoja Opcion: ");
                                        o9 = leer.nextInt();
                                        switch (o9) {
                                            case 1:
                                                ModComida();

                                                break;
                                            case 2:

                                                break;
                                            case 3:

                                                break;

                                        }
                                    }
                                    break;
                            }

                        }
                    }
                case 2:
                    System.out.println("1. login");
                    System.out.println("2. register");
                    System.out.println("elija una opcion: ");
                    int option = leer.nextInt();
                    
                    break;
            }// LOGIN JESUS USUARIO

        }
    }

    public static void CrearTienda() {
        //  public Tiendas(Ropa ropa, Juguetes juguetes, Comida comida, String nombre, String gerente)
        // 1.Ropa(String tipo, String talla, String descripcion, String nombre, int precio)
        //2.  public Juguetes(String descripcion2, String descripcion, String nombre, int precio)
        //3. public Comida(String fecha, String tipo_productos, String descripcion, String nombre, int precio
        System.out.println(" Ingrese tipo de ropa: ");
        String tipo = leer.next();
        System.out.println("Ingrese su talla: ");
        String talla = leer.next();
        System.out.println("Ingrese Descripcion: ");
        String descripcion = leer.next();
        System.out.println("Nombre Ropa: ");
        String nombre_ropa = leer.next();
        System.out.println("Ingrese Precio: ");
        int precio = leer.nextInt();
        Ropa ropa1 = new Ropa(tipo, talla, descripcion, nombre_ropa, precio);//OBJETO ROPA
        System.out.println("Ingrese Descripcion Producto: ");
        String desc_prod = leer.next();
        System.out.println("Ingrese Descripcion Juguete: ");
        String descripcion2 = leer.next();
        System.out.println("Ingrese Nombre Juguete: ");
        String name_jug = leer.next();
        System.out.println("Ingrese Precio: ");
        int precio_jug = leer.nextInt();
        Juguetes jug1 = new Juguetes(desc_prod, descripcion2, name_jug, precio_jug);//OBJETO JUGUETE

        System.out.println("Nombre Tienda: ");
        String nametienda = leer.next();
        System.out.println("Nombre Gerente: ");
        String nameger = leer.next();
        Tiendas t = new Tiendas(ropa1, jug1, nametienda, nameger);//OBJETO Tienda
        locales.add(t);
        tiendas.add(t);
    }

    public static void Crearquisco() {
        // public Quisco(String nombre_tienda, Ropa ropa, Juguetes juguetes, Comida comida, String nombre, String gerente)
        System.out.println(tiendas);
        System.out.println("Ingrese Nombre Tienda: ");
        String ntienda = leer.next();
        System.out.println(" Ingrese tipo de ropa: ");
        String tipo = leer.next();
        System.out.println("Ingrese su talla: ");
        String talla = leer.next();
        System.out.println("Ingrese Descripcion: ");
        String descripcion = leer.next();
        System.out.println("Nombre Ropa: ");
        String nombre_ropa = leer.next();
        System.out.println("Ingrese Precio: ");
        int precio = leer.nextInt();
        precio = precio / 2;
        Ropa ropa1 = new Ropa(tipo, talla, descripcion, nombre_ropa, precio);//OBJETO ROPA
        System.out.println("Ingrese Descripcion Producto: ");
        String desc_prod = leer.next();
        System.out.println("Ingrese Descripcion Juguete: ");
        String descripcion2 = leer.next();
        System.out.println("Ingrese Nombre Juguete: ");
        String name_jug = leer.next();
        System.out.println("Ingrese Precio: ");
        int precio_jug = leer.nextInt();
        precio_jug /= 2;
        Juguetes jug1 = new Juguetes(desc_prod, descripcion2, name_jug, precio_jug);//OBJETO JUGUETE

        System.out.println("Nombre Quisco: ");
        String namequisco = leer.next();
        System.out.println("Nombre Gerente: ");
        String nameger = leer.next();
        Quisco q = new Quisco(ntienda, ropa1, jug1, namequisco, nameger);
        quisco.add(q);
        locales.add(q);
    }

    public static void Creares() {
        //  public Restaurantes(Empleados empleado1, Empleados empleado2, Empleados empleado3, Empleados empleado4, String nombre, String gerente)
        //public Empleados(String horario, int productos, int id, String username, String contra, String correo, String nombre) 
        System.out.println("Horario 1: ");
        String h1 = leer.next();
        System.out.println("Productos Empleados");
        int p1 = leer.nextInt();
        System.out.println("ID empleado: ");
        int id1 = leer.nextInt();
        System.out.println("User Empleado 1: ");
        String u1 = leer.next();
        System.out.println("Contra Empleado1: ");
        String c1 = leer.next();
        System.out.println("Correo empleado 1: ");
        String correo1 = leer.next();
        System.out.println("Nombre Empleado 1: ");
        String n1 = leer.next();
        Empleados e1 = new Empleados(h1, p1, id1, u1, c1, correo1, n1);//EMPLEADO 1
        System.out.println("Horario 2: ");
        String h2 = leer.next();
        System.out.println("Productos Empleados");
        int p2 = leer.nextInt();
        System.out.println("ID empleado: ");
        int id2 = leer.nextInt();
        System.out.println("User Empleado 2: ");
        String u2 = leer.next();
        System.out.println("Contra Empleado 2: ");
        String c2 = leer.next();
        System.out.println("Correo empleado 2: ");
        String correo2 = leer.next();
        System.out.println("Nombre Empleado 2: ");
        String n2 = leer.next();
        Empleados e2 = new Empleados(h2, p2, id2, u2, c1, correo2, n2);//EMPLEADO 2
        System.out.println("Horario 3: ");
        String h3 = leer.next();
        System.out.println("Productos Empleados");
        int p3 = leer.nextInt();
        System.out.println("ID empleado: ");
        int id3 = leer.nextInt();
        System.out.println("User Empleado 3: ");
        String u3 = leer.next();
        System.out.println("Contra Empleado 3: ");
        String c3 = leer.next();
        System.out.println("Correo empleado 3: ");
        String correo3 = leer.next();
        System.out.println("Nombre Empleado 3: ");
        String n3 = leer.next();
        Empleados e3 = new Empleados(h3, p3, id3, u3, c3, correo3, n3);//EMPLEADO 3
        System.out.println("Horario 4: ");
        String h4 = leer.next();
        System.out.println("Productos Empleados");
        int p4 = leer.nextInt();
        System.out.println("ID empleado: ");
        int id4 = leer.nextInt();
        System.out.println("User Empleado 4: ");
        String u4 = leer.next();
        System.out.println("Contra Empleado 4: ");
        String c4 = leer.next();
        System.out.println("Correo empleado 4: ");
        String correo4 = leer.next();
        System.out.println("Nombre Empleado 4: ");
        String n4 = leer.next();
        Empleados e4 = new Empleados(h4, p4, id4, u4, c4, correo4, n4);//EMPLEADO 4
        System.out.println("Nombre restaurante: ");
        String res = leer.next();
        System.out.println("Nombre Gerente: ");
        String g = leer.next();
        Restaurantes r = new Restaurantes(e1, e2, e3, e4, res, g);
        locales.add(r);
        empleados.add(e4);
        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        personas.add(e4);
        personas.add(e1);
        personas.add(e2);
        personas.add(e3);
        restaurantes.add(r);
    }

    public static void CrearEmp() {
        //public Empleados(String horario, int productos, int id, String username, String contra, String correo, String nombre) 
        System.out.println("Creando Empleado...");
        System.out.println("Escriba Horario: ");
        String horario = leer.nextLine();
        horario = leer.nextLine();
        System.out.println("Escriba Numero Cantidad Productos Vendidos: ");
        int prod = leer.nextInt();
        System.out.println(" ID Empleado: ");
        int id = leer.nextInt();
        System.out.println(" Username: ");
        String u = leer.next();
        System.out.println(" Contrasena Empleado: ");
        String c = leer.next();
        System.out.println("Escriba su Correo: ");
        String c1 = leer.next();
        System.out.println("Nombre Empleado: ");
        String n = leer.next();
        Empleados em = new Empleados(horario, prod, id, u, c, c1, n);
        empleados.add(em);
        personas.add(em);
    }

    public static void CreaClientes() {
        //public Clientes(double dinero, int id, String username, String contra, String correo, String nombre)
        System.out.println("Ingrese Dinero: ");
        double d = leer.nextDouble();
        if (d < 0) {
            System.out.println("Dinero INSUFICIENTE");
        }
        System.out.println("Ingrese ID Cliente: ");
        int id = leer.nextInt();
        System.out.println("User Cliente: ");
        String u = leer.next();
        System.out.println("Contrasena Cliente:");
        String co = leer.next();
        System.out.println("Correo: ");
        String coo = leer.next();
        System.out.println("Nombre Cliente: ");
        String n2 = leer.next();
        Clientes c = new Clientes(d, id, u, co, coo, n2);
        // public Productos(String descripcion, String nombre, int precio)
        System.out.println("Ingrese Descripcion Producto: ");
        String d2 = leer.next();
        System.out.println("Nombre Producto: ");
        String n11 = leer.next();
        System.out.println("Precio Producto: ");
        int p = leer.nextInt();
        Productos client = new Productos(d2, n11, p);
        clientes.add(c);
        personas.add(c);
        c.getProductos().add(client);//AGREGAMOS A LA LISTA PRODUCTOS DE EL CLIENTE
    }

    public static void CrearRopa() {
        System.out.println(" Ingrese tipo de ropa: ");
        String tipo = leer.next();
        System.out.println("Ingrese su talla: ");
        String talla = leer.next();
        System.out.println("Ingrese Descripcion: ");
        String descripcion = leer.next();
        System.out.println("Nombre Ropa: ");
        String nombre_ropa = leer.next();
        System.out.println("Ingrese Precio: ");
        int precio = leer.nextInt();
        Ropa ropa1 = new Ropa(tipo, talla, descripcion, nombre_ropa, precio);//OBJETO ROPA
        ropa.add(ropa1);
        productos.add(ropa1);
    }

    public static void Crearjug() {
        System.out.println("Ingrese Descripcion Producto: ");
        String desc_prod = leer.next();
        System.out.println("Ingrese Descripcion Juguete: ");
        String descripcion2 = leer.next();
        System.out.println("Ingrese Nombre Juguete: ");
        String name_jug = leer.next();
        System.out.println("Ingrese Precio: ");
        int precio_jug = leer.nextInt();
        Juguetes jug1 = new Juguetes(desc_prod, descripcion2, name_jug, precio_jug);//OBJETO JUGUETE
        productos.add(jug1);
        juguetes.add(jug1);
    }

    public static void CrearCom() {
        //public Comida(String fecha, String tipo_productos, String descripcion, String nombre, int precio)
        System.out.println("Fecha Comida: ");
        String f = leer.next();
        System.out.println("Tipo Comida: ");
        String t = leer.next();
        System.out.println("Descripcion: ");
        String d = leer.next();
        System.out.println("Nombre: ");
        String n = leer.next();
        System.out.println("Precio: ");
        int p = leer.nextInt();
        Comida c = new Comida(f, t, d, n, p);
        productos.add(c);
        comida.add(c);
    }

    public static void Modtienda() {
        //public void  Tiendas(Ropa ropa, Juguetes juguetes) {
        if (tiendas.isEmpty()) {
            System.out.println("No hay jugadores");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("MODIFICAR!");

        int indice;

        do {
            System.out.println("->Ingrese posicion a modificar: ");
            indice = sc.nextInt();
        } while (indice < 0 || indice >= tiendas.size());
        System.out.println(" Ingrese tipo de ropa: ");
        String tipo = leer.next();
        System.out.println("Ingrese su talla: ");
        String talla = leer.next();
        System.out.println("Ingrese Descripcion: ");
        String descripcion = leer.next();
        System.out.println("Nombre Ropa: ");
        String nombre_ropa = leer.next();
        System.out.println("Ingrese Precio: ");
        int precio = leer.nextInt();
        Ropa ropa1 = new Ropa(tipo, talla, descripcion, nombre_ropa, precio);//OBJETO ROPA
        System.out.println("Ingrese Descripcion Producto: ");
        String desc_prod = leer.next();
        System.out.println("Ingrese Descripcion Juguete: ");
        String descripcion2 = leer.next();
        System.out.println("Ingrese Nombre Juguete: ");
        String name_jug = leer.next();
        System.out.println("Ingrese Precio: ");
        int precio_jug = leer.nextInt();
        Juguetes jug1 = new Juguetes(desc_prod, descripcion2, name_jug, precio_jug);//OBJETO JUGUETE
        tiendas.get(indice).Act(nombre_ropa, name_jug);
        System.out.println("NUEVO");
        System.out.println(tiendas);
    }

    public static void ModQ() {
        //public void Quisco2(String nombre_tienda, Ropa ropa, Juguetes juguetes) 
        if (quisco.isEmpty()) {
            System.out.println("No hay jugadores");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("MODIFICAR!");

        int indice;

        do {
            System.out.println("->Ingrese posicion a modificar: ");
            indice = sc.nextInt();
        } while (indice < 0 || indice >= quisco.size());
        System.out.println(" Ingrese tipo de ropa: ");
        String tipo = leer.next();
        System.out.println("Ingrese su talla: ");
        String talla = leer.next();
        System.out.println("Ingrese Descripcion: ");
        String descripcion = leer.next();
        System.out.println("Nombre Ropa: ");
        String nombre_ropa = leer.next();
        System.out.println("Ingrese Precio: ");
        int precio = leer.nextInt();
        Ropa ropa1 = new Ropa(tipo, talla, descripcion, nombre_ropa, precio);//OBJETO ROPA
        System.out.println("Ingrese Descripcion Producto: ");
        String desc_prod = leer.next();
        System.out.println("Ingrese Descripcion Juguete: ");
        String descripcion2 = leer.next();
        System.out.println("Ingrese Nombre Juguete: ");
        String name_jug = leer.next();
        System.out.println("Ingrese Precio: ");
        int precio_jug = leer.nextInt();
        Juguetes jug1 = new Juguetes(desc_prod, descripcion2, name_jug, precio_jug);//OBJETO JUGUETE
        System.out.println("Nombre Tienda: ");
        String n11 = leer.next();
        quisco.get(indice).Quisco2(n11, ropa1, jug1);
        System.out.println("Nuevo");
        System.out.println(quisco);
    }

    public static void ModR() {
        // public void  act(Empleados empleado1, Empleados empleado2, Empleados empleado3, Empleados empleado4
        if (restaurantes.isEmpty()) {
            System.out.println("No hay jugadores");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("MODIFICAR!");

        int indice;

        do {
            System.out.println("->Ingrese posicion a modificar: ");
            indice = sc.nextInt();
        } while (indice < 0 || indice >= restaurantes.size());
        System.out.println("Horario 1: ");
        String h1 = leer.next();
        System.out.println("Productos Empleados");
        int p1 = leer.nextInt();
        System.out.println("ID empleado: ");
        int id1 = leer.nextInt();
        System.out.println("User Empleado 1: ");
        String u1 = leer.next();
        System.out.println("Contra Empleado1: ");
        String c1 = leer.next();
        System.out.println("Correo empleado 1: ");
        String correo1 = leer.next();
        System.out.println("Nombre Empleado 1: ");
        String n1 = leer.next();
        Empleados e1 = new Empleados(h1, p1, id1, u1, c1, correo1, n1);//EMPLEADO 1
        System.out.println("Horario 2: ");
        String h2 = leer.next();
        System.out.println("Productos Empleados");
        int p2 = leer.nextInt();
        System.out.println("ID empleado: ");
        int id2 = leer.nextInt();
        System.out.println("User Empleado 2: ");
        String u2 = leer.next();
        System.out.println("Contra Empleado 2: ");
        String c2 = leer.next();
        System.out.println("Correo empleado 2: ");
        String correo2 = leer.next();
        System.out.println("Nombre Empleado 2: ");
        String n2 = leer.next();
        Empleados e2 = new Empleados(h2, p2, id2, u2, c1, correo2, n2);//EMPLEADO 2
        System.out.println("Horario 3: ");
        String h3 = leer.next();
        System.out.println("Productos Empleados");
        int p3 = leer.nextInt();
        System.out.println("ID empleado: ");
        int id3 = leer.nextInt();
        System.out.println("User Empleado 3: ");
        String u3 = leer.next();
        System.out.println("Contra Empleado 3: ");
        String c3 = leer.next();
        System.out.println("Correo empleado 3: ");
        String correo3 = leer.next();
        System.out.println("Nombre Empleado 3: ");
        String n3 = leer.next();
        Empleados e3 = new Empleados(h3, p3, id3, u3, c3, correo3, n3);//EMPLEADO 3
        System.out.println("Horario 4: ");
        String h4 = leer.next();
        System.out.println("Productos Empleados");
        int p4 = leer.nextInt();
        System.out.println("ID empleado: ");
        int id4 = leer.nextInt();
        System.out.println("User Empleado 4: ");
        String u4 = leer.next();
        System.out.println("Contra Empleado 4: ");
        String c4 = leer.next();
        System.out.println("Correo empleado 4: ");
        String correo4 = leer.next();
        System.out.println("Nombre Empleado 4: ");
        String n4 = leer.next();
        Empleados e4 = new Empleados(h4, p4, id4, u4, c4, correo4, n4);//EMPLEADO 4
        restaurantes.get(indice).act(e1, e2, e3, e4);
        System.out.println("NUEVO");
        System.out.println(restaurantes);

    }

    public static void Mode() {
        // public void  actEmpleados(String horario, int productos) {
        if (empleados.isEmpty()) {
            System.out.println("No hay jugadores");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("MODIFICAR!");

        int indice;

        do {
            System.out.println("->Ingrese posicion a modificar: ");
            indice = sc.nextInt();
        } while (indice < 0 || indice >= empleados.size());
        System.out.println("Ingrese Nuevo Horario: ");
        String h = leer.next();
        System.out.println("Nueva cantidad productos: ");
        int pp = leer.nextInt();
        empleados.get(indice).actEmpleados(h, pp);
        System.out.println("NUEVO");
        System.out.println(empleados);
    }

    public static void Modc() {
        //public void act(double dinero) {
        if (clientes.isEmpty()) {
            System.out.println("No hay jugadores");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("MODIFICAR!");

        int indice;

        do {
            System.out.println("->Ingrese posicion a modificar: ");
            indice = sc.nextInt();
        } while (indice < 0 || indice >= clientes.size());
        System.out.println("Ingrese Nueva Cantidad Dinero: ");
        int cantidad = leer.nextInt();
        clientes.get(indice).act(indice);
        System.out.println("Nuevo: ");
        System.out.println(clientes);

    }

    public static void ModComida() {
        if (comida.isEmpty()) {
            System.out.println("No hay jugadores");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("MODIFICAR!");

        int indice;

        do {
            System.out.println("->Ingrese posicion a modificar: ");
            indice = sc.nextInt();
        } while (indice < 0 || indice >= comida.size());
        // public void Comida2(String fecha, String tipo_productos) {
        System.out.println("Ingrese Nueva fecha: ");
        String f = leer.next();
        System.out.println("Ingrese nuevo Tipo: ");
        String t = leer.next();
        comida.get(indice).Comida2(f, t);
        System.out.println("Nuevo");
        System.out.println(comida);
    }

    public static void ModJuguete() {
        if (juguetes.isEmpty()) {
            System.out.println("No hay jugadores");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("MODIFICAR!");

        int indice;

        do {
            System.out.println("->Ingrese posicion a modificar: ");
            indice = sc.nextInt();
        } while (indice < 0 || indice >= juguetes.size());
        System.out.println("Ingrese nuva descripcion: ");
        String c = leer.next();
    }
}
