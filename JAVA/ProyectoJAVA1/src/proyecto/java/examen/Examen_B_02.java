/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyecto.java.examen;
import java.util.*;
/**
 *
 * @author juio
 *  Pedir un numero y mostrar su tabla de multiplicar
 */
public class Examen_B_02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe el numero a multiplicar ");
        int num = leer.nextInt();
        for (int i = 1; i <= 10; i++) {
            int resultado = num * i;
            System.out.println("la tabla es " + num + "x" + i + " = " + resultado);
        }
    }
}
