/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.pkg5;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static char caracterEn(String s,int n) throws Exception{
        if(n>=0 && n<s.length())
            return s.charAt(n);
        else
           throw new Exception(); 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe un texto: ");
        String t=sc.nextLine();
        try{
            System.out.println("El caracter leido es: "+caracterEn(t,5));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
