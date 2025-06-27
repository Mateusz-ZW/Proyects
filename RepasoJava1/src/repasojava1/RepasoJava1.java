/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasojava1;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class RepasoJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("Dime un mes: ");
        String mes=sc.nextLine();
        switch(mes){
            case "Enero":
                System.out.println("Tiene 31 dias");
                break;
            case "Febrero":
                System.out.println("Tiene 28 dias");
                break;
                case "Marzo":
                System.out.println("Tiene 31 dias");
                break;
                case "Abril":
                System.out.println("Tiene 30 dias");
                break;
                case "Mayo":
                System.out.println("Tiene 31 dias");
                break;
                case "Junio":
                System.out.println("Tiene 30 dias");
                break;
                case "Julio":
                System.out.println("Tiene 31 dias");
                break;
                case "Agosto":
                System.out.println("Tiene 31 dias");
                break;
                case "Septiembre":
                System.out.println("Tiene 30 dias");
                break;
                case "Octubre":
                System.out.println("Tiene 31 dias");
                break;
                case "Noviembre":
                System.out.println("Tiene 30 dias");
                break;
                case "Diciembre":
                System.out.println("Tiene 31 dias");
                break;
                default: 
                    System.out.println("Dime un mes valido");
        }
    }
    }
    
}
