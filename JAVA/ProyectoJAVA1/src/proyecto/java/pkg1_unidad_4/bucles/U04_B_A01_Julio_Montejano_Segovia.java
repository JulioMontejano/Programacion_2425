
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyecto.java.pkg2_unidad_4.bucles;

import java.util.Scanner;

/**
 *
 * @author julio
 */
public class U04_B_A01_Julio_Montejano_Segovia {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.print("Intoduce el numero: ");
        int num = leer.nextInt();
            while (num != -1){
                if (num % 2 == 0) {
                    System.out.println("Es Par");
                } else {
                    System.out.println("Es Impar");
                }
                if (num > 0) {
                    System.out.println("Es Positivo");
                } else {
                    System.out.println("Es negativo");
                }
                int cuadrado = num * num;
                System.out.println("El Cuadrado es " + cuadrado);
                num = 0;
                num = leer.nextInt();
            }
    }

}
