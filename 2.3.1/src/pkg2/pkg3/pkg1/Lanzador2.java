/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pkg2.pkg3.pkg1;
import java.io.*;
/**
 *
 * @author mateo
 */
public class Lanzador2 {
    public Process lanzarProcesos(Integer n,Integer s,String fichResultado){
        String clase="pkg2.pkg3.pkg1.Sumador";
        File fichero=new File(fichResultado);
        File directorio =new File("./build/classes");
        ProcessBuilder pb=new ProcessBuilder("java",clase,n.toString(),s.toString());
        Process p;
        pb.inheritIO();
        pb.directory(directorio);
        try{
            pb.redirectOutput(fichero);
            p=pb.start();
            return p;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args){
        int resultado=0;
        Process p1,p2,p3,p4;
        String array[]={"result1.txt","result2.txt","result3.txt","result4.txt"};
        Lanzador2 l=new Lanzador2();
        p1=l.lanzarProcesos(1, 25, array[0]);
        p2=l.lanzarProcesos(26, 50, array[1]);
        p3=l.lanzarProcesos(51, 75, array[2]);
        p4=l.lanzarProcesos(76, 100, array[3]);
        System.out.println("Hecho");
        
        BufferedReader br;
        
        try{
            
            p1.waitFor();
            p2.waitFor();
            p3.waitFor();
            p4.waitFor();
            for(int i=0;i<=array.length;i++){
                br=new BufferedReader(new FileReader("result1.txt"));
                String linea="";
                while(linea!=null){
                    resultado+=Integer.parseInt(linea);
                    linea=br.readLine();
                }
                br.close();
            }
            System.out.println(resultado);
            
            
        }
        catch(Exception e){
            e.printStackTrace();
        }

        
    }
}
