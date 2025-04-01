/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyecto.java.pkg2_unidad_4.condicionales;

import java.util.Scanner;

/**
 *
 * @author monte
 *
 */
public class U04_C_01_Julio_Montejano_Segovia {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        if (num%2==0) {
            System.out.println("Es par");
        } else{
            System.out.println("Es impar");
        }
    }
}
