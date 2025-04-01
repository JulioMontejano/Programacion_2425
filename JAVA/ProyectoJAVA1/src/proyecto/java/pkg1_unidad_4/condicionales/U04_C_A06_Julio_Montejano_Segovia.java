/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.java.pkg2_unidad_4.condicionales;

import java.util.*;

/**
 *
 * @author juio
 * Pedir tres números y mostrarlos ordenados de mayor a menor.
 */
public class U04_C_A06_Julio_Montejano_Segovia {
    public static void main(String[] args){
            Scanner leer = new Scanner (System.in);
            System.out.println("Escribe los numeros ");
            int num1 = leer.nextInt();
            int num2 = leer.nextInt();
            int num3 = leer.nextInt();
            if (num1 > num2 && num1 > num3){
                System.out.println("El orden es " + num1 + "," + num2 + "," + num3);
            } else if (num1 > num3 && num3 > num2){
                System.out.println("El Orden es " + num1 + "," + num3 + "," + num2);
            } else if (num2 > num1 && num1 > num3){
                System.out.println("El Orden es " + num2 + "," + num1 + "," + num3);
            } else if (num2 > num3 && num3 > num1){
                System.out.println("El Orden es " + num2 + "," + num3 + "," + num1);
            }else if (num3 > num2 && num2 > num1){
                System.out.println("El Orden es " + num3 + "," + num2 + "," + num1);
            }else if (num3 > num2 && num1 > num2){
                System.out.println("El Orden es " + num3 + "," + num1 + "," + num2);
            }
            
    }        
}
