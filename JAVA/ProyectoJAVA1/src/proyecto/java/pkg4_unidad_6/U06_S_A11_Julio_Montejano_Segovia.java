

package proyecto.java.pkg4_unidad_6;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Julio Montejano
 */
public class U06_S_A11_Julio_Montejano_Segovia {
    static String escribirFrase(){
        String cadFrase;
        Scanner leer = new Scanner(System.in);
        System.out.print("Escribe la frase: ");
        cadFrase=leer.nextLine();
        cadFrase.toLowerCase();
        return cadFrase;
    }

    static void contadorLetras(){
        String frase=escribirFrase();
        char[] letras;
        int contador = 0;
        
        letras=frase.toCharArray();
        for (int i = 0; i < frase.length(); i++) {
            if (letras[i]==i)
                contador++;
            
        }
    }
    public static void main(String[] args) {
        contadorLetras();
    }
}
