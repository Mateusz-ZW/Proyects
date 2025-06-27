/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg8;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void buscar(int a[],int n){
        for(int i=0;i<a.length;i++)
        {
           if(a[i]==n){
               System.out.println("Numero encontrado en la posicion "+i);
               return;//termina la busqueda cuando lo encuentra
        }
      
       }
          System.out.println("El numero no se encuentra en el array");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        for(int i=0;i<a.length;i++){
            System.out.println("Dime un numero: ");
            a[i]=sc.nextInt();
        }
         
             System.out.println("Dime un numero a buscar: ");
             int numeroBuscar=sc.nextInt();
             buscar(a,numeroBuscar);
        }
        
    }
    

