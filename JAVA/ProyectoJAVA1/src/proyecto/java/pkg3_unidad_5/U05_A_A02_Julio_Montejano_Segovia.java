package proyecto.java.pkg3_unidad_5;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//package proyecto.java.pkg3_unidad_5.arrays;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author juio
 */
public class U05_A_A02_Julio_Montejano_Segovia {
    static void mostrar(){
        Scanner leer = new Scanner (System.in);
        double tabla[] = new double[5];
        for (int i = 0; i <tabla.length; i++) {
            tabla[i] = leer.nextInt();
        }
        System.out.println("La tabla es" + Arrays.toString(tabla));
    }
    public static void main(String[] args) {
        mostrar();
    }
}
