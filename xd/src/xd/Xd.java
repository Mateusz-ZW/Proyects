/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xd;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class Xd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Total preguntas");
        double total=sc.nextDouble();
        System.out.println("Correctas: ");
        double correctas=sc.nextDouble();
        
        double resultado=100*(correctas/total);
        if(resultado>=90){
            System.out.println("Nivel maximo");
        }
        else if(resultado>=75 && resultado<90){
            System.out.println("Nivel medio");
        }
        else if(resultado>=50 && resultado<75){
            System.out.println("Nivel regular");
        }
        else{
            System.out.println("Fuera de nivel");
        }
     
        }
    }
       
    

