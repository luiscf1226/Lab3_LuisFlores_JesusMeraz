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
        String passClient = "";
        String nameClient = "";
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("\u001B[36mRecuerde...");
            System.out.println("\u001B[36mUser admin: SUDO");
            System.out.println("\u001B[36mContra: clau123");
            System.out.println("\u001B[36mMall");
            System.out.println("\u001B[36m1. Log in SUDO");
            System.out.println("\u001B[36m2. Log in Cliente");
            System.out.println("\u001B[36m3. Salir");
            System.out.println("\u001B[36mIngrese Opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\u001B[36mIngrese Usuario: ");
                    String user = leer.next();
                    System.out.println("\u001B[36mIngrese password: ");
                    String pass = leer.next();
                    if (user.equals("\u001B[36mSUDO") && pass.equals("\u001B[36mclau123")) {
                        signedInAdmin = true;
                        System.out.println("\u001B[36mBienvenido SUDO");
                    } else {
                        System.out.println("\u001B[36mIncorrecto");
                    }
                    while (signedInAdmin) {
                        int opc = 14;
                        while (opc != 13) {
                            System.out.println("\u001B[36m1. Crear Local");
                            System.out.println("\u001B[36m2. Crear Personas");
                            System.out.println("\u001B[36m3. Crear Productos");
                            System.out.println("\u001B[36m4. Listar Local");
                            System.out.println("\u001B[36m5. Listar Personas");
                            System.out.println("\u001B[36m6. Listar Productos");
                            System.out.println("\u001B[36m7. Modificar Local");
                            System.out.println("\u001B[36m8. Modificar Personas");
                            System.out.println("\u001B[36m9. Modificar Productos");
                            System.out.println("\u001B[36m10. Eliminar Local");
                            System.out.println("\u001B[36m11. Eliminar Personas");
                            System.out.println("\u001B[36m12. Eliminar Productos");
                            System.out.println("\u001B[36m13. Salir");
                            opc = leer.nextInt();
                            switch (opc) {
                                case 13:

                                    signedInAdmin = false;
                                    System.out.println("\u001B[36mSALIENDO");
                                    break;
                                case 1:
                                    int o1 = 0;
                                    while (o1 != 4) {
                                        System.out.println("\u001B[36mCreando Local");
                                        System.out.println("\u001B[36m1. Crear Tienda");
                                        System.out.println("\u001B[36m2. Crear Quisco");
                                        System.out.println("\u001B[36m3. Crear Restaurante");
                                        System.out.println("\u001B[36m4. Salir");
                                        System.out.println("\u001B[36mEscoja Opcion: ");
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
                                        System.out.println("\u001B[36mCreando Persona");
                                        System.out.println("\u001B[36m1. Crear Empleados");
                                        System.out.println("\u001B[36m2. Crear Clientes");
                                        System.out.println("\u001B[36m3. Salir");
                                        System.out.println("\u001B[36mEscoja Opcion: ");
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
                                        System.out.println("\u001B[36mCreando Producto");
                                        System.out.println("\u001B[36m1. Crear Ropa");
                                        System.out.println("\u001B[36m2. Crear Juguete");
                                        System.out.println("\u001B[36m3. Crear Comida");
                                        System.out.println("\u001B[36m4. Salir");
                                        System.out.println("\u001B[36mEscoja Opcion: ");
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

                                    System.out.println("\u001B[36mLOCALES!!!!");
                                    String salida = "";
                                    for (Object t : locales) {
                                        salida += "" + locales.indexOf(t) + "- " + t + "\n";
                                    }
                                    System.out.println(salida);
                                    System.out.println("\u001B[36mEscoja Listado por Separado: ");
                                    System.out.println("\u001B[36m1.  Tienda");
                                    System.out.println("\u001B[36m2.  Quisco");
                                    System.out.println("\u001B[36m3.  Restaurante");
                                    System.out.println("\u001B[36mEscoja Opcion: ");
                                    int oo = leer.nextInt();
                                    if (oo == 1) {
                                        System.out.println("\u001B[36mTIENDAS!!!!");
                                        String salida33 = "";
                                        for (Object t2 : tiendas) {
                                            salida33 += "" + tiendas.indexOf(t2) + "- " + t2 + "\n";
                                        }
                                        System.out.println(salida33);
                                    }
                                    if (oo == 2) {
                                        System.out.println("\u001B[36mQUISCOS!!!!");
                                        String salida55 = "";
                                        for (Object t3 : quisco) {
                                            salida55 += "" + quisco.indexOf(t3) + "- " + t3 + "\n";
                                        }
                                        System.out.println(salida55);
                                    }
                                    if (oo == 3) {
                                        System.out.println("\u001B[36mRESTAURANTES!!!!");
                                        String salida565 = "";
                                        for (Object t4 : restaurantes) {
                                            salida565 += "" + restaurantes.indexOf(t4) + "- " + t4 + "\n";
                                        }
                                        System.out.println(salida565);
                                    }
                                    break;
                                case 5:
                                    System.out.println("\u001B[36mPERSONAS!!!!");
                                    String salida2 = "";
                                    for (Object t5 : personas) {
                                        salida2 += "" + personas.indexOf(t5) + "- " + t5 + "\n";
                                    }
                                    System.out.println(salida2);
                                    System.out.println("");
                                    System.out.println("\u001B[36mEscoja Listado por Separado: ");
                                    System.out.println("\u001B[36m1.  Empleados");
                                    System.out.println("\u001B[36m2.  Clientes");

                                    System.out.println("\u001B[36mEscoja Opcion: ");
                                    int oo1 = leer.nextInt();
                                    if (oo1 == 1) {
                                        System.out.println("\u001B[36mEMPLEADOS!!!!");
                                        String salida23 = "";
                                        for (Object t6 : empleados) {
                                            salida23 += "" + empleados.indexOf(t6) + "- " + t6 + "\n";
                                        }
                                        System.out.println(salida23);
                                    }
                                    if (oo1 == 2) {
                                        System.out.println("\u001B[36mCLIENTES!!!!");
                                        String salida233 = "";
                                        for (Object t6 : clientes) {
                                            salida233 += "" + clientes.indexOf(t6) + "- " + t6 + "\n";
                                        }
                                        System.out.println(salida233);
                                    }
                                    break;
                                case 6:
                                    System.out.println("\u001B[36mPRODUCTOS!!!!");
                                    String salida3 = "";
                                    for (Object t7 : productos) {
                                        salida3 += "" + productos.indexOf(t7) + "- " + t7 + "\n";
                                    }
                                    System.out.println(salida3);
                                    System.out.println("");
                                    System.out.println("\u001B[36mEscoja Listado por Separado: ");
                                    System.out.println("\u001B[36m1. ropas");
                                    System.out.println("\u001B[36m2. juguetes");
                                    System.out.println("\u001B[36m3. Comida");

                                    System.out.println("\u001B[36mEscoja Opcion: ");
                                    int oo2 = leer.nextInt();
                                    if (oo2 == 1) {
                                        System.out.println("\u001B[36mROPA!!!!");
                                        String salida9 = "";
                                        for (Object t8 : ropa) {
                                            salida9 += "" + ropa.indexOf(t8) + "- " + t8 + "\n";
                                        }
                                        System.out.println(salida9);
                                    }
                                    if (oo2 == 2) {
                                        System.out.println("\u001B[36mJUGUETES!!!!");
                                        String salida99 = "";
                                        for (Object t9 : juguetes) {
                                            salida99 += "" + juguetes.indexOf(t9) + "- " + t9 + "\n";
                                        }
                                        System.out.println(salida99);
                                    }
                                    if (oo2 == 3) {
                                        System.out.println("\u001B[36mCOMIDA!!!!");
                                        String salida999 = "";
                                        for (Object t11 : comida) {
                                            salida999 += "" + comida.indexOf(t11) + "- " + t11 + "\n";
                                        }
                                        System.out.println(salida999);
                                    }
                                    break;
                                case 7:
                                    int o7 = 0;
                                    while (o7 != 4) {
                                        System.out.println("\u001B[36mModificando Local");
                                        System.out.println("\u001B[36m1. Tienda");
                                        System.out.println("\u001B[36m2. Quisco");
                                        System.out.println("\u001B[36m3. Restaurante");
                                        System.out.println("\u001B[36m4. Salir");
                                        System.out.println("\u001B[36mEscoja Opcion: ");
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
                                        System.out.println("\u001B[36mModificar Persona");
                                        System.out.println("\u001B[36m1. Empleados");
                                        System.out.println("\u001B[36m2.  Clientes");
                                        System.out.println("\u001B[36m3. Salir");
                                        System.out.println("\u001B[36mEscoja Opcion: ");
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
                                        System.out.println("\u001B[36mModificando Producto");
                                        System.out.println("\u001B[36m1. Comida");
                                        System.out.println("\u001B[36m2. Juguete");
                                        System.out.println("\u001B[36m3. Ropa");
                                        System.out.println("\u001B[36m4. Salir");
                                        System.out.println("\u001B[36mEscoja Opcion: ");
                                        o9 = leer.nextInt();
                                        switch (o9) {
                                            case 1:
                                                ModComida();

                                                break;
                                            case 2:
                                                Modjuguetes();
                                                break;
                                            case 3:
                                                Modropa();
                                                break;

                                        }
                                    }
                                    break;
                                case 10:
                                    EliminoLocal();
                                    break;
                                case 11:
                                    EliminarPers();
                                    break;
                                case 12:
                                    EliminoProductos();
                                    break;
                            }

                        }
                    }
                case 2:
                    System.out.println("\u001B[36m1. login");
                    System.out.println("\u001B[36m2. sign in");
                    System.out.println("\u001B[36melija una opcion: ");
                    int option = leer.nextInt();
                    switch (option) {
                        case 1:
                            System.out.println("\u001B[36mIngrese Usuario: ");
                            String client = leer.next();
                            System.out.println("\u001B[36mIngrese password: ");
                            String passclient = leer.next();
                            if (client.equals(nameClient) && passclient.equals(passClient)) {
                                signedInAdmin = true;
                                System.out.println("\u001B[36mBienvenido " + client);
                            } else {
                                System.out.println("\u001B[36mIncorrecto");
                            }
                            while (signedInAdmin) {
                                int opc = 14;
                                while (opc != 13) {
                                    System.out.println("\u001B[36mElija una opcion: ");
                                    int op1 = leer.nextInt();
                                    switch (op1) {
                                        case 1:
                                            System.out.println("\u001B[36mTienda: ");
                                            for (Object t : tiendas) {
                                                System.out.println(tiendas.indexOf(t) + " = " + t);
                                            }// fin for
                                            break;
                                        case 2:
                                            System.out.println("\u001B[36mProducto: ");
                                            for (Object t : productos) {
                                                System.out.println(productos.indexOf(t) + " = " + t);
                                            }// fin for
                                            break;
                                        case 3:
                                            System.out.println("\u001B[36mComprar: ");
                                            System.out.println("\u001B[36mElija la posicion del producto a comprar: ");
                                            int pos = leer.nextInt();
                                            System.out.println("\u001B[36mHa elegido " + productos.get(pos));
                                            int prc = productos.get(pos).getPrecio();
                                            System.out.println("\u001B[36mprecio:  " + prc);
                                            System.out.println("\u001B[36mIngrese dinero a pagar: ");
                                            int lps = leer.nextInt();
                                            if (lps < prc) {
                                                System.out.println("\u001B[36mLo sentimos, dinero insuficiente");
                                            } else if (lps == prc) {
                                                System.out.println("\u001B[36mGracias por su compra");
                                            } else if (lps > prc) {
                                                int cambio = lps - prc;
                                                System.out.println("\u001B[36mSu cambio es: " + cambio);
                                                System.out.println("\u001B[36mGracias por su compra");
                                            } else {
                                                System.out.println("\u001B[36mFuera de rango ");
                                            }// fin else
                                            break;
                                        default:
                                            System.out.println("\u001B[36mFuera de rango");
                                    }
                                }
                            }
                            break;
                        case 2:
                            System.out.println("\u001B[36mIngrese nombre de usuario: ");
                            nameClient = leer.next();
                            System.out.println("\u001B[36mIngrese contraseña: ");
                            passClient = leer.next();
                            break;
                    }

                    break;
            }// LOGIN JESUS USUARIO

        }
    }

    public static void CrearTienda() {
        //  public Tiendas(Ropa ropa, Juguetes juguetes, Comida comida, String nombre, String gerente)
        // 1.Ropa(String tipo, String talla, String descripcion, String nombre, int precio)
        //2.  public Juguetes(String descripcion2, String descripcion, String nombre, int precio)
        //3. public Comida(String fecha, String tipo_productos, String descripcion, String nombre, int precio
        System.out.println("\u001B[36m Ingrese tipo de ropa: ");
        String tipo = leer.next();
        System.out.println("\u001B[36mIngrese su talla: ");
        String talla = leer.next();
        System.out.println("\u001B[36mIngrese Descripcion: ");
        String descripcion = leer.next();
        System.out.println("\u001B[36mNombre Ropa: ");
        String nombre_ropa = leer.next();
        System.out.println("\u001B[36mIngrese Precio: ");
        int precio = leer.nextInt();
        Ropa ropa1 = new Ropa(tipo, talla, descripcion, nombre_ropa, precio);//OBJETO ROPA
        System.out.println("\u001B[36mIngrese Descripcion Producto: ");
        String desc_prod = leer.next();
        System.out.println("\u001B[36mIngrese Descripcion Juguete: ");
        String descripcion2 = leer.next();
        System.out.println("\u001B[36mIngrese Nombre Juguete: ");
        String name_jug = leer.next();
        System.out.println("\u001B[36mIngrese Precio: ");
        int precio_jug = leer.nextInt();
        Juguetes jug1 = new Juguetes(desc_prod, descripcion2, name_jug, precio_jug);//OBJETO JUGUETE

        System.out.println("\u001B[36mNombre Tienda: ");
        String nametienda = leer.next();
        System.out.println("\u001B[36mNombre Gerente: ");
        String nameger = leer.next();
        Tiendas t = new Tiendas(ropa1, jug1, nametienda, nameger);//OBJETO Tienda
        locales.add(t);
        tiendas.add(t);
    }

    public static void Crearquisco() {
        // public Quisco(String nombre_tienda, Ropa ropa, Juguetes juguetes, Comida comida, String nombre, String gerente)
        System.out.println(tiendas);
        System.out.println("\u001B[36mIngrese Nombre Tienda: ");
        String ntienda = leer.next();
        System.out.println(" \u001B[36mIngrese tipo de ropa: ");
        String tipo = leer.next();
        System.out.println("\u001B[36mIngrese su talla: ");
        String talla = leer.next();
        System.out.println("\u001B[36mIngrese Descripcion: ");
        String descripcion = leer.next();
        System.out.println("\u001B[36mNombre Ropa: ");
        String nombre_ropa = leer.next();
        System.out.println("\u001B[36mIngrese Precio: ");
        int precio = leer.nextInt();
        precio = precio / 2;
        Ropa ropa1 = new Ropa(tipo, talla, descripcion, nombre_ropa, precio);//OBJETO ROPA
        System.out.println("\u001B[36mIngrese Descripcion Producto: ");
        String desc_prod = leer.next();
        System.out.println("\u001B[36mIngrese Descripcion Juguete: ");
        String descripcion2 = leer.next();
        System.out.println("\u001B[36mIngrese Nombre Juguete: ");
        String name_jug = leer.next();
        System.out.println("\u001B[36mIngrese Precio: ");
        int precio_jug = leer.nextInt();
        precio_jug /= 2;
        Juguetes jug1 = new Juguetes(desc_prod, descripcion2, name_jug, precio_jug);//OBJETO JUGUETE

        System.out.println("\u001B[36mNombre Quisco: ");
        String namequisco = leer.next();
        System.out.println("\u001B[36mNombre Gerente: ");
        String nameger = leer.next();
        Quisco q = new Quisco(ntienda, ropa1, jug1, namequisco, nameger);
        quisco.add(q);
        locales.add(q);
    }

    public static void Creares() {
        //  public Restaurantes(Empleados empleado1, Empleados empleado2, Empleados empleado3, Empleados empleado4, String nombre, String gerente)
        //public Empleados(String horario, int productos, int id, String username, String contra, String correo, String nombre) 
        System.out.println("\u001B[36mHorario 1: ");
        String h1 = leer.next();
        System.out.println("\u001B[36mProductos Empleados");
        int p1 = leer.nextInt();
        System.out.println("\u001B[36mID empleado: ");
        int id1 = leer.nextInt();
        System.out.println("\u001B[36mUser Empleado 1: ");
        String u1 = leer.next();
        System.out.println("\u001B[36mContra Empleado1: ");
        String c1 = leer.next();
        System.out.println("\u001B[36mCorreo empleado 1: ");
        String correo1 = leer.next();
        System.out.println("\u001B[36mNombre Empleado 1: ");
        String n1 = leer.next();
        Empleados e1 = new Empleados(h1, p1, id1, u1, c1, correo1, n1);//EMPLEADO 1
        System.out.println("\u001B[36mHorario 2: ");
        String h2 = leer.next();
        System.out.println("\u001B[36mProductos Empleados");
        int p2 = leer.nextInt();
        System.out.println("\u001B[36mID empleado: ");
        int id2 = leer.nextInt();
        System.out.println("\u001B[36mUser Empleado 2: ");
        String u2 = leer.next();
        System.out.println("\u001B[36mContra Empleado 2: ");
        String c2 = leer.next();
        System.out.println("\u001B[36mCorreo empleado 2: ");
        String correo2 = leer.next();
        System.out.println("\u001B[36mNombre Empleado 2: ");
        String n2 = leer.next();
        Empleados e2 = new Empleados(h2, p2, id2, u2, c1, correo2, n2);//EMPLEADO 2
        System.out.println("\u001B[36mHorario 3: ");
        String h3 = leer.next();
        System.out.println("\u001B[36mProductos Empleados");
        int p3 = leer.nextInt();
        System.out.println("\u001B[36mID empleado: ");
        int id3 = leer.nextInt();
        System.out.println("\u001B[36mUser Empleado 3: ");
        String u3 = leer.next();
        System.out.println("\u001B[36mContra Empleado 3: ");
        String c3 = leer.next();
        System.out.println("\u001B[36mCorreo empleado 3: ");
        String correo3 = leer.next();
        System.out.println("\u001B[36mNombre Empleado 3: ");
        String n3 = leer.next();
        Empleados e3 = new Empleados(h3, p3, id3, u3, c3, correo3, n3);//EMPLEADO 3
        System.out.println("\u001B[36mHorario 4: ");
        String h4 = leer.next();
        System.out.println("\u001B[36mProductos Empleados");
        int p4 = leer.nextInt();
        System.out.println("\u001B[36mID empleado: ");
        int id4 = leer.nextInt();
        System.out.println("\u001B[36mUser Empleado 4: ");
        String u4 = leer.next();
        System.out.println("\u001B[36mContra Empleado 4: ");
        String c4 = leer.next();
        System.out.println("\u001B[36mCorreo empleado 4: ");
        String correo4 = leer.next();
        System.out.println("\u001B[36mNombre Empleado 4: ");
        String n4 = leer.next();
        Empleados e4 = new Empleados(h4, p4, id4, u4, c4, correo4, n4);//EMPLEADO 4
        System.out.println("\u001B[36mNombre restaurante: ");
        String res = leer.next();
        System.out.println("\u001B[36mNombre Gerente: ");
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
        System.out.println("\u001B[36mCreando Empleado...");
        System.out.println("\u001B[36mEscriba Horario: ");
        String horario = leer.nextLine();
        horario = leer.nextLine();
        System.out.println("\u001B[36mEscriba Numero Cantidad Productos Vendidos: ");
        int prod = leer.nextInt();
        System.out.println("\u001B[36m ID Empleado: ");
        int id = leer.nextInt();
        System.out.println("\u001B[36m Username: ");
        String u = leer.next();
        System.out.println("\u001B[36m Contrasena Empleado: ");
        String c = leer.next();
        System.out.println("\u001B[36mEscriba su Correo: ");
        String c1 = leer.next();
        System.out.println("\u001B[36mNombre Empleado: ");
        String n = leer.next();
        Empleados em = new Empleados(horario, prod, id, u, c, c1, n);
        empleados.add(em);
        personas.add(em);
    }

    public static void CreaClientes() {
        //public Clientes(double dinero, int id, String username, String contra, String correo, String nombre)
        System.out.println("\u001B[36mIngrese Dinero: ");
        double d = leer.nextDouble();
        if (d < 0) {
            System.out.println("\u001B[36mDinero INSUFICIENTE");
        }
        System.out.println("\u001B[36mIngrese ID Cliente: ");
        int id = leer.nextInt();
        System.out.println("\u001B[36mUser Cliente: ");
        String u = leer.next();
        System.out.println("\u001B[36mContrasena Cliente:");
        String co = leer.next();
        System.out.println("\u001B[36mCorreo: ");
        String coo = leer.next();
        System.out.println("\u001B[36mNombre Cliente: ");
        String n2 = leer.next();
        Clientes c = new Clientes(d, id, u, co, coo, n2);
        // public Productos(String descripcion, String nombre, int precio)
        System.out.println("\u001B[36mIngrese Descripcion Producto: ");
        String d2 = leer.next();
        System.out.println("\u001B[36mNombre Producto: ");
        String n11 = leer.next();
        System.out.println("\u001B[36mPrecio Producto: ");
        int p = leer.nextInt();
        Productos client = new Productos(d2, n11, p);
        clientes.add(c);
        personas.add(c);
        c.getProductos().add(client);//AGREGAMOS A LA LISTA PRODUCTOS DE EL CLIENTE
    }

    public static void CrearRopa() {
        System.out.println("\u001B[36m Ingrese tipo de ropa: ");
        String tipo = leer.next();
        System.out.println("\u001B[36mIngrese su talla: ");
        String talla = leer.next();
        System.out.println("\u001B[36mIngrese Descripcion: ");
        String descripcion = leer.next();
        System.out.println("\u001B[36mNombre Ropa: ");
        String nombre_ropa = leer.next();
        System.out.println("\u001B[36mIngrese Precio: ");
        int precio = leer.nextInt();
        Ropa ropa1 = new Ropa(tipo, talla, descripcion, nombre_ropa, precio);//OBJETO ROPA
        ropa.add(ropa1);
        productos.add(ropa1);
    }

    public static void Crearjug() {
        System.out.println("\u001B[36mIngrese Descripcion Producto: ");
        String desc_prod = leer.next();
        System.out.println("\u001B[36mIngrese Descripcion Juguete: ");
        String descripcion2 = leer.next();
        System.out.println("\u001B[36mIngrese Nombre Juguete: ");
        String name_jug = leer.next();
        System.out.println("\u001B[36mIngrese Precio: ");
        int precio_jug = leer.nextInt();
        Juguetes jug1 = new Juguetes(desc_prod, descripcion2, name_jug, precio_jug);//OBJETO JUGUETE
        productos.add(jug1);
        juguetes.add(jug1);
    }

    public static void CrearCom() {
        //public Comida(String fecha, String tipo_productos, String descripcion, String nombre, int precio)
        System.out.println("\u001B[36mFecha Comida: ");
        String f = leer.next();
        System.out.println("\u001B[36mTipo Comida: ");
        String t = leer.next();
        System.out.println("\u001B[36mDescripcion: ");
        String d = leer.next();
        System.out.println("\u001B[36mNombre: ");
        String n = leer.next();
        System.out.println("\u001B[36mPrecio: ");
        int p = leer.nextInt();
        Comida c = new Comida(f, t, d, n, p);
        productos.add(c);
        comida.add(c);
    }

    public static void Modtienda() {
        //public void  Tiendas(Ropa ropa, Juguetes juguetes) {
        if (tiendas.isEmpty()) {
            System.out.println("\u001B[36mNo hay jugadores");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\u001B[36mMODIFICAR!");

        int indice;

        do {
            System.out.println("->Ingrese posicion a modificar: ");
            indice = sc.nextInt();
        } while (indice < 0 || indice >= tiendas.size());
        System.out.println(" \u001B[36mIngrese tipo de ropa: ");
        String tipo = leer.next();
        System.out.println("\u001B[36mIngrese su talla: ");
        String talla = leer.next();
        System.out.println("\u001B[36mIngrese Descripcion: ");
        String descripcion = leer.next();
        System.out.println("\u001B[36mNombre Ropa: ");
        String nombre_ropa = leer.next();
        System.out.println("\u001B[36mIngrese Precio: ");
        int precio = leer.nextInt();
        Ropa ropa1 = new Ropa(tipo, talla, descripcion, nombre_ropa, precio);//OBJETO ROPA
        System.out.println("\u001B[36mIngrese Descripcion Producto: ");
        String desc_prod = leer.next();
        System.out.println("\u001B[36mIngrese Descripcion Juguete: ");
        String descripcion2 = leer.next();
        System.out.println("\u001B[36mIngrese Nombre Juguete: ");
        String name_jug = leer.next();
        System.out.println("\u001B[36mIngrese Precio: ");
        int precio_jug = leer.nextInt();
        Juguetes jug1 = new Juguetes(desc_prod, descripcion2, name_jug, precio_jug);//OBJETO JUGUETE
        tiendas.get(indice).Act(nombre_ropa, name_jug);
        System.out.println("\u001B[36mNUEVO");
        System.out.println(tiendas);
    }

    public static void ModQ() {
        //public void Quisco2(String nombre_tienda, Ropa ropa, Juguetes juguetes) 
        if (quisco.isEmpty()) {
            System.out.println("\u001B[36mNo hay ");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\u001B[36mMODIFICAR!");

        int indice;

        do {
            System.out.println("\u001B[36m->Ingrese posicion a modificar: ");
            indice = sc.nextInt();
        } while (indice < 0 || indice >= quisco.size());
        System.out.println("\u001B[36m Ingrese tipo de ropa: ");
        String tipo = leer.next();
        System.out.println("\u001B[36mIngrese su talla: ");
        String talla = leer.next();
        System.out.println("\u001B[36mIngrese Descripcion: ");
        String descripcion = leer.next();
        System.out.println("\u001B[36mNombre Ropa: ");
        String nombre_ropa = leer.next();
        System.out.println("\u001B[36mIngrese Precio: ");
        int precio = leer.nextInt();
        Ropa ropa1 = new Ropa(tipo, talla, descripcion, nombre_ropa, precio);//OBJETO ROPA
        System.out.println("\u001B[36mIngrese Descripcion Producto: ");
        String desc_prod = leer.next();
        System.out.println("\u001B[36mIngrese Descripcion Juguete: ");
        String descripcion2 = leer.next();
        System.out.println("\u001B[36mIngrese Nombre Juguete: ");
        String name_jug = leer.next();
        System.out.println("\u001B[36mIngrese Precio: ");
        int precio_jug = leer.nextInt();
        Juguetes jug1 = new Juguetes(desc_prod, descripcion2, name_jug, precio_jug);//OBJETO JUGUETE
        System.out.println("\u001B[36mNombre Tienda: ");
        String n11 = leer.next();
        quisco.get(indice).Quisco2(n11, ropa1, jug1);
        System.out.println("\u001B[36mNuevo");
        System.out.println(quisco);
    }

    public static void ModR() {
        // public void  act(Empleados empleado1, Empleados empleado2, Empleados empleado3, Empleados empleado4
        if (restaurantes.isEmpty()) {
            System.out.println("\u001B[36mNo hay");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\u001B[36mMODIFICAR!");

        int indice;

        do {
            System.out.println("\u001B[36m->Ingrese posicion a modificar: ");
            indice = sc.nextInt();
        } while (indice < 0 || indice >= restaurantes.size());
        System.out.println("\u001B[36mHorario 1: ");
        String h1 = leer.next();
        System.out.println("\u001B[36mProductos Empleados");
        int p1 = leer.nextInt();
        System.out.println("\u001B[36mID empleado: ");
        int id1 = leer.nextInt();
        System.out.println("\u001B[36mUser Empleado 1: ");
        String u1 = leer.next();
        System.out.println("\u001B[36mContra Empleado1: ");
        String c1 = leer.next();
        System.out.println("\u001B[36mCorreo empleado 1: ");
        String correo1 = leer.next();
        System.out.println("\u001B[36mNombre Empleado 1: ");
        String n1 = leer.next();
        Empleados e1 = new Empleados(h1, p1, id1, u1, c1, correo1, n1);//EMPLEADO 1
        System.out.println("\u001B[36mHorario 2: ");
        String h2 = leer.next();
        System.out.println("\u001B[36mProductos Empleados");
        int p2 = leer.nextInt();
        System.out.println("\u001B[36mID empleado: ");
        int id2 = leer.nextInt();
        System.out.println("\u001B[36mUser Empleado 2: ");
        String u2 = leer.next();
        System.out.println("\u001B[36mContra Empleado 2: ");
        String c2 = leer.next();
        System.out.println("\u001B[36mCorreo empleado 2: ");
        String correo2 = leer.next();
        System.out.println("\u001B[36mNombre Empleado 2: ");
        String n2 = leer.next();
        Empleados e2 = new Empleados(h2, p2, id2, u2, c1, correo2, n2);//EMPLEADO 2
        System.out.println("\u001B[36mHorario 3: ");
        String h3 = leer.next();
        System.out.println("\u001B[36mProductos Empleados");
        int p3 = leer.nextInt();
        System.out.println("\u001B[36mID empleado: ");
        int id3 = leer.nextInt();
        System.out.println("\u001B[36mUser Empleado 3: ");
        String u3 = leer.next();
        System.out.println("\u001B[36mContra Empleado 3: ");
        String c3 = leer.next();
        System.out.println("\u001B[36mCorreo empleado 3: ");
        String correo3 = leer.next();
        System.out.println("\u001B[36mNombre Empleado 3: ");
        String n3 = leer.next();
        Empleados e3 = new Empleados(h3, p3, id3, u3, c3, correo3, n3);//EMPLEADO 3
        System.out.println("\u001B[36mHorario 4: ");
        String h4 = leer.next();
        System.out.println("\u001B[36mProductos Empleados");
        int p4 = leer.nextInt();
        System.out.println("\u001B[36mID empleado: ");
        int id4 = leer.nextInt();
        System.out.println("\u001B[36mUser Empleado 4: ");
        String u4 = leer.next();
        System.out.println("\u001B[36mContra Empleado 4: ");
        String c4 = leer.next();
        System.out.println("\u001B[36mCorreo empleado 4: ");
        String correo4 = leer.next();
        System.out.println("\u001B[36mNombre Empleado 4: ");
        String n4 = leer.next();
        Empleados e4 = new Empleados(h4, p4, id4, u4, c4, correo4, n4);//EMPLEADO 4
        restaurantes.get(indice).act(e1, e2, e3, e4);
        System.out.println("\u001B[36mNUEVO");
        System.out.println(restaurantes);

    }

    public static void Mode() {
        // public void  actEmpleados(String horario, int productos) {
        if (empleados.isEmpty()) {
            System.out.println("\u001B[36mNo hay");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\u001B[36mMODIFICAR!");

        int indice;

        do {
            System.out.println("\u001B[36m->Ingrese posicion a modificar: ");
            indice = sc.nextInt();
        } while (indice < 0 || indice >= empleados.size());
        System.out.println("\u001B[36mIngrese Nuevo Horario: ");
        String h = leer.next();
        System.out.println("\u001B[36mNueva cantidad productos: ");
        int pp = leer.nextInt();
        empleados.get(indice).actEmpleados(h, pp);
        System.out.println("\u001B[36mNUEVO");
        System.out.println(empleados);
    }

    public static void Modc() {
        //public void act(double dinero) {
        if (clientes.isEmpty()) {
            System.out.println("\u001B[36mNo hays");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\u001B[36mMODIFICAR!");

        int indice;

        do {
            System.out.println("\u001B[36m->Ingrese posicion a modificar: ");
            indice = sc.nextInt();
        } while (indice < 0 || indice >= clientes.size());
        System.out.println("\u001B[36mIngrese Nueva Cantidad Dinero: ");
        int cantidad = leer.nextInt();
        clientes.get(indice).act(indice);
        System.out.println("\u001B[36mNuevo: ");
        System.out.println(clientes);

    }

    public static void ModComida() {
        if (comida.isEmpty()) {
            System.out.println("\u001B[36mNo hay");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\u001B[36mMODIFICAR!");

        int indice;

        do {
            System.out.println("\u001B[36m->Ingrese posicion a modificar: ");
            indice = sc.nextInt();
        } while (indice < 0 || indice >= comida.size());
        // public void Comida2(String fecha, String tipo_productos) {
        System.out.println("\u001B[36mIngrese Nueva fecha: ");
        String f = leer.next();
        System.out.println("\u001B[36mIngrese nuevo Tipo: ");
        String t = leer.next();
        comida.get(indice).Comida2(f, t);
        System.out.println("\u001B[36mNuevo");
        System.out.println(comida);
    }

    public static void Modjuguetes() {
        if (juguetes.isEmpty()) {
            System.out.println("\u001B[36mNo hay");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\u001B[36mMODIFICAR!");

        int indice;

        do {
            System.out.println("\u001B[36m->Ingrese posicion a modificar: ");
            indice = sc.nextInt();
        } while (indice < 0 || indice >= juguetes.size());
        System.out.println("\u001B[36mIngrese nuva descripcion: ");
        String c = leer.next();
        juguetes.get(indice).act(c);
        System.out.println("\u001B[36mNUEVO");
        System.out.println(juguetes);
    }

    public static void Modropa() {
        // public void Actualizar(String tipo, String talla){
        if (ropa.isEmpty()) {
            System.out.println("\u001B[36mNo hay ");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\u001B[36mMODIFICAR!");

        int indice;

        do {
            System.out.println("->Ingrese posicion a modificar: ");
            indice = sc.nextInt();
        } while (indice < 0 || indice >= ropa.size());
        System.out.println("Ingrese Nuevo tipo ropa: ");
        String t = leer.next();
        System.out.println("Ingrese Nueva Talla");
        String n = leer.next();
        ropa.get(indice).Actualizar(t, n);
        System.out.println("Nuevo");
        System.out.println(ropa);
    }

    public static void EliminoLocal() {
        if (locales.isEmpty()) {
            System.out.println("No hay ");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("ELIMINAR !");

        int indice;
        do {
            System.out.println("->Ingrese posicion a eliminar: ");
            indice = sc.nextInt();
        } while (indice < 0 || indice >= personas.size());

        locales.remove(indice);

        System.out.println("ELIMINADO!");
    }

    public static void EliminoProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay ");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("ELIMINAR !");

        int indice;
        do {
            System.out.println("->Ingrese posicion a eliminar: ");
            indice = sc.nextInt();
        } while (indice < 0 || indice >= productos.size());

        productos.remove(indice);

        System.out.println("ELIMINADO!");

    }

    public static void EliminarPers() {
        if (personas.isEmpty()) {
            System.out.println("No hay ");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("ELIMINAR !");

        int indice;
        do {
            System.out.println("->Ingrese posicion a eliminar: ");
            indice = sc.nextInt();
        } while (indice < 0 || indice >= locales.size());

        personas.remove(indice);

        System.out.println("ELIMINADO!");
    }
    public static final String ANSI_CYAN = "\u001B[36m";
}
