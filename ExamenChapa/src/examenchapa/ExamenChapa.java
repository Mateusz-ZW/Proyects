/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenchapa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class ExamenChapa {

    public static ArrayList<Trabajo> trabajos=new ArrayList();
    public static String nFichero="trabajos.dat";
    public static int menu(){
        Scanner sc=new Scanner(System.in);
        int op=0;
        while(op<1 || op >7){
            System.out.println("1.Nuevo trabajo");
            System.out.println("2.Añadir horas");
            System.out.println("3.Añadir Material");
            System.out.println("4.Finalizar trabajo y generar factura");
            System.out.println("5.Listar Trabajos");
            System.out.println("6.Eliminar Trabajos");
            System.out.println("7.Salir");
            op=sc.nextInt();
        }
        return op;
    }
    public static int menuNuevo(){
        Scanner sc=new Scanner(System.in);
        int op=0;
        while(op<1 || op> 3){
            System.out.println("1.Revision");
            System.out.println("2.Reparacion mecanica");
            System.out.println("3.Reparacion chapa y pintura");
            op=sc.nextInt();
        }
        return op;
    }
    public static void nuevoTrabajo(){
        System.out.println("Seleccione el tipo de trabajo");
        int op=menuNuevo();
        Trabajo t=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("Descripcion: ");
        String desc=sc.nextLine();
        switch(op){
            case 1: t=new Revision(desc);break;
            case 2: t=new RMecanica(desc); break;
            case 3: t=new RChapaPintura(desc);break;
        }
        trabajos.add(t);
    }
    public static int buscar(String codigo){
        for(int i=0;i<trabajos.size();i++){
            if(trabajos.get(i).getCodigo().equals(codigo)){
                return i;
            }
            
        }
        return -1;
        /*
        Tambien se podria hacer: 
        Iterator<Trabajo> it=trabajos.iterator();
        while(it.hasNext()){
            Trabajo t=it.next();
            if(t.getCodigo()==codigo){
           //se hace esto si es Trabajo buscar()
                System.out.println(t);
            o
            return t;
            }
        }
        */
    }
    public static void añadirHoras(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Indique el codigo del trabajo: ");
        String codigo=sc.nextLine();
        System.out.println("Indique el numero de horas: ");
        int horas=sc.nextInt();
        int pos=buscar(codigo);
        if(pos==-1){
            System.out.println("No se ha encontrado el trabajo");
        }
        else{
            trabajos.get(pos).incrementarHoras(horas);
        }
        
    }
    public static void anadirMaterial()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique el código del trabajo");
		String id = sc.nextLine();
		System.out.println("Indique el precio del material");
		double m= sc.nextDouble();
		int pos = buscar(id);
		if (pos == -1)
			System.out.println("No se ha encontrado el trabajo");
		else
		{
			if (trabajos.get(pos) instanceof Reparacion)
				((Reparacion)trabajos.get(pos)).usarMaterial(m);
			else
				System.out.println("No es una reparación");
		}
	}
	
	public static void finalizarTrabajo()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique el código del trabajo");
		String id = sc.nextLine();
		int pos = buscar(id);
		if (pos == -1)
			System.out.println("No se ha encontrado el trabajo");
		else
		{			
			Trabajo t = trabajos.get(pos);
			t.finalizar();
			String nFactura = t.getCodigo()+".FAC";
			BufferedWriter bw = null;
			try
			{
				bw = new BufferedWriter(new FileWriter(nFactura));
				bw.write(t.toString());
			}
			catch (IOException e)
			{
				System.err.println("Error generando factura");
			}
			finally
			{
				try
				{
					if (bw!= null)
						bw.close();
				}
				catch (IOException e)
				{
					System.err.println("Error cerrando el fichero");
				}
			}
		}
		
		
	}
	public static void eliminarTrabajo()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique el código del trabajo");
		String id = sc.nextLine();
		int pos = buscar(id);
		if (pos == -1)
			System.out.println("No se ha encontrado el trabajo");
		else
		{			
			trabajos.remove(pos);
		}
	}	
	
	public static void listarTrabajos()
	{
		for (int i = 0; i < trabajos.size(); i++)
			System.out.println(trabajos.get(i)+"\n");
	}
	
	
	public static void iniciarFichero()
	{
		File fichero = new File(nFichero);
		if (fichero.exists())
		{
			ObjectInputStream ois = null;
			try
			{
				ois = new ObjectInputStream(new FileInputStream(fichero));
				trabajos = (ArrayList<Trabajo>)ois.readObject();
			}
			catch (IOException e)
			{
				System.err.println("Error leyendo el fichero");
				
			} catch (ClassNotFoundException e) {
				System.err.println("Contenido del fichero erróneo");
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
					System.err.println("Error cerrando el fichero");
				}
			}
		}
		
	}
	
	public static void guardarFichero()
	{
		ObjectOutputStream oos = null;
		try
		{
			oos = new ObjectOutputStream(new FileOutputStream(nFichero));
			oos.writeObject(trabajos);
		}
		catch (IOException e)
		{
			System.err.println("Error escribiendo en el fichero");
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
				System.err.println("Error cerrando el fichero");
			}
		}
	}
    public static void main(String[] args) {
        iniciarFichero();
        int op=menu();
        while(op!=7){
            switch(op){
                case 1: nuevoTrabajo(); break;
		case 2: añadirHoras(); break;
		case 3: anadirMaterial(); break;
		case 4: finalizarTrabajo(); break;
		case 5: eliminarTrabajo(); break;
                case 6: listarTrabajos(); break;
            }
            op=menu();
            
        }
        guardarFichero();
    }
    
}
