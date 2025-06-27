/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg317;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un numero del 1 al 10: ");
        int n=sc.nextInt();
        if(n>=1 && n<=10){
            int i=0;
        
        while(i<=12){
            
            i++;
            int mult=n*i;
            System.out.println(n+"x"+i+"="+mult);
        }
        // TODO code application logic here
    }
    }
    
}
