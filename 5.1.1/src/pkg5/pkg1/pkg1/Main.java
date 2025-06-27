/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg1.pkg1;

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
     
      final int N=10;
      int[]array=new int[N];
      for(int i=0;i<array.length;i++){
          System.out.println("Dime un numero: ");
          array[i]=sc.nextInt();
      
      }
      int sumaPos = 0;
      int sumaNeg = 0;
      int nPos = 0;
      int nNeg = 0;
      int nCero= 0;
      
      for(int i=0;i<array.length;i++){
          if(array[i]>0){
              sumaPos+=array[i];
              nPos++;
          }
          else if(array[i]<0){
              sumaNeg+=array[i];
              nNeg++;
          }
          //5.2
          else{
              nCero++;
          }
      }
        System.out.println("Los numero positivos son: "+nPos);
        System.out.println("Los numeros negativos son: "+nNeg);
        System.out.println("Los numeros 0 son: "+nCero);
        System.out.println("La suma de los valores positivos es: "+sumaPos);
        System.out.println("La suma de los valores negativos es: "+sumaNeg);
        System.out.println("La media de los valores positivos es: "+(sumaPos/nPos));
        System.out.println("La media de los valores negativos es: "+(sumaNeg/nNeg));
      
    }
    
}
