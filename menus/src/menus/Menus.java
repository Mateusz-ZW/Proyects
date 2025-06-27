/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menus;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Menus {

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            while(true){
        System.out.println("Dime el numero en cual estas pensando: ");
        int n=sc.nextInt();
        System.out.println("Tu numero es "+ n);
            }
         
        }catch(Exception e ){
            System.out.println("Valor incorrecto");
        }
        
       
    }
}
       
        
     
    
       
    
    
    

    

