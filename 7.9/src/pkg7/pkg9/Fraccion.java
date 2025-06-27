/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.pkg9;

/**
 *
 * @author mateo
 */
public class Fraccion {
    private int numerador;
    private int denominador;
    public Fraccion(int numerador,int denominador)throws FraccionExcepcion{
        if(denominador==0){
            throw new FraccionExcepcion("No se puede dividir por 0");
        }
            this.numerador=numerador;
            this.denominador=denominador;
            
        }
       public Fraccion sumar(Fraccion f)
    {
        try
        {
            return new Fraccion (numerador*f.denominador+denominador*f.numerador, denominador*f.denominador);
        }
        catch (FraccionExcepcion e)
        {return null;}
    }
    public Fraccion restar(Fraccion f)
    {
        try
        {
            return new Fraccion (numerador*f.denominador-denominador*f.numerador, denominador*f.denominador);
        }
        catch (FraccionExcepcion e)
        {return null;}
    }

    public Fraccion multiplicar(Fraccion f)
    {
        try
        {
            return new Fraccion (numerador*f.numerador, denominador*f.denominador);
        }
        catch (FraccionExcepcion e)
        {return null;}
    }
    
    public Fraccion dividir(Fraccion f) throws FraccionExcepcion
    {
        if (f.numerador==0)
            throw new FraccionExcepcion("Error al realizar la división");
        return new Fraccion (numerador*f.denominador, denominador*f.numerador);
    }
    
    public String toString()
    {
        return numerador+"/"+denominador;
    }
    }

