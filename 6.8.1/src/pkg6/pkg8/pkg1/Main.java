/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6.pkg8.pkg1;

/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Biblioteca []bib=new Biblioteca[2];
        bib[0] = new Libro("COD01","El Quijote",1999);
        bib[1] = new Revista("sdjkfsf", "Revista",2020,3444);

        Biblioteca[] bib1 = new Biblioteca[2];

        bib1[0] = new Libro("COD01","El Quijote",1605);
        bib1[1] = new Revista("COD02", "Computer Hoy",2024,1);
        
        for(int i=0;i<bib.length;i++){
            if(bib[i] instanceof Libro){
                System.out.println("Libro");
                ((Libro)bib[i]).prestar();
                System.out.println(bib[i]);
            }
            if(bib[i] instanceof Revista){
                System.out.println("Revista");
                System.out.println(bib[i]);
            }
        }
    }
    
}
