/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.pkg5.pkg5;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static char caracterEn(String texto,int i) throws Exception{
        if(i>=0 && i<texto.length()){
           return texto.charAt(i);
            
        }
        else{
            throw new Exception();
        }
        
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Dime un texto: ");
        String t=sc.nextLine();
        try{
            System.out.println("El caracter leido"+caracterEn(t,7));
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
    
}
