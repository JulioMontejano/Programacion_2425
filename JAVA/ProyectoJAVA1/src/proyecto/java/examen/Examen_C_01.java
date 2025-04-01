/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyecto.java.examen;

import java.util.Scanner;

/**
 *
 * @author monte
 */
public class Examen_C_01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        if (num > 0) {
            System.out.println("Es positivo");
        } else if (num < 0) {
            System.out.println("Es negativo");
        } else{
            System.out.println("es cero");
        }
    }
}
