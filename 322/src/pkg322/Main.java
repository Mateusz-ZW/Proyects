/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg322;

/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
        public static int aleatorio(int a, int b)
    {
        //b=El segundo numero y a=primer numero
        return (int)(Math.random()*(b-a+1)+a);        
    }
     public static int estadisticas(int nAlumnos, int edadMin, int edadMax)
    {
        int suma = 0;
        int menor = edadMax;
        int mayor = edadMin;
        for (int i = 1; i <= nAlumnos; i++)
        {
            int edad = aleatorio(edadMin, edadMax);
            suma= suma + edad;
            if (edad < menor)
                menor = edad;
            if (edad > mayor)
                mayor = edad;
        }
        int prom = suma/nAlumnos;
        System.out.println("Edad menor: "+menor);
        System.out.println("Edad mayor: "+mayor);
        System.out.println("Edad promedio: "+prom);
        return prom;
    }
    public static void main(String[] args) {
     
        final int M = 50;
        final int T = 60;
        final int N = 110;
        
        final int minM = 16, minT = 18, minN = 18;
        final int maxM = 28, maxT = 35, maxN = 45;
       
        System.out.println("TURNO DE MAÑANA");
        int promM = estadisticas(M, minM, maxM);
        System.out.println("\nTURNO DE TARDE");
        int promT = estadisticas(T, minT, maxT);
        System.out.println("\nTURNO DE TARDE");
        int promN = estadisticas(N, minN, maxN);
        
                               
        
        if (promM > promT && promM>promN)
            System.out.println("El turno con promedio mayor es el de la mañana");
        else if (promT > promM && promT>promN)
            System.out.println("El turno con promedio mayor es el de la tarde");    
        else if (promN > promM && promN>promT)
            System.out.println("El turno con promedio mayor es el de la noche");    
        else if (promM == promT && promM == promN)
            System.out.println("Los tres turnos tienen el mismo promedio");
        else if (promM < promT)
            System.out.println("Los turno tarde y noche tienen el promedio mayor");
        else if (promT < promN)
            System.out.println("Los turno mañana y noche tienen el promedio mayor");
        else           
            System.out.println("Los turno mañana y tarde tienen el promedio mayor");

            
    }
        // TODO code application logic here
    }
    

