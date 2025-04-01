/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.java.pkg1_unidad_3;

import java.util.Scanner;

/**
 *
 * @author juio
 * Usamos el Signo "%" modulo para ver si el resto es igual a 0 entonces si lo
 * dividimos entre 2 es par
 */
public class U03_A09_Julio_Montejano_Segovia {
        public static void main(String[] args){
            Scanner leer = new Scanner (System.in);
            System.out.println("Escribe el dividendo ");
            double num = leer.nextDouble();
            int resultado = (int) (num%2);
            boolean par = resultado==0;
            System.out.println("Escribe la primera nota: " + par);
        }
}
