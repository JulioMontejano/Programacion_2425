package proyecto.java.pkg2_unidad_4.bucles;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author juio
 */
public class U04_B_A06_Julio_Montejano_Segovia {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.print("¿Hasta que numero quieres aprender?: ");
        int veces = leer.nextInt();
            for (int i = 0; i <= veces; i++) {
                System.out.println("Numero: " + i);
            }
    }
}
