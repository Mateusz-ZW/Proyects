/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg11;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]a=new int[3][3];
        //Recorre nuestro array y se le asigna valores por teclado 
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print("("+i+","+j+"):");
                a[i][j]=sc.nextInt();
            }
        }
        //
         for(int i=0;i<a.length;i++)
         {
            for(int j=0;j<a.length;j++)
            {
                if(i==j)
                    System.out.println(a[i][j]+"");
                    else
                    System.out.print("  ");
                
            
            }
             System.out.println("");
        // TODO code application logic here
        }
    
}
}
