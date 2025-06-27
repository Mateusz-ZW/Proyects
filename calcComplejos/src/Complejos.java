/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mateo
 */
public class Complejos {
    private double parteReal;
    private double parteImaginaria;
    //Constructor por defecto que inicializa los valores a 0
    public Complejos() {
        this.parteReal = 0;
        this.parteImaginaria = 0;
    }

    public Complejos(double parteReal) {
        this.parteReal = parteReal;
        this.parteImaginaria = 0;
    }

    public Complejos(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }
    //Metodos set y get
    public double getReal() {
        return parteReal;
    }

    public void setReal(double parteReal) {
        this.parteReal = parteReal;
    }

    public double getImag() {
        return parteImaginaria;
    }

    public void setImag(double parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }
    //Metodo sumar para obtener la suma
    //Primero decimos como quiero que se calcule y despues lo mostramos 
    public Complejos sumar(Complejos num) {
        double parteReal = this.parteReal + num.getReal();
        double parteImaginaria = this.parteImaginaria + num.getImag();
        return new Complejos(parteReal, parteImaginaria);
    }
    //Metodo sumar para obtener la resta
    //Primero decimos como quiero que se calcule y despues lo mostramos
    public Complejos restar(Complejos num) {
        double parteReal = this.parteReal - num.getReal();
        double parteImaginaria = this.parteImaginaria - num.getImag();
        return new Complejos(parteReal, parteImaginaria);
    }
    //Metodo sumar para obtener la multiplicacion
    //Primero decimos como quiero que se calcule y despues lo mostramos
    public Complejos multiplicar(Complejos num) {
        double parteReal = this.parteReal * num.getReal() - this.parteImaginaria * num.getImag();
        double parteImaginaria = this.parteReal * num.getImag() + this.parteImaginaria * num.getReal();
        return new Complejos(parteReal, parteImaginaria);
    }

    public Complejos multiplicar(double num) {
        double parteReal = this.parteReal * num;
        double parteImaginaria = this.parteImaginaria * num;
        return new Complejos(parteReal, parteImaginaria);
    }
    //Aqui hacemos el metodo dividir. 
    //Siguiendo la formula podemos hacer qu nos salga el resultado.Tambien declaro unas variables de tipo double para no repetir lo mismo todo el rato
    
    public Complejos dividir(Complejos num) {
        double c2 = num.getReal() * num.getReal();
        double d2 = num.getImag() * num.getImag();
        double parteReal = (this.parteReal * num.getReal() + this.parteImaginaria * num.getImag()) / (c2 + d2);
        double parteImaginaria = (this.parteImaginaria * num.getReal() - this.parteReal * num.getImag()) / (c2 + d2);
        return new Complejos(parteReal, parteImaginaria);
    }

    @Override
    //Con el toString muestro la forma en la que quiero que se muestre el mensaje 
    public String toString() {
        return "(" + parteReal + ", " + parteImaginaria + ")";
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }
        if (objeto == null || getClass() != objeto.getClass()) {
            return false;
        }
        Complejos complejo = (Complejos) objeto;
        return Double.compare(complejo.getReal(), getReal()) == 0 && Double.compare(complejo.getImag(), getImag()) == 0;
    }
}
    

