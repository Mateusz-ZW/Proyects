/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprog;

/**
 *
 * @author mateo
 */
public class Codigo {
    private static int contadorCitas=1000;
    private String codigo;
    
    public Codigo(){
        this.codigo= "CT" + String.format("%04d", ++contadorCitas);
    }
    public String devolverCodigoCita(){
        return this.codigo;
        
    }
    public String devolverCitacion(String telefono){
        return this.codigo+ "-" + telefono;
        
    }
}
