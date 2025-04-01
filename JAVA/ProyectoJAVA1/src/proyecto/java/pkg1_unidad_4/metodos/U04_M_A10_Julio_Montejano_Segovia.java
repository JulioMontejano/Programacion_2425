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
public class U04_M_A10_Julio_Montejano_Segovia {
    public static int fibonacci(int num){
        int resultado = 0;
        if (num != 0) {
            resultado = fibonacci(num-1) + fibonacci(num);
        } else
            System.out.println("Esta mal");
        return resultado;
    }
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        System.out.println("Elige el numero");
        fibonacci(num);
    }
}