/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg18;

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
    final int FILAS = 5;
        
        int[][] m = new int[FILAS][];
        for (int i = 0; i<m.length; i++)
        {
            m[i] = new int[i+1];
        }
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[i].length; j++)
            {
                System.out.print("("+i+","+j+"): ");
                m[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[i].length; j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println("");
        }
        
    }
    
}

