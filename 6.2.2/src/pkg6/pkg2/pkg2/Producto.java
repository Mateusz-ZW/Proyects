/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.pkg2.pkg2;

/**
 *
 * @author mateo
 */
public class Producto {
    protected String fCad;
    protected String lote;
    protected String fEnv;
    protected String pais;
    
    public Producto(){}

    public String getfCad() {
        return fCad;
    }

    public void setfCad(String fCad) {
        this.fCad = fCad;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getfEnv() {
        return fEnv;
    }

    public void setfEnv(String fEnv) {
        this.fEnv = fEnv;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    
    public void mostrar() {
        System.out.println(  "Fecha de caducidad:" + fCad +
                  "\nLote=" + lote +
                  "\nfEnv=" + fEnv + 
                  "\npais=" + pais) ;
    }
    
}
