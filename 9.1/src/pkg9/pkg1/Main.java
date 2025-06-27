/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9.pkg1;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe frases, termina con fin: ");
        String frase=sc.nextLine();
        
        BufferedWriter bw =null;
        
        try{
            bw=new BufferedWriter(new FileWriter("C:\\hola.txt"));
            while(!frase.equalsIgnoreCase("FIN")){
                bw.write(frase);
                frase=sc.nextLine();
            }
            bw.close();
            
            
            FileWriter f=new FileWriter("C:\\hola.txt");
            f.write("uno");
            f.write("dos");
            f.close();
            
            File fichero=new File("C:\\hola.txt");
            if(!fichero.exists()){
                System.out.println("No encontrado");
            }
            else
            {
               while(sc.hasNext()){
                   System.out.println(sc.nextLine());
               }
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
                if(bw!=null){
                    bw.close();
                }
            }
            catch(IOException e){
                System.out.println("Error de fichero");
            }
        }
    }
    
}
