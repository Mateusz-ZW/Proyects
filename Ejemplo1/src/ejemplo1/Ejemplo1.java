/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1;

/**
 *
 * @author mateo
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            
        
        ProcessBuilder pb=new ProcessBuilder("NOTEPAD");
        Process p=pb.start();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
