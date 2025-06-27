/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.pkg7;

/**
 *
 * @author mateo
 */
public class ArrayReales implements Estadisticas {
    private double[] array;
    public ArrayReales(double[] a){
       array=a;
    }

    @Override
    public double minimo()
    {
         if(array!=null && array.length>0)
         {
             double min=0;
             for(int i=0;i<array.length;i++)
             {
                 if(array[i]<min)
                 {
                     min=array[i];
                 }
             }
             return min;
         }
         else
             return 0;
    }

    @Override
    public double maximo() {
         if(array!=null && array.length>0)
         {
             double max=0;
             for(int i=0;i<array.length;i++)
             {
                 if(array[i]>max)
                 {
                     max=array[i];
                 }
             }
             return max;
         }
         else
             return 0;
    }
    

    @Override
    public double sumatorio() {
        double suma=0;
        for(int i=0;i<array.length;i++){
            suma+=array[i];
        
        }
        return suma;
}
}
