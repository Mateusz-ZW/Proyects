/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenvehiculo;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class ExamenVehiculo {
    public static Vehiculo[] lista=new Vehiculo[0];
    public static int mostrarMenu(){
        Scanner sc=new Scanner(System.in);
        int op=0;
        while(op<1 || op>5){
            System.out.println("1.Añadir vehiculo: ");
            System.out.println("2.Eliminar vehiculo: ");
            System.out.println("3.Mostrar listado: ");
            System.out.println("4.Alquilar: ");
            System.out.println("5.Salir: ");
            op=sc.nextInt();
        }
        return op;
    }
    public static Matricula leerMatricula(){
       Scanner sc=new Scanner(System.in);
        System.out.println("Indica la matricula: ");
        String matricula=sc.nextLine();
        while(!Matricula.comprobar(matricula)){
            System.out.println("Matricula no valida, vuelve a escribirla");
            matricula=sc.nextLine();
        }
        return new Matricula(matricula);
    }
    public static void añadir(Vehiculo v){
        Vehiculo[]aux=new Vehiculo[lista.length+1];
        for(int i=0;i<lista.length;i++){
            aux[i]=lista[i];
        }
        aux[lista.length]=v;
        lista=aux;
    }
    public static void anadirCoche()
	{
		Scanner sc = new Scanner(System.in);
		Matricula m = leerMatricula();
		System.out.println("Escribe la marca");
		String marca = sc.nextLine();
		System.out.println("Escribe el modelo");
		String modelo = sc.nextLine();
		System.out.println("Escribe el número de plazas");
		int plazas=sc.nextInt();
		
		Coche c = new Coche(m,marca,modelo, plazas);
		añadir(c);
	}
	
	public static void anadirMicrobus()
	{
		Scanner sc = new Scanner(System.in);
		Matricula m = leerMatricula();
		System.out.println("Escribe la marca");
		String marca = sc.nextLine();
		System.out.println("Escribe el modelo");
		String modelo = sc.nextLine();
		System.out.println("Escribe el número de plazas");
		int plazas=sc.nextInt();
		
		MicroBus micro = new MicroBus(m,marca,modelo, plazas);
		añadir(micro);
	}
	
	public static void anadirFurgoneta()
	{
		Scanner sc = new Scanner(System.in);
		Matricula m = leerMatricula();
		System.out.println("Escribe la marca");
		String marca = sc.nextLine();
		System.out.println("Escribe el modelo");
		String modelo = sc.nextLine();
		System.out.println("Escribe el PMA");
		int pma=sc.nextInt();
		
		Furgoneta f = new Furgoneta(m,marca,modelo, pma);
		añadir(f);
	}
	
	public static void anadirCamion()
	{
		Scanner sc = new Scanner(System.in);
		Matricula m = leerMatricula();
		System.out.println("Escribe la marca");
		String marca = sc.nextLine();
		System.out.println("Escribe el modelo");
		String modelo = sc.nextLine();
		System.out.println("Escribe el PMA");
		int pma=sc.nextInt();
		
		Camion c = new Camion(m,marca,modelo, pma);
		añadir(c);
	}
        public static void añadir(){
            Scanner sc=new Scanner(System.in);
            int op=0;
            System.out.println("Indique el tipo de vehiculo: ");
            while(op < 1 || op >4){
                System.out.println("1.Coche");
                System.out.println("2.Microbus");
                System.out.println("3.Furgoneta");
                System.out.println("4.Camion");
                op=sc.nextInt();
                if(op<1 || op>4){
                    System.out.println("Tipo incorrecto, elija otro");
                }
            }
            switch(op){
                
                case 1: anadirCoche();
			break;
		case 2: anadirMicrobus();
			break;
		case 3: anadirFurgoneta();
			break;
		case 4: anadirCamion();
			break;
            }
        }
        public static int buscar(){
            Matricula mat=leerMatricula();
            for(int i=0;i<lista.length;i++){
                if(lista[i].getMatricula().equals(mat)){
                    return i;
                }
            }
            return -1;
        }
        public static void borrar(){
            int pos=buscar();
            if(pos==-1){
                System.out.println("No se ha encontrado la matricula indicada");
            }
            else{
                Vehiculo[] aux= new Vehiculo[lista.length-1];
                for(int i=0;i<pos;i++){
                    aux[i]=lista[i];
                }
                for(int i=pos;i<aux.length;i++){
                    aux[i]=lista[i+1];
                }
                lista=aux;
                System.out.println("El vehiculo ha sido eliminado correctamente");
            }
        }
        public static void mostrar()
	{
		for (int i = 0; i < lista.length; i++)
		{
			System.out.println(lista[i]+"\n");
		}
	}
        public static Vehiculo[] sacar (Vehiculo[] v, int pos)
	{
		Vehiculo[] aux = new Vehiculo[v.length-1];
		for (int i = 0; i < pos; i++)
		{
			aux[i] = v[i];
		}
		for (int i = pos;i < aux.length;i++)
		{
			aux[i] = v[i+1];
		}
		return aux;
		
	}
	
	public static int menor(Vehiculo[] v, int dias)
	{
		double menor = v[0].precio_alquiler(dias);
		int posm=0;
		for (int i = 0; i < v.length;i++)
		{
			double precio = v[i].precio_alquiler(dias);
			if (precio < menor)
			{
				menor = precio;
				posm = i;
			}
		}
		return posm;
	}
	
	public static Vehiculo[] ordenar(int dias)
	{
		Vehiculo[] lista2 = lista;
		Vehiculo [] aux = new Vehiculo[lista.length];
		for (int i = 0; i < lista.length; i++)
		{
			int pos =  menor(lista2,dias);
			aux[i] = lista2[pos];
			lista2 = sacar(lista2,pos);
			
		}
		return aux;
		
		
	}
	
	public static void alquilar()
	{
		Scanner sc = new Scanner(System.in);
		int op = 0;
		System.out.println("Indique el tipo de vehículo desea alquilar");
		while (op <1 || op>4)
		{
			System.out.println("1. Coche");
			System.out.println("2. Microbus");
			System.out.println("3. Furgoneta");
			System.out.println("4. Camion");
			op = sc.nextInt();
			if (op < 1 || op > 4)
				System.out.println("Tipo incorrecto, elija otro");
		}
		
		System.out.println("Indique el número de días");
		int dias = sc.nextInt();
		Vehiculo [] lOrdenada = ordenar(dias);
		switch (op)
		{
		case 1:
			for (int i = 0; i < lOrdenada.length; i++)
			{
				if (lOrdenada[i] instanceof Coche)
					System.out.println(lOrdenada[i]+ " "+lOrdenada[i].precio_alquiler(dias));
			}
			break;
		case 2:
			for (int i = 0; i < lOrdenada.length; i++)
			{
				if (lOrdenada[i] instanceof MicroBus)
					System.out.println(lOrdenada[i]+ " "+lOrdenada[i].precio_alquiler(dias));
			}
			break;
		case 3:
			for (int i = 0; i < lOrdenada.length; i++)
			{
				if (lOrdenada[i] instanceof Furgoneta)
					System.out.println(lOrdenada[i]+ " "+lOrdenada[i].precio_alquiler(dias));
			}
			break;
		case 4:
			for (int i = 0; i < lOrdenada.length; i++)
			{
				if (lOrdenada[i] instanceof Camion)
					System.out.println(lOrdenada[i]+ " "+lOrdenada[i].precio_alquiler(dias));
			}
			break;
			
			
		}
	}
	
    public static void main(String[] args) {
        int op =mostrarMenu();
		while (op!=5)
		{
			switch (op)
			{
			case 1: añadir();
				break;
			case 2: borrar();
				break;
			case 3: mostrar();
				break;
			case 4: alquilar();
				break;
			}
			op = mostrarMenu();
		}
    }
    
}
