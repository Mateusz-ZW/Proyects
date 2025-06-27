/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

/**
 *
 * @author mateo
 */
public class ReservaCatering extends Reserva {
    private int nPersonas;
    private int horas;
    private static final int MIN=15;
    private static final int MAX=30;
    private static final double PPP=25;
    private static final double  PHE=5;
    
    public ReservaCatering(int a,int s,String c,int p,int h){
        super(a,s,c);
        nPersonas=  p;
        horas=(h<2)?2:h;
        
    }
    public double calcularPrecio(){
        return (PPP+(horas-2)*PHE)*nPersonas;
        
    }
    public static boolean validoNPersonas(int n){
        return (n>=MIN && n<=MAX);
    }
    public String toString(){
        return super.toString()+"Personas"+nPersonas+"horas"+horas+calcularPrecio();
    }
    
}
