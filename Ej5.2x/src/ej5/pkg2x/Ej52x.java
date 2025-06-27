/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5.pkg2x;

import java.util.Scanner;

/**
 *
 * @author mateo
 */

public class Ej52x {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] array = new int[10];
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i<array.length; i++)
        {
            System.out.print("Valor "+i+": ");
            array[i] = sc.nextInt();
        }
        
        // Calcula y muestra la media de los positivos y de los negativos
        
        int sumaPos = 0;
        int sumaNeg = 0;
        int nPos = 0;
        int nNeg = 0;
        int suma0=0;
        int ncero=0;
                
        for (int i = 0; i<array.length; i++)
        {
            if (array[i]>=0)
            {
                sumaPos+=array[i];
                nPos++;
            }
            else
            {
                sumaNeg+=array[i];
                nNeg++;
            }
            if(array[i]==0){
                    
                    ncero++;
            }
        }
        System.out.println("La media de los positivos es "+(sumaPos/nPos));
        System.out.println("La media de los negativos es "+(sumaNeg/nNeg));
        System.out.println("El numero de ceros es: "+ncero);
        
        // TODO code application logic here
    }
    }
    

