/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyecto.java.examen;
import java.util.*;
/**
 *
 * @author juio
 * Hacer unn codigo que muestre de los 100 primeros numeros
 * cuales son pares
 */
public class Examen_B_01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        for (int i = 1; i <= 100; i++) {
            if (i%2==0) {
                System.out.println("Estos son pares " + i);
            }
        }
    }
}
