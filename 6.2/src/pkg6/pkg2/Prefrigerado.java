/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.pkg2;

/**
 *
 * @author mateo
 */
public class Prefrigerado extends Pfrio {
    protected String codigo;
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void imprimir(){
        System.out.println("Producto refrigerado");
        super.imprimir();
        System.out.println("El codigo es: "+codigo);
     
    }
}
