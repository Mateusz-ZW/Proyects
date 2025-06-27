/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg3.pkg1;

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
        int alumnos=sc.nextInt();
      double[]notas=new double[alumnos];
      int sup=0;
      double suma=0;
      double media=0;
      for(int i=0;i<notas.length;i++){
          System.out.println("Alumno "+i+":");
          notas[i]=sc.nextDouble();
          suma+=notas[i];
          
      }
      media=(suma/alumnos);
      System.out.println("La media es: "+ media);
      
      for(int i=0;i<notas.length;i++){
          if(notas[i]>media){
              sup++;
          }
      }
        System.out.println("Superiores a la media hay "+sup+ " alumnos");
       
   
    }
    
}
