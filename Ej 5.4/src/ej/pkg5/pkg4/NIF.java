/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej.pkg5.pkg4;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class NIF {
    private int dni;
    private char letra;
    public NIF(){}
    public NIF(int dni){
        this.dni=dni;
        
        calcularLetra();
        
        
    }
    public void calcularLetra(){
        String letras="TRWAGMYFPDXBNJZSQVHLCKE";
        letra=letras.charAt(this.dni%23);
    }
    public void leer(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime el numero del dni: ");
        int n=sc.nextInt();
        calcularLetra();
    }
    public String toString(){
       String s= this.dni+"-"+letra;
       while(s.length()<10)
           s="0"+s;
       return s;
    }
}
