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
public class U04_M_A09_Julio_Montejano_Segovia {
    public static double numElevadoIterando (double base, int exponente){
        double resultado = Math.pow(base, exponente);
        return resultado;
    }

    public static double numElevadoRecursivo(double base, int exponente){
        double resultado = 0;
        if (base != 0 || exponente != 0) {
            resultado = Math.pow(base, exponente);    
        } else
            resultado = 0;
        return resultado;
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Escribe la base y el exponente");
        double base = leer.nextDouble();
        int exponente = leer.nextInt();
        System.out.println("El resultado con el metodo Iterativo es: " + numElevadoIterando(base, exponente));
        System.out.println("El resultado con el metodo Recursivo es: " + numElevadoRecursivo(base, exponente));
    }
}
