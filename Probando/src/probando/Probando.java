/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package probando;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class Probando {

    /**
     * @param args the command line arguments
     */
      public static String elMejor(String texto)
      {
      texto= ("Eres el mejor y vas a conseguir todo lo que te propongas");
      return texto;
      }
      public static String p(int n){
          String letra="";
          if(n<5){
             
             letra=("No pasa nada, todo saldra bien");
          }
          return letra;
      }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime cuantas veces quieres entrar en el bucle: ");
        int bucle=sc.nextInt();
        
        if(bucle==0){
            System.out.println("No vas bien");
        }
        else if(bucle>0&&bucle<10){
            for(int i=0;i<=bucle;i++){
                String texto="";
                String letra="";
                System.out.println("Dime un numero: ");
                int n=sc.nextInt();
                if(n>=5){
                    System.out.println(elMejor(texto));
                }
                else if(n<5){
                    System.out.println(p(n));
                }
              
                
            }

        
    
}

     
       
        
        
        
       
    
     
    
      
        
        
        
        // TODO code application logic here
    }
}
    

