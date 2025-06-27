/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.pkg5.pkg1;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Main {

    public static char caracterEn(String cad,int n)throws Exception{
        if(n>=0 && n <cad.length()){
           return cad.charAt(n);
        }
        else{
            throw new Exception();
        }
    }
    public static void main(String[] args) throws Exception {
       Scanner sc=new Scanner(System.in);
        System.out.println("Dime un string: ");
        String texto=sc.nextLine();
        try{
       
            System.out.println("El caracter leido es: "+caracterEn(texto,7));
        }
        catch(Exception e){
            System.out.println("Has intentado recuperar una posición  de la cadena de caracteres que no existe");
        }
    }
    
}
