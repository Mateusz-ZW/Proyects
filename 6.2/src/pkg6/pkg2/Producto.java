/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.pkg2;

/**
 *
 * @author mateo
 */
public class Producto {
    private String fCaducidad;
    private String lote;
    private String fEnvasado;
    private String pais;
    public Producto(){}
    public Producto(String fCaducidad,String lote,String fEnvasado, String pais){
        this.fCaducidad=fCaducidad;
        this.lote=lote;
        this.fEnvasado=fEnvasado;
        this.pais=pais;
    }

    public String getfCaducidad() {
        return fCaducidad;
    }

    public void setfCaducidad(String fCaducidad) {
        this.fCaducidad = fCaducidad;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getfEnvasado() {
        return fEnvasado;
    }

    public void setfEnvasado(String fEnvasado) {
        this.fEnvasado = fEnvasado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    public void imprimir(){
        System.out.println("La fecha de caducidad es "+fCaducidad+" su numero de lote es: "+lote+" viene de: "+pais+" y fue envasado: "+fEnvasado);
}
}
