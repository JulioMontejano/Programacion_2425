/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyecto.java.pkg2_unidad_4.metodos;

import java.util.Scanner;

/**
 *
 * @author juio
 */
public class U04_M_A02_Julio_Montejano_Segovia {
    static void numeros(int num1,int num2){
        System.out.println("el 1 numero es " + num1);
        for (int i = num1 +1; i <= num2; i++) {
            System.out.println("Los num son..." + i);
        }
    }
    public static void main(String[] args){
        Scanner leer = new Scanner (System.in);
        int num1 = leer.nextInt(), num2 = leer.nextInt();
        numeros(num1, num2);
    }    
}
