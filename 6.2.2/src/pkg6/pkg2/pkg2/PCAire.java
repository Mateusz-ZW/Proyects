/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.pkg2.pkg2;

/**
 *
 * @author mateo
 */
public class PCAire extends PCongelado {
    protected int o;
    protected int co2;
    protected int h2o;
    protected int n;

    public int getO() {
        return o;
    }

    public void setO(int o) {
        this.o = o;
    }

    public int getCo2() {
        return co2;
    }

    public void setCo2(int co2) {
        this.co2 = co2;
    }

    public int getH2o() {
        return h2o;
    }

    public void setH2o(int h2o) {
        this.h2o = h2o;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public void mostrar()
    {
        System.out.println("Producto congelado por aire");
        super.mostrar();
        System.out.println("% de O: "+o+"\n% de CO2: "+co2+
                           "\n% de H2O: "+h2o+"\n% de N: "+n);
    }
    
}


