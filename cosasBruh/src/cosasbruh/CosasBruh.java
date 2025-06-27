/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cosasbruh;

/**
 *
 * @author mateo
 */import java.util.Scanner;
public class CosasBruh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Dime cuantas veces quieres que se ejecute el bucle: ");
        int x=sc.nextInt();
        
            for(int i=0;i<=x;i++){
                int resultado=0;
                resultado=i;
                System.out.println(resultado);
            }
            
        }
        // TODO code application logic here
    }
    

