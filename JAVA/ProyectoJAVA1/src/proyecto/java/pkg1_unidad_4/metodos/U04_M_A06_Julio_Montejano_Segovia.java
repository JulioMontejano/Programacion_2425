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
public class U04_M_A06_Julio_Montejano_Segovia {
    static void muestraPares(int num){
        for (int i = 1; i <= num; i++) {
            if (i%2 == 0) {
                System.out.println("Los numeros son" + i);
            }   
        }
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num = leer.nextInt();
        muestraPares(num);
    }
}
