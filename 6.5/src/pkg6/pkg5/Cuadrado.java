/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.pkg5;

/**
 *
 * @author mateo
 */
public class Cuadrado extends Rectangulo{

    public Cuadrado() {
        super();
        
    }

    public Cuadrado(int x,int y,double lado){
    super(x,y,lado,lado);
    
    }
    
    public void mostrar()
    { System.out.println("Cuadrado");
      System.out.println("x"+x+"\ny"+y+"\nlado"+base);
      System.out.println("Área"+area()+"\nPerimetro"+perimetro());
    }   
}
    

