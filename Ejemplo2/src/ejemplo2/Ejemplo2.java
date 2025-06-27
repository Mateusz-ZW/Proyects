/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo2;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author mateo
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
            Process p=new ProcessBuilder("CMD","/C","DIR").start();
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
    
    

