/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.java.pkg1_unidad_3;

import java.util.Scanner;

/**
 *
 * @author juio
 * JULIO MONTEJANO SEGOVIA
 */
/**
 * hacemos la media aritmetrica de 2 notas
 */
public class U03_A06_Julio_Montejano_Segovia {
    public static void main(String[] args){
        Scanner leer = new Scanner (System.in);
        System.out.println("Escribe la primera nota: ");
        double nota1 = leer.nextInt();
        System.out.println("Escribe la segunda nota: ");
        double nota2 = leer.nextInt();
        double resultado = (nota1 + nota2)/2;
        System.out.println("El resultado es: " + resultado);
    }        
}
