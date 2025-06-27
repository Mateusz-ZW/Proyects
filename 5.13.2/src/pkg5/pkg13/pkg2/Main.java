/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg13.pkg2;

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
        System.out.println("Dime los valores de las filas: ");
        int filas=sc.nextInt();
        System.out.println("Dime los valores de las columnas: ");
        int col=sc.nextInt();
        
        int [][]a=new int[filas][col];
        int [][]b=new int[filas][col];
        int [][]res=new int[filas][col];
        
        //Un doble for con la matriz a porque queremos que se rellene antes la a, luego ya pedir los datos a la b y sumar los resultados en la matriz res[][]
        
         for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                
                System.out.println("Escriba el valor para la fila "+i+" y columna "+j+" de la matriz 1");
                a[i][j]=sc.nextInt();
                System.out.println("Escriba el valor para la fila "+i+" y columna "+j+" de la matriz 2");
                b[i][j]=sc.nextInt();
                
                res[i][j]=a[i][j]+b[i][j];
            }
        }
         System.out.println("Matriz A: ");
         //Mostrar la matriz a
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matriz B: ");
         //Mostrar matriz b
          for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                
                System.out.println(b[i][j]+" "); 
            }
             System.out.println();
        }
          //Mostrar matriz res:
          System.out.println("Matriz resultado: ");
          for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println("");
        }
       
    }    
}
