/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2019;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author mateo
 */
public class Examen2019 {
    public static ArrayList<Mensaje>lista=new ArrayList();
    public static String nFichero="mensajes.dat";
    
    public static void guardarDatos(){
        ObjectOutputStream oos=null;
        try{
            oos=new ObjectOutputStream(new FileOutputStream(nFichero));
            oos.writeObject(lista);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try{
               if(oos!=null){
                   oos.close();
               } 
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }
    public static void cargarFichero(){
        File f=new File(nFichero);
        if(f.exists()){
            ObjectInputStream ois=null;
            try{
                ois=new ObjectInputStream(new FileInputStream(f));
                lista=(ArrayList<Mensaje>)ois.readObject();
            }
            catch(IOException e){
                e.printStackTrace();
            }
            catch(ClassNotFoundException ex){
                ex.printStackTrace();
            }
            finally{
                try{
                    if(ois!=null){
                        ois.close();
                    }
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
               }
            }
        }
    public static int menu(){
        int op=0;
        while(op<1 || op>9){
            System.out.println("1.Listar todos los mensajes");
            System.out.println("2.Mostrar Mensajes normales");
            System.out.println("3.Mostrar Mensajes Encriptados");
            System.out.println("4.Buscar mensaje");
            System.out.println("5.Añadir mensaje");
            System.out.println("6.Desencriptar Mensaje");
            System.out.println("7.Eliminar mensaje");
            System.out.println("8.Eliminar mensaje");
            System.out.println("9.Salir");
            op=Util.leerInt();
        }
        return op;
    }
    public static int menuListar(){
        int op=0;
        while(op<1 || op>2){
            System.out.println("1.Por pantalla");
            System.out.println("2.En un fichero de texto");
            op=Util.leerInt();
        }
        return op;
    }
    public static int menuTipo(){
        int op=0;
        while(op<1 || op>2){
            System.out.println("1.Encriptado");
            System.out.println("2.Sin encriptar");
            op=Util.leerInt();
        }
        return op;
    }
    public static void listar(){
        Iterator<Mensaje>it=lista.iterator();
        while(it.hasNext()){
            Mensaje m=it.next();
            System.out.println(m);
        }
    }
    public static void listarNormal(){
        Iterator<Mensaje>it=lista.iterator();
        while(it.hasNext()){
            Mensaje m=it.next();
            if(m instanceof MensajeSinEnc){
                System.out.println(m);
            }
        }
    }
    public static void listarEnc(){
        Iterator<Mensaje>it=lista.iterator();
        while(it.hasNext()){
            Mensaje m=it.next();
            if(m instanceof MensajeEnc){
                System.out.println(m);
            }
        }
    }
    public static Mensaje buscar(int codigo){
        Iterator <Mensaje> it=lista.iterator();
        while(it.hasNext()){
            Mensaje m=it.next();
            if(m.getCodigo()==codigo){
                return m;
            }
        }
        return null;
    }
    public static void buscarMensaje(){
        System.out.println("Escribe el codigo del mensaje: ");
        int codigo=Util.leerInt();
        Mensaje m=buscar(codigo);
        if(m==null){
            System.out.println("Mensaje no encotrado");
        }
        else{
            System.out.println(m);
        }
        
    }
    public static void añadir(){
        System.out.println("Dime el mensaje que quieres añadir: ");
        String mensaje=Util.leerTexto();
        int op=menuTipo();
        int codigo=lista.size();
       
        switch(op){
            case 1: lista.add(new MensajeEnc(codigo,mensaje));break;
            case 2: lista.add(new MensajeSinEnc(codigo,mensaje));break;
        }
    }
    public static void reorganizarCodigos()
	{
		Iterator<Mensaje> it= lista.iterator();
		int contador = 0;
		while (it.hasNext())
		{
			it.next().setCodigo(contador++);
		}
	}
    public static void eliminar(){
        System.out.println("Escribe el codigo del mensaje a eliminar: ");
        int codigo=Util.leerInt();
        Mensaje m=buscar(codigo);
        if(m==null){
            System.out.println("Mensaje no encontrado");
        }
        else{
            lista.remove(m);
            System.out.println("Mensaje eliminado correctamente");
        }
    }
    public static void listarTodos(){
        int op=menuListar();
        String nombre=Util.leerTexto();
        BufferedWriter bw=null;
        try{
            if(op==2){
                System.out.println("Dime el nombre del fichero: ");
                nombre=Util.leerTexto();
                bw=new BufferedWriter(new FileWriter(nombre));
            }
            Iterator<Mensaje> it=lista.iterator();
            while(it.hasNext()){
                Mensaje m=it.next();
                switch(op){
                    case 1:System.out.println(m);break;
                    case 2: bw.write(m.toString()); break;
                }
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                if(bw!=null){
                    bw.close();
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void desencriptar(){
        System.out.println("Dime el codigo del mensaje: ");
        int cod=Util.leerInt();
        Mensaje m=buscar(cod);
        if(m==null){
            System.out.println("Mensaje no encontrado");
        }
        else if(!(m instanceof MensajeEnc)){
            System.out.println("Mensaje no encriptado");
        }
        else{
            System.out.println(((MensajeEnc)m).toDesencriptado());
        }
    }
    public static void main(String[] args) {
        cargarFichero();
        int op=menu();
        while(op!=8){
            switch(op){
                case 1: listarTodos();break;
			case 2: listarNormal();break;
			case 3: listarEnc();break;
			case 4: buscarMensaje(); break;
			case 5: añadir();break;
			case 6: desencriptar(); break;
			case 7: eliminar(); break;
            }
            op=menu();
        }
        guardarDatos();
    }
    
}
