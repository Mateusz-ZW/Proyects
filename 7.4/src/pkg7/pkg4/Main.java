/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.pkg4;

/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int n=(int)(Math.random()*999+1);
        System.out.println("El numero es "+n);
        try
        {
            if(n%2==0){
                throw new Exception("El numero es par");
            }
            else 
                throw new Exception("El numero es impar");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
