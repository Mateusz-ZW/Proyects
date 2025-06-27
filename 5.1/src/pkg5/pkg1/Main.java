/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg1;

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
        int[]vector=new int[10];
        System.out.println("Dime cuantos numero quieres introducir: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Dime un numero: ");
            vector[i]=sc.nextInt();
        }
            int po=0;
            int res=0;
            int resn=0;
            int pon=0;
        for(int i=0;i<vector.length;i++){
           
            if(vector[i]>=0){
                
                res+=vector[i];
                po++;
            }
            else 
                resn+=vector[i];
                pon++;
                
        }
        System.out.println("La media de los positivos es "+(res/po));
        System.out.println("La media de los positivos es "+(resn/pon));
        
        // TODO code application logic here
    }
    
}
