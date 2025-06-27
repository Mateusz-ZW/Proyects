/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6.pkg2.pkg2;

/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PFresco pf1 = new PFresco();
        PFresco pf2 = new PFresco();
        PRefrigerado pr1 = new PRefrigerado();
        PRefrigerado pr2 = new PRefrigerado();
        PRefrigerado pr3 = new PRefrigerado();
        PCAgua pca1 = new PCAgua();
        PCAgua pca2 = new PCAgua();
        PCAire pca3 = new PCAire();
        PCAire pca4 = new PCAire();
        PCNitrogeno pcn1 = new PCNitrogeno();
        
        pf1.setLote("lote1");
        pf1.setfCad("21/10/2022");
        pf1.setfEnv("01/01/2022");
        pf1.setPais("España");
        
        pf2.setLote("lote2");
        pf2.setfCad("21/12/2023");
        pf2.setfEnv("01/01/2023");
        pf2.setPais("Francia");
        
        pr1.setLote("lote2");
        pr1.setfCad("21/12/2023");
        pr1.setfEnv("01/01/2023");
        pr1.setPais("Francia");
        pr1.settMantenimiento(10);
        pr1.setCo("eer");
        
        pr2.setLote("lote2");
        pr2.setfCad("21/12/2023");
        pr2.setfEnv("01/01/2023");
        pr2.setPais("Francia");
        pr2.settMantenimiento(10);
        pr2.setCo("eer");
        
        pr3.setLote("lote2");
        pr3.setfCad("21/12/2023");
        pr3.setfEnv("01/01/2023");
        pr3.setPais("Francia");
        pr3.settMantenimiento(10);
        pr3.setCo("eer");
        
        pca1.setLote("lote2");
        pca1.setfCad("21/12/2023");
        pca1.setfEnv("01/01/2023");
        pca1.setPais("Francia");
        pca1.settMantenimiento(10);
        pca1.setSalinidad(50);
        
        pca2.setLote("lote2");
        pca2.setfCad("21/12/2023");
        pca2.setfEnv("01/01/2023");
        pca2.setPais("Francia");
        pca2.settMantenimiento(10);
        pca2.setSalinidad(50);
        
        pca3.setLote("lote2");
        pca3.setfCad("21/12/2023");
        pca3.setfEnv("01/01/2023");
        pca3.setPais("Francia");
        pca3.settMantenimiento(10);
        pca3.setN(10);
        pca3.setO(20);
        pca3.setCo2(15);
        pca3.setH2o(16);
        
        pca4.setLote("lote2");
        pca4.setfCad("21/12/2023");
        pca4.setfEnv("01/01/2023");
        pca4.setPais("Francia");
        pca4.settMantenimiento(10);
        pca4.setN(10);
        pca4.setO(20);
        pca4.setCo2(15);
        pca4.setH2o(16);
        
        pcn1.setLote("lote2");
        pcn1.setfCad("21/12/2023");
        pcn1.setfEnv("01/01/2023");
        pcn1.setPais("Francia");
        pcn1.settMantenimiento(10);
        pcn1.setMetodo("Propio");
        pcn1.setTiempo(100);
        
        pf1.mostrar();
        System.out.println("");
        pf2.mostrar();
        System.out.println("");
        pr1.mostrar();
        System.out.println("");
        pr2.mostrar();
        System.out.println("");
        pr3.mostrar();
        System.out.println("");
        pca1.mostrar();
        System.out.println("");
        pca2.mostrar();
        System.out.println("");
        pca3.mostrar();
        System.out.println("");
        pca4.mostrar();
        System.out.println("");
        pcn1.mostrar();
    }
}
    

