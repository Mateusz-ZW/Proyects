/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo3;

import java.io.*;

/**
 *
 * @author mateo
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       File directorio=new File("./build/classes");
       ProcessBuilder pb=new ProcessBuilder("java","Ejemplo2");
       pb.inheritIO();
       pb.directory(directorio);
        System.out.printf("Directorio de trabajo %s\n",pb.directory());
        Process p=pb.start();
      try{
            InputStream is=p.getInputStream();
            int c;
            while((c=is.read())!=-1){
                System.out.print((char)c);
            }
            is.close();
      }
      catch(Exception e){
        e.printStackTrace();
    }
    }
    
}
