/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carniceriamanolo;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class CarniceriaManolo {
    public static ArrayList<Usuario> usuarios=new ArrayList();
    public static ArrayList<Productos> productos=new ArrayList();
    public static double ganancia=0;
    public static Usuario logueado=null;
    
    public static String fUsuarios = "usuarios.bin";
    public static String fProductos = "productos.bin";
    public static String fGanancia = "ganancia.txt";
    
    
    public static int menuAdministrador(){
        
        int op=0;
        while( op < 1 || op > 7 ){
            System.out.println("1.Mostrar Productos");
            System.out.println("2.Mostrar Producto por codigo/descripcion");
            System.out.println("3.Añadir producto/modificar stock");
            System.out.println("4.Mostrar Ganancia");
            System.out.println("5.Alta a un usuario");
            System.out.println("6.Desconectar");
            System.out.println("7.Salir");
            op=Util.leerInt();
        }
        return op;
    }
    public static int menuCliente(){
        int op=0;
        while(op<1 || op > 5){
            System.out.println("1.Mostrar Productos ");
            System.out.println("2.Mostrar Producto por codigo/descripcion");
            System.out.println("3.Comprar");
            System.out.println("4.Desconectar");
            System.out.println("5.Salir");
            op=Util.leerInt();
        }
        return op;
    }
    public static int menuInvitado(){
        int op=0;
        while(op<1 || op>5){
            System.out.println("1.Mostrar productos");
            System.out.println("2.Mostrar Producto por codigo/descripcion");
            System.out.println("3.Registrar");
            System.out.println("4.Login");
            System.out.println("5.Salir");
            op=Util.leerInt();
        }
        return op;
        
    }
    public static void mostrarProductos(){
        Iterator<Productos> it=productos.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    public static void mostrarProductosQueContienen(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Texto a buscar: ");
        String texto=sc.nextLine();
        Iterator<Productos> it=productos.iterator();
        while(it.hasNext()){
            Productos p=it.next();
            if(String.valueOf(p.getCodigo()).contains(texto) || p.getDesc().toUpperCase().contains(texto)){
                System.out.println(p);
        }
        }
    }
    public static Productos buscar(int cod){
        Iterator<Productos> it=productos.iterator();
        while(it.hasNext()){
            Productos p=it.next();
            if(p.getCodigo()==cod){
                return p;
            }
        }
        return null;
    }
    public static void nuevoProducto(int cod){
        Scanner sc=new Scanner(System.in);
        System.out.println("Descripcion: ");
        String desc=sc.nextLine();
        System.out.println("Stock: ");
        int stock=Util.leerInt();
        System.out.println("Precio: ");
        double precio=Util.leerDouble();
        
        productos.add(new Productos(cod,desc,stock,precio));
    }
    public static void modificarStock(Productos p){
        System.out.println("Nuevo stock: ");
        int stock=Util.leerInt();
        p.setStock(stock);
        System.out.println("Stock modificado");
    }
    public static void añadirModificar(){
        System.out.println("Codigo: ");
        int cod=Util.leerInt();
        Productos p=buscar(cod);
        if(p!=null){
            modificarStock(p);
        }
        else{
            nuevoProducto(cod);
        }
    }
    public static void mostrarGanancia(){
        System.out.println("Ganancia: "+ganancia);
    }
    public static void altaUsuario(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Usuario: ");
        String usuario=sc.nextLine();
        System.out.println("Password: ");
        String pass=sc.nextLine();
        int op=0;
        while(op!=1 && op!=2){
            System.out.println("Indica el tipo de usuario: ");
            System.out.println("1.Administrador");
            System.out.println("2.Cliente");
            op=Util.leerInt();
        }
        if(op==1){
            usuarios.add(new Administradores(usuario,pass));
        }
        else{
            usuarios.add(new Clientes(usuario,pass));
        }
        
    }
    public static void desconectar(){
        logueado=null;
    }
    public static void comprar(){
        System.out.println("Codigo: ");
        int cod=Util.leerInt();
        Productos p=buscar(cod);
        if(p==null){
            System.out.println("No hemos encontrado el producto");
        }
        else{
            System.out.println("Unidades a comprar: ");
            int cant=Util.leerInt();
            if(cant> p.getStock()){
                System.out.println("No hay stock suficiente");
            }
            else{
                p.setStock(p.getStock()-cant);
                ganancia+=cant*p.getPrecio();
                System.out.println("Compra realizada");
            }
        }
    }
    public static void registrarCliente(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime el usuario: ");
        String usuario=sc.nextLine();
        System.out.println("Dime la pass: ");
        String pass=sc.nextLine();
        Clientes c= new Clientes(usuario,pass);
        usuarios.add(c);
        logueado=c;
    }
    public static void registrarAdministrador(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime el usuario: ");
        String usuario=sc.nextLine();
        System.out.println("Dime la pass: ");
        String pass=sc.nextLine();
        Administradores a= new Administradores(usuario,pass);
        usuarios.add(a);
        logueado=a;
    }
    public static void login(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Usuario: ");
        String usuario=sc.nextLine();
        System.out.println("Pass: ");
        String pass=sc.nextLine();
        boolean encontrado=false;
        Iterator<Usuario> it=usuarios.iterator();
        while(it.hasNext() && !encontrado){
            Usuario u=it.next();
            if(u.getNombre().equals(usuario) && u.getPass().equals(pass)){
                logueado=u;
                encontrado=true;
                System.out.println("Se ha logueado correctamente");
            }
        }
        if(!encontrado){
            System.out.println("Error en usuario o contraseña");
        }
    }
    
      public static void guardarUsuarios()
    {
        ObjectOutputStream oos = null;
        try
        {
            oos = new ObjectOutputStream(new FileOutputStream(fUsuarios));
            oos.writeObject(usuarios);
        }
        catch (IOException e)
        {
            System.out.println("Error guardando los usuarios");
        }
        finally
        {
            try
            {
                if (oos!=null)
                    oos.close();
            }
            catch (IOException e)
            {
                System.out.println("Error cerrando el fichero de usuarios");
            }
        }
    }
    
    public static void guardarProductos()
    {
        ObjectOutputStream oos = null;
        try
        {
            oos = new ObjectOutputStream(new FileOutputStream(fProductos));
            oos.writeObject(productos);
        }
        catch (IOException e)
        {
            System.out.println("Error guardando los productos");
        }
        finally
        {
            try
            {
                if (oos!=null)
                    oos.close();
            }
            catch (IOException e)
            {
                System.out.println("Error cerrando el fichero de productos");
            }
        }
    }
    
    public static void guardarGanancia()
    {
        BufferedWriter bw = null;
        try
        {
            bw = new BufferedWriter(new FileWriter(fGanancia));
            bw.write(String.valueOf(ganancia));
        }
        catch (IOException e)
        {
            System.out.println("Error guardando la ganancia");
        }
        finally
        {
            try
            {
                if (bw!=null)
                    bw.close();
            }
            catch (IOException e)
            {
                System.out.println("Error cerrando el fichero de ganancia");
            }
        }
    }
        
    public static void guardarDatos()
    {
        guardarUsuarios();
        guardarProductos();
        guardarGanancia();
        
    }
    
    public static boolean recuperarUsuarios()
    {
        ObjectInputStream ois = null;
        try
        {
            ois = new ObjectInputStream(new FileInputStream(fUsuarios));
            usuarios = (ArrayList<Usuario>)ois.readObject();
            return true;
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Error enlos datos de usuario");
            registrarAdministrador();
            return false;
        }
        catch (FileNotFoundException e)
        {
            registrarAdministrador();
            return false;
        }
        catch (IOException e)
        {
            System.out.println("Error leyendo el fichero");
            registrarAdministrador();
            return false;
        }
        catch (Exception e)
        {
            System.out.println("Error leyendo el fichero");
            registrarAdministrador();
            return false;
        }
        finally
        {
            try
            {
                if (ois!=null)
                    ois.close();
            }
            catch (IOException e)
            {
                System.out.println("Error cerrando el fichero de usuarios");
            }
        }
    }
    
    public static void recuperarProductos()
    {
        ObjectInputStream ois = null;
        try
        {
            ois = new ObjectInputStream(new FileInputStream(fProductos));
            productos = (ArrayList<Productos>)ois.readObject();
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Error enlos datos de productos");
        }
        catch (FileNotFoundException e)
        {
        }
        catch (IOException e)
        {
            System.out.println("Error leyendo el fichero");
        }
        catch (Exception e)
        {
            System.out.println("Error leyendo el fichero");
        }
        finally
        {
            try
            {
                if (ois!=null)
                    ois.close();
            }
            catch (IOException e)
            {
                System.out.println("Error cerrando el fichero de productos");
            }
        }
    }
    
    public static void recuperarGanancia()
    {
        BufferedReader br = null;
        try
        {
            br = new BufferedReader(new FileReader(fGanancia));
            ganancia = Double.valueOf(br.readLine());
        }
        catch (FileNotFoundException e)
        {
        }
        catch (IOException e)
        {
            System.out.println("Error leyendo el fichero");
        }
        catch (Exception e)
        {
            System.out.println("Error leyendo el fichero");
        }
        finally
        {
            try
            {
                if (br!=null)
                    br.close();
            }
            catch (IOException e)
            {
                System.out.println("Error cerrando el fichero de ganancia");
            }
        }
    }
    
    public static void recuperarDatos()
    {
        if (recuperarUsuarios())
        {
            recuperarProductos();
            recuperarGanancia();
        }
    }
    
    
    public static void main(String[] args) {
        recuperarDatos();
        int op=0;
        boolean salir=false;
        while(!salir){
            if(logueado==null){
                op=menuInvitado();
                switch(op){
                    case 1: mostrarProductos(); break;
                    case 2: mostrarProductosQueContienen(); break;
                    case 3: registrarCliente(); break;
                    case 4: login(); break;
                    case 5: salir = true; break;
                }
            }
            else if(logueado instanceof Administradores){
                op=menuAdministrador();
                switch(op){
                    case 1: mostrarProductos(); break;
                    case 2: mostrarProductosQueContienen(); break;
                    case 3: añadirModificar(); break;
                    case 4: mostrarGanancia(); break;
                    case 5: altaUsuario(); break;
                    case 6: desconectar(); break;
                    case 7: salir = true; break;
                }
                
            }
            else{
                op=menuCliente();
                switch(op){
                    case 1: mostrarProductos(); break;
                    case 2: mostrarProductosQueContienen(); break;
                    case 3: comprar(); break;
                    case 4: desconectar(); break;
                    case 5: salir = true; break;
                }
            }
        }
        guardarDatos();
    }
    
}
