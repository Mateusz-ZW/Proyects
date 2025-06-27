/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.pkg5;

/**
 *
 * @author mateo
 */
public class Rombo extends FiguraGeometrica {

 protected double diagonalH;
    protected double diagonalV;
    
    public Rombo(){}
    
    public Rombo(int x,int y,double diagonalH, double diagonalV){
    super(x,y);
    this.diagonalH = diagonalH;
    this.diagonalV = diagonalV;
    }
    
    public double area()
    { return diagonalV * diagonalH /2;}
    
    public double perimetro()
    {  return 4*Math.sqrt(Math.pow(diagonalH/2,2)+Math.pow(diagonalV/2,2));
    }
    public void mostrar()
    { System.out.println("Rombo");
      System.out.println("x"+x+"\ny"+y+"\nDiagonal H"+diagonalH+"\nDiagonal V"+diagonalH);
      System.out.println("Área"+area()+"\nPerimetro"+perimetro());
    } 
    
    
}
