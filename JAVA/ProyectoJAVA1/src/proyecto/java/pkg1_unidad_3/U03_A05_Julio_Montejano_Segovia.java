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
 * Asignamos el valor maximo a short y en otra variable del mismo tipo 
 * sumamos 1 al valor maximo representado para comprobar que es ciclica la varible
 */
public class U03_A05_Julio_Montejano_Segovia {
    public static void main(String[] args){
        Scanner leer = new Scanner (System.in);
        short numero = 32767;
        System.out.println(numero);
        short ciclo = (short) (numero + 1);
        System.out.println(ciclo);

}
}
