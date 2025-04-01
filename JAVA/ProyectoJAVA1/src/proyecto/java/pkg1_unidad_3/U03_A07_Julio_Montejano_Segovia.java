/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.java.pkg1_unidad_3;

import java.util.Scanner;

/**
 * Calculamos la longitud de una circunferencia y su area.
 */
public class U03_A07_Julio_Montejano_Segovia {
        public static void main(String[] args){
        Scanner leer = new Scanner (System.in);
        System.out.println("Escribe cual es el radio ");
        int radiocirc = leer.nextInt();
        double longitudcirc = (double) ((2*Math.PI)*radiocirc);
        System.out.println("La longitud es: " + longitudcirc);
        double area = (double) (Math.pow(radiocirc, 2)*Math.PI);
        System.out.println("El area es: " + area);
        }
}