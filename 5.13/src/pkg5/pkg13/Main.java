/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg13;

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
        //Crear una matriz de 2 filas y 5 columnas. Realizar la carga de componentes por columna 
        //(es decir primero ingresar toda la primer columna, luego la segunda columna y así sucesivamente)
        //Imprimir luego la matriz.
        int[][]a=new int[2][5];
        for(int j=0;j<a[0].length;j++){
             for(int i=0;i<a.length;i++){
                 System.out.println("("+i+","+j+"): ");
                 a[i][j]=sc.nextInt();
             }
        }
         for(int i=0;i<a.length;i++){
             for(int j=0;j<a[i].length;j++){
                 System.out.println(a[i][j]+"");
    }
             System.out.print(" ");
    
}
    }
}
