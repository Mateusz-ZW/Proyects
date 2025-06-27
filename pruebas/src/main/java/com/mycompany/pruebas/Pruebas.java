/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebas;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class Pruebas {

   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el dia el mes y el año en formato dd/mm/aaaa ");
        String fecha = sc.nextLine();
        String dia = fecha.substring(0,2);
        String mes = fecha.substring(3,5);
        String anio = fecha.substring(6);
        int d = Integer.parseInt(dia);
        int m = Integer.parseInt(mes);
        int a = Integer.parseInt(anio);
        
        int suma = d+m+a;
        
        int suerte = suma%10 + (suma/10)%10 + (suma/100)%10 + (suma/1000)%10;
        
        System.out.println("Numero de la suerte: "+suerte);
    
       }
       
       
       
        
    }


