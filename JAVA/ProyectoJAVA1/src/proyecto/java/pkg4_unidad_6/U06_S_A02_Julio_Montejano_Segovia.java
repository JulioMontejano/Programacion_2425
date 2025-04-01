package proyecto.java.pkg4_unidad_6;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 * @author Julio Montejano
 */
public class U06_S_A02_Julio_Montejano_Segovia {
    static void recorrer(String cad){
        int contador = 0;
        for (int i = 0; i < cad.length(); i++) {
            if (cad.charAt(i)==' ') {
                contador++;
            }
        }
        System.out.println("Tiene una cantidad de " + contador);
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cad = leer.nextLine();
        recorrer(cad);
    }
}
