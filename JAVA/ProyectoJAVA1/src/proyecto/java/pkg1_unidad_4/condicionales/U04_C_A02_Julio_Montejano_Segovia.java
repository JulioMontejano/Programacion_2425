/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.java.pkg2_unidad_4.condicionales;

import java.util.*;

/**
 *
 * @author juio
 * Pedir dos números enteros y decir si son iguales o no.
 */
public class U04_C_A02_Julio_Montejano_Segovia {
    public static void main(String[] args){
            Scanner leer = new Scanner (System.in);
            System.out.println("Escribe los numeros enteros");
            int num1 = leer.nextInt();
            int num2 = leer.nextInt();
            boolean iguales = num1 == num2;
            System.out.println("Son Iguales? " + iguales);
    }
}
