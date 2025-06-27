/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenhosp;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class ExamenHosp {

    public static Persona[] personas;
    public static void main(String[] args) {
        Paciente p1 = new Paciente("12345", "Emilio","Sánchez",11111,
            new String[] {"Penicilina","Huevo"});
        Paciente p2 = new Paciente("13335", "Pablo","Corcho",22222,
            new String[] {"Leche","Huevo","Nueces"});
        Paciente p3 = new Paciente("44445", "Daniel","Esteban",33333,
            new String[] {"Sin alergias"});
        EmpleadoEventual ee = new EmpleadoEventual("54321", "Pepe","González",2222,10,15,150);
        EmpleadoPlantilla ep = new EmpleadoPlantilla("87545", "Laura","Pérez",65450,15,1500,5);
        Medico m1 = new Medico("66665", "Ana", "Montero",99950,15,2500,10,"Cirujía");
        Medico m2 = new Medico("64445", "Luis", "Gómez",88950,8,2000,12,"Dermatología");
        personas=new Persona[]{p1,p2,p3,ee,ep,m1,m2};
        
        for(int i=0;i<personas.length;i++){
            personas[i].mostrar();
            System.out.println();
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Indica el alergeno: ");
        String alergia=sc.nextLine();
        
        for(int i=0;i<personas.length;i++){
            personas[i].mostrar();
            System.out.println();
        }
    }
    
}
