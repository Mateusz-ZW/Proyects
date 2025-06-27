/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mateo
 */
public class Main {
     public static void main(String[] args) {
        try {
            // Prueba de AlgoritmoAES
            AlgorithmAES aes = new AlgorithmAES();
            String originalText = "Texto secreto AES";
            String encryptedTextAES = aes.crypt(originalText);
            String decryptedTextAES = aes.decrypt(encryptedTextAES);
            System.out.println("AES:");
            System.out.println("Texto original: " + originalText);
            System.out.println("Texto cifrado: " + encryptedTextAES);
            System.out.println("Texto descifrado: " + decryptedTextAES);

            // Prueba de AlgoritmoRSA
            AlgorithmRSA rsa = new AlgorithmRSA();
            String originalTextRSA = "Texto secreto RSA";
            String encryptedTextRSA = rsa.crypt(originalTextRSA);
            String decryptedTextRSA = rsa.decrypt(encryptedTextRSA);
            System.out.println("RSA:");
            System.out.println("Texto original: " + originalTextRSA);
            System.out.println("Texto cifrado: " + encryptedTextRSA);
            System.out.println("Texto descifrado: " + decryptedTextRSA);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

