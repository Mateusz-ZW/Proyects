/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenhosp;

/**
 *
 * @author mateo
 */
public class Paciente extends Persona{
    private int nHC;
    private String [] alergenos;
    
    public Paciente(){
        
    }

    public Paciente(String dni, String nombre, String apellido,int nHC, String[] alergenos) {
        super(dni, nombre, apellido);
        this.nHC = nHC;
        this.alergenos = alergenos;
    }
    
    @Override
    public void mostrar() {
        System.out.println("DATOS DEL PACIENTE");
        System.out.println("NOMBRE: "+nombre);
        System.out.println("APELLIDO: "+apellido);
        System.out.println("HISTORIA CLINICA: "+nHC);
        if(alergenos!=null){
            System.out.println("Alegico A: ");
            for(int i=0;i<alergenos.length;i++){
                if(i!=0){
                    System.out.print(" ,"+alergenos[i]);
                    
                }
                else{
                    System.out.println(alergenos[i]);
                }
                    
            }
            System.out.println();
        }
    }
    public boolean esAlergeno(String a){
        if(alergenos!=null){
            for(int i=0;i<alergenos.length;i++){
                if(alergenos[i].toUpperCase().equals(a.toUpperCase())){
                   return true;
                }
                
            }
        }
        return false;
    }
    
}
