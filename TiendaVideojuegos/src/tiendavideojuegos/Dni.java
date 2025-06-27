/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendavideojuegos;

/**
 *
 * @author mateo
 */
public class Dni {
     
    private int numero;
    private char letra;
    
    public Dni()
    {
        letra = calcularLetra();
    }
    
    public Dni(int n) throws DNIException
    {
        if (n < 0 || n > 99999999)
            throw new DNIException("Error creando el DNI. Número inválido");
        numero = n;
        letra = calcularLetra();
    }
    
    private char calcularLetra()
    {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letras.charAt(this.numero%23);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) throws DNIException
    {
        if (numero<0 || numero> 99999999)
            throw new DNIException("Error modificando el DNI. Número inválido.");
        this.numero = numero;
        letra = calcularLetra();
    }
    
    @Override
    public String toString()
    {
        String nif = numero+"-"+letra;
        while (nif.length()<10)
            nif = "0"+nif;
        return nif;
    }
}
