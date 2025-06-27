/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.pkg9.pkg1;

/**
 *
 * @author mateo
 */
public class Fraccion {
    private int num;
    private int den;

    public Fraccion(int num, int den)throws FraccionException{
        if(den==0){
            throw new FraccionException("No se puede crear una fraccion con denominador 0");
        }
        this.num = num;
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }
    public Fraccion sumar(Fraccion f){
        try
        {
            return new Fraccion(num*f.den+den*f.num, den*f.den);
        }
        catch (FraccionException e)
        {return null;
        
        }
    }
    
    public Fraccion restar(Fraccion f){
         try
        {
            return new Fraccion (num*f.den-den*f.num, den*f.den);
        }
        catch (FraccionException e)
        {return null;
                
         }
    }
    public Fraccion multiplicar(Fraccion f){
         try
        {
            return new Fraccion (num*f.num, den*f.den);
        }
        catch (FraccionException e)
        {return null;
    }
    }
    public Fraccion dividir(Fraccion f)throws FraccionException{
        if (f.num==0)
        throw new FraccionException("Error al realizar la división");
        return new Fraccion (num*f.den, den*f.num);
    }
     public String toString()
    {
        return num+"/"+den;
    }
    
    
}
