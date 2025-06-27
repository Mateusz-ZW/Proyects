/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg13.pkg4;

/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Se define y construye las dos matrices
		int a[][] = { {1,5,2}, {2,1,3}, {4,2,1} };
		int b[][] = { {2,3,6}, {4,6,8}, {3,6,1} };
                
       //Defino la matriz resultado
       int res[][]=new int [3][3];
       
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a[0].length;j++){
               res[i][j]=0;
               // se multiplica segun la regla de multiplicar matrices
		for( int k = 0; k < a.length; k++ ) {
		res[ i ][ j ] += a[ i ][ k ] * b[ k ][ j ];
		}
			// imprimo el matrizResultadoado cela a celda
			System.out.print( res[ i ][ j ] + " " );  
		}
                 // salto de linea para imprimi la siguiente fila de matriz matrizResultadoante
		System.out.println();
		}
               
           }
       }
    
    

