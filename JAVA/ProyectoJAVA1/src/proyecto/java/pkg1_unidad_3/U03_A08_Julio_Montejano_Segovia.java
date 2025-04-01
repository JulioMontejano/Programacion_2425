/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.java.pkg1_unidad_3;

import java.util.Scanner;

/**
 *
 * Usamos el boolean para saber si es mayor de edad o no.
 */
public class U03_A08_Julio_Montejano_Segovia {
        public static void main(String[] args){
            Scanner leer = new Scanner (System.in);
            byte edad = leer.nextByte();
            boolean comparacion = edad >= 18;
            System.out.println(comparacion);
        }
}
