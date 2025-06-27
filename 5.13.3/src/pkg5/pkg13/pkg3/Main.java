/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg13.pkg3;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static int menu(){
        Scanner sc=new Scanner(System.in);
        int op=0;
        while(op < 1 || op > 7){
        System.out.println("Menu");
        System.out.println("1.Rellenar toda la matriz de numeros");
        System.out.println("2.Sumar de una fila que se pide al usuario: ");
        System.out.println("3.Sumar de una columna que se pide al usuario: ");
        System.out.println("4.Sumar la diagonal principal: ");
        System.out.println("5.Sumar la diagonal inversa: ");
        System.out.println("6.La media de todos los valores de la matriz: ");
        System.out.println("7.Salir");
        op=sc.nextInt();
       }
        return op;
    }
    public static void rellenarMatriz(int[][]a){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.println("Dime los valores para la matriz: ");
                a[i][j]=sc.nextInt();
            }
        }
    }
    public static int sumaFila(int a[][], int fila){
        int suma=0;
        for(int j=0;j<a.length;j++){
            suma+=a[fila][j];
        }
        return suma;
    }
       public static int sumaCol(int a[][], int col){
        int suma=0;
        for(int i=0;i<a[0].length;i++){
            suma+=a[i][col];
        }
        return suma;
    }
       public static int sumaDiag(int [][]a){
           int suma=0;
           for(int i=0, j=0;i <a.length;i++,j++){
              suma+=a[i][j]; 
           }
           return suma;
       }
       public static int sumaDiagInv(int a[][]){
           int suma=0;
           for(int i=0,j=3;i<a.length;i++,j--){
               suma+=a[i][j];
           }
           return suma;
       }
       public static double mediaVal(int a[][]){
           double suma=0,media=0;
           for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                suma += a[i][j];
            }
       }
           media=suma/(a.length*a.length);
           return media;
       }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int [][]a=new int[4][4];
      boolean salir = false;
      //Utilizado para indicar si hemos entrado en la 1ª opcion
      boolean rellenado = false;
      int op=menu();
      int fila,columna;
      while(!salir){
      switch(op){
          case 1:rellenarMatriz(a);
           //Ahora si podemos acceder al resto de opciones
                    rellenado = true;

          break;
          case 2:
              if(rellenado){
               do {

                System.out.println("Elige una fila");
                fila = sc.nextInt();

                 } while(!(fila >= 0 && fila < a.length));
              
              
              sumaFila(a,fila);
              }
          break;
          case 3: 
              if(rellenado){
               do {

                 System.out.println("Elige una fila");
                 columna = sc.nextInt();

                 } while (!(columna >= 0 && columna < a.length));
                   sumaCol(a,columna);
              }
          break;
          case 4:
              if(rellenado){
              sumaDiag(a);
              }
          break;
          case 5:
              if(rellenado){
              sumaDiagInv(a);
              }
              break;
          case 6: 
              if(rellenado){
              mediaVal(a);
              }
          break;
          case 7:
              salir=true;
              break;
          default: System.out.println("Dime una opcion correcta para poder empezar");
      }
      }
        System.out.println("FIN");
    }
    
}
