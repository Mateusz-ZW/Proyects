/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cosas;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class Cosas {

    /**
     * @param args the command line arguments
     */
    public static double Potencia(double base,double exponente){
        double res=1;
        for(int i=0;i<exponente;i++){
        res=res*base;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      System.out.println("Dime el numero de la base: ");
      double base=sc.nextDouble();
      System.out.println("Dime el numero del exponente: ");
      double exponente=sc.nextDouble();
      System.out.println(Potencia(base,exponente));
        // TODO code application logic here
    }
    
}
