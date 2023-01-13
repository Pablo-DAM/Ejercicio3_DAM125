/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicios.examen;

/**
 *
 * @author DAM125
 */
public class Examen {

    public static void main(String[] args) {
        String frase="Me llamo Pablo Sáinz Luque";
        int conEspacios=frase.length();
        System.out.println("Longitud de la frase con espacios: "+conEspacios);
        int sinEspacios=frase.replace(" ","").length();
        System.out.println("La frase tiene: "+sinEspacios+"letras");
        
    }
}
