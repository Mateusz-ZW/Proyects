/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg20;

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
        System.out.println("Dime un email: ");
        String email=sc.nextLine();
        Email e=new Email();
        e.setEmail(email);
        if(e.esCorrecto(email))
            System.out.println("Enhorabuena, el correo es correcto");
        // TODO code application logic here
    }
    
}
