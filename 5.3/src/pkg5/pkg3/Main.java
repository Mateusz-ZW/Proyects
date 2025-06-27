/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg3;

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
        System.out.println("Dime el numero de alumnos: ");
        int n=sc.nextInt();
        double[]nota=new double[n];
        int suma=0;
         int media=0;
         int supMedia=0;
        for(int i=0;i<nota.length;i++){
            
            System.out.println("Dime tu nota: ");
            nota[i]=sc.nextDouble();
            suma+=nota[i];
           
            System.out.println("La suma es: "+suma);
            
        }
        //Aqui hay que tener en cuenta que la media se tiene que calcular fuera del bucle for
        //porque si no pues nos sale un error
        media=suma/n;
        System.out.println("La media es: "+media);
        for(int s=0;s<nota.length;s++){
            if(nota[s]>media)
                supMedia++;
        }
       
        System.out.println("Numero de alumnos superiores a la media: "+supMedia);
     
    }
    
}
