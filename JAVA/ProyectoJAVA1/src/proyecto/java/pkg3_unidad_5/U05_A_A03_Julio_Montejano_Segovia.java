/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyecto.java.pkg3_unidad_5;

import java.util.Scanner;

/**
 *
 * @author juio
 */
public class U05_A_A03_Julio_Montejano_Segovia {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Escribe los indices del Array, si escribes -1 Saldras automaticamente");
        int cantidadIndice = leer.nextInt();
        if (cantidadIndice == -1) {
            System.out.println("Sesion terminada");
        } else{
            int tabla[] = new int[cantidadIndice];
            for (int i = 0; i <tabla.length; i++) {
                tabla[i] = leer.nextInt();
            }
            for (int i = tabla.length; i <= 0; i--) {
                System.out.println("la tabla es " + "[" + tabla[i] + "]");
            }
        }

    }
}
