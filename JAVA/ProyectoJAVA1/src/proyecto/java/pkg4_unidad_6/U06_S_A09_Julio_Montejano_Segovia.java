package proyecto.java.pkg4_unidad_6;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 * @author Julio Montejano
 */
public class U06_S_A09_Julio_Montejano_Segovia {
    static String escribirFrase(){
        String cadFrase;
        Scanner leer = new Scanner(System.in);
        System.out.print("Escribe la frase : ");
        cadFrase=leer.nextLine();

        return cadFrase;
    }

    static void palindromo(){

        String frase="";
        String reves="";

        frase=escribirFrase();
        for (int i = 0; i < frase.length(); i++) {
            reves=frase.charAt(i)+reves;
        }
        if (reves.compareToIgnoreCase(frase)==0) {
            System.out.println("la frase es palíndroma " + frase + " | " + reves);
        } else{
            System.out.println("No es palíndroma");
        }
        
    }
    public static void main(String[] args) {
        palindromo();
    }
}
