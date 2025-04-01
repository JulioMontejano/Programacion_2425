/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyecto.java.pkg2_unidad_4.metodos;

import java.util.Scanner;

/**
 *
 * @author julio
 */


public class U04_M_A04_Julio_Montejano_Segovia {
        static int maximo(int num1, int num2){
            int valormax = 0;
            if (num1 > num2) {
                valormax = num1;
            } else if (num1 < num2){
                valormax = num2;
            }
            return valormax;
        }
        static int maximo(int num1, int num2, int num3){
            int valormax = 0;
                if (num3 > num2 && num2 > num1) {
                    valormax = num3;
                } else if (num2 > num3 && num3 > num1){
                    valormax = num2;
                } else{
                    valormax = num1;
                }
            return valormax;
        }
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Escribe los numeros: ");
        int num1 = leer.nextInt(), num2 = leer.nextInt(), num3 = leer.nextInt();
        System.out.println("El mayor entre 2 numeros es: " + maximo(num1, num2));
        System.out.println("El mayor es "+ maximo(num1, num2, num3));

    }
}
