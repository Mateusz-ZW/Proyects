/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     int n=10;
     int array[]=new int[n];
     for(int i=0;i<array.length;i++){
         System.out.println("dime un numero: ");
         array[i]=sc.nextInt();
         
     }
     int sumPos=0;
     int sumNeg=0;
     int nPos=0;
     int nNeg=0;
     for(int i=0;i<array.length;i++){
         if(array[i]>0){
             sumPos+=array[i];
             nPos++;
             
         }
         else{
             sumNeg+=array[i];
             nNeg++; 
         }
             
     }
        System.out.println("La media de los positivos es "+ (sumPos/nPos));
        System.out.println("La media de los negativos es "+ (sumNeg/nNeg));
     
    }
    
}
