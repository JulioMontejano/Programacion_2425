/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.java.pkg1_unidad_3;

/**
 *
 * @author juio
 * JULIO MONTEJANO SEGOVIA
 */
/**
 * Pedimos leer la edad y sumamos 1, despues lo mostramos por consola
 */
import java.util.Scanner;
public class U03_A03_Julio_Montejano_Segovia {
    public static void main(String[] args){
        Scanner leer = new Scanner (System.in);
        System.out.println("�Cual es tu edad?");
        int edad = leer.nextInt();
        edad = edad + 1;
        System.out.println("El a�o que viene tendras " + edad);
    }
}
