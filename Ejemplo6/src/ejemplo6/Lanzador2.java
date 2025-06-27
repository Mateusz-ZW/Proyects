/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo6;

/**
 *
 * @author mateo
 */
import java.io.*;
public class Lanzador2 {
    public static int NUM_PROCESOS=4;
    public static String PREFIJO_FICHEROS="fich";
    
    public static void lanzarSumador2(int n,int s, String fichResultados){
        String clase="ejemplo6.Sumador";
        File directorioSumador=new File("build/classes");
        File fichResultado=new File(fichResultados);
        ProcessBuilder pb;
        try{
            pb=new ProcessBuilder("java",clase,String.valueOf(n),String.valueOf(s));
            pb.directory(directorioSumador);
            pb.redirectOutput(fichResultado);
            pb.start();
        }
        catch(Exception e){
        e.printStackTrace();
    }
        
    }
    public static int getResultadoFichero(String nombreFichero){
        int suma=0;
       try{
           FileInputStream fi=new FileInputStream(nombreFichero);
           InputStreamReader isr=new InputStreamReader(fi);
           BufferedReader br=new BufferedReader(isr);
           String linea=br.readLine();
           suma=Integer.parseInt(linea);
           return suma;
       }
       catch(FileNotFoundException e){
           e.printStackTrace();
       }
       catch(IOException e){
        e.printStackTrace();    
       }
       return suma;
        
    }
    public static int getSumaTotal(int numFicheros){
        int total=0;
        for(int i=0;i<=NUM_PROCESOS;i++){
            total+=getResultadoFichero(PREFIJO_FICHEROS+String.valueOf(i));
        }
        return total;
    }
      public static void main(String[] args) throws InterruptedException {
      int n=Integer.parseInt(args[0]);
      int s=Integer.parseInt(args[1]);
      int salto=(n/ NUM_PROCESOS)-1;
      for(int i=1;i<= NUM_PROCESOS;i++){
          System.out.println("n: "+n);
          int resConSalto=n+salto;
          if(n+salto>s){
              resConSalto=s;
                      
          }
          System.out.println("s: "+resConSalto);
          lanzarSumador2(n,resConSalto,PREFIJO_FICHEROS+String.valueOf(i));
          n+=salto+1;
          System.out.println("Suma lanzada");
          
      }
      Thread.sleep(5000);
      int sumaTotal=getSumaTotal(NUM_PROCESOS);
          System.out.println("La suma total es: "+sumaTotal);
    }
}
