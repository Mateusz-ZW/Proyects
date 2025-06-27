/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.pkg4.pkg1;

/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            
        
       double random=(int)(Math.random()*999);
       if(random%2==0){
           throw new Exception("Par");
       }
       else{
           throw new Exception("Impar");
       }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            
        }
    }
    
}
