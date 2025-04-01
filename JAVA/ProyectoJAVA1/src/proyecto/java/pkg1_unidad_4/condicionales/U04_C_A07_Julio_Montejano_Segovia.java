/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.java.pkg2_unidad_4.condicionales;

import java.util.Scanner;

/**
 *
 * @author juio
 * Escribir una aplicación que indique cuántas cifras tiene un número entero
 * introducido por teclado, que estará comprendido entre 0 y 99.999.
 */
public class U04_C_A07_Julio_Montejano_Segovia {
    public static void main(String[] args){
            Scanner leer = new Scanner (System.in);
            System.out.println("Introduce el numero");
            int num = leer.nextInt();
            if (num < 10) {
                System.out.println(num + "tiene 1 Cifra");
            } else if (num < 100) {
                System.out.println(num + "tiene 2 Cifras");
            } else if (num < 1000) {
                System.out.println(num + "tiene 3 Cifras");
            }else if (num < 10000) {
                System.out.println(num + "tiene 4 Cifras");
            }else if (num < 100000){
                System.out.println(num + "tiene 5 Cifras");
            }
    }
}
