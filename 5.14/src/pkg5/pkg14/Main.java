/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg14;

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
      String []pais=new String[4];
      String[][] ciudades=new String[4][3];
      
      for(int i=0;i<pais.length;i++){
          System.out.println("Dime un pais: ");
          pais[i]=sc.nextLine();
      }
      for(int i=0;i<ciudades.length;i++){
          for(int j=0;j<ciudades[0].length;j++){
              System.out.println("Dime las ciudades de "+pais[i]);
              System.out.println("Ciudad "+(j+1)+" :");
              ciudades[i][j]=sc.nextLine();
          }
      }
      //Mostrar todo: 
       for (int i = 0; i<ciudades.length; i++)
        {
            System.out.print("Pais: "+pais[i]+"\tCiudades: ");
            for (int j = 0; j < ciudades[i].length; j++)
            {
                System.out.print(ciudades[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
}
