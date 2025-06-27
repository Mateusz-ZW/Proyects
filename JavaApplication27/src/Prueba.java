
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mateo
 */
public class Prueba {
    private int n1;
    private int n2;
    private int perro;

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getPerro() {
        return perro;
    }

    public void setPerro(int perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Prueba{" + "n1=" + n1 + ", n2=" + n2 + ", perro=" + perro + '}';
    }
    private static final Logger LOG = Logger.getLogger(Prueba.class.getName());

   

    
}
