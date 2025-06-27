/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg13.pkg1;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public  static int sumaDigitos(int n ){
        int res=0;
        while(n>0){
            res+=n%10;
            n/=10;
            
        }
        return res;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int n=sc.nextInt();
        
       System.out.println("La suma de sus digitos es: "+sumaDigitos(n));
      
    }
    
}
