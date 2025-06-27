/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo5;

import java.io.IOException;

/**
 *
 * @author mateo
 */
public class Ejemplo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException, InterruptedException {
       int n1=Integer.parseInt(args[0]);

            int n2=Integer.parseInt(args[1]);

            int salto=( n2 / NUM_PROCESOS ) - 1;

            for (int i=1;i<=NUM_PROCESOS; i++){​

                    System.out.println("n1:"+ n1);​

                    int resultadoSumaConSalto=n1+salto;​

                    if(n1+salto>n2){​

                    resultadoSumaConSalto=n2;}​

                    System.out.println("n2:"+resultadoSumaConSalto);​

                    lanzarSumador(n1, resultadoSumaConSalto, PREFIJO_FICHEROS + String.valueOf(i));​

                    n1= n1 + salto + 1;​

                    System.out.println("Suma lanzada...");​

            }​

            Thread.sleep(5000);​

            int sumaTotal=getSumaTotal(NUM_PROCESOS);​

            System.out.println("La suma total es:"+ sumaTotal);​

    }​
    }
    
}
