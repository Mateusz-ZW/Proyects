/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.pkg1;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=(int)(Math.random()*500+1);
        int n=-1;
        int intentos=0;
        System.out.println("Dime un numero entre 1 y 500: ");
        while(n!=a){
            try{
                intentos++;
                n=sc.nextInt();
                if(a<n)
                {
                    System.out.println("Mi numero es menor");
                }
                else if(a>n){
                    System.out.println("mi numero es mayor");
                }
                else 
                    System.out.println("Guay has encontrado el numero "+a+"en "+intentos+"intentos");
                
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }
    
}
