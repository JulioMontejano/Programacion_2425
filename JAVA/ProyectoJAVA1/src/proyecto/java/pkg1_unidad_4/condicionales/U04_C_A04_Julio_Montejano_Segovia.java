/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.java.pkg2_unidad_4.condicionales;

import java.util.*;

/**
 *
 * @author juio
 * Pedir dos números y mostrarlos ordenados de forma decreciente.
 */
public class U04_C_A04_Julio_Montejano_Segovia {
        public static void main(String[] args){
            Scanner leer = new Scanner (System.in);
            System.out.println("Escribe 2 numeros entero:");
            int num1 = leer.nextInt();
            int num2 = leer.nextInt();
            if (num1 > num2){
                System.out.println("el orden es" + num1 + num2);
            } else {
                System.out.println("el orden es " + num2 + "," + num1);
            }
    }
}
