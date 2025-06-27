/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprog;

/**
 *
 * @author mateo
 */
public class Cabina implements ICabina{
    private int nCabina;
    
    public Cabina(int nCabina){
        this.nCabina=nCabina;
    }
    public void asignarCabina(CitaEstetica cita){
        System.out.println("Asignando a la cita numero "+ cita.GetCodigoCita().devolverCodigoCita);
    }
}
