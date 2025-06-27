/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6.pkg8;

/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Biblioteca[] b=new Biblioteca[2];
     b[0]=new Libro("XD693","Piter el guardian",2005);
     b[1]=new Revista("XD269","EL MARCA",2000,18);
     for(int i=0;i<b.length;i++){
         if(b[i] instanceof Libro){
             System.out.println("Libro");
             ((Libro)b[i]).prestar();
             System.out.println(b[i]);
         }
         if(b[i] instanceof Revista){
             System.out.println("Revista");
             System.out.println(b[i]);
         }
     }
    }
    
}
