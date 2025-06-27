
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mateo
 */
public class NIF {
    private int numero;
    private char letra;
    public NIF(){}

    public NIF(int numero) {
        this.numero = numero;
        calcularLetra();
        
    }
    public void calcularLetra(){
         String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        letra = letras.charAt(numero%23); 
      
      
    }
    public void leer(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime el numero del dni: ");
        numero=sc.nextInt();
        calcularLetra();
       
    }
     public String toString()
    {
        String s = numero+"-"+letra;
        while (s.length()<10)
            s = "0"+s;
        return s;
    }
}
