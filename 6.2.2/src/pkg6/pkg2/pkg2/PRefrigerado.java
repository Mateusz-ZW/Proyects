/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.pkg2.pkg2;

/**
 *
 * @author mateo
 */
public class PRefrigerado extends PFrio{
    protected String co;

    public String getCo() {
        return co;
    }

    public void setCo(String co) {
        this.co = co;
    }
        
    
    public void mostrar()
    {
        System.out.println("Producto refrigerado");
        super.mostrar();
        System.out.println("Código de organismo: "+co);
    }
    
}
