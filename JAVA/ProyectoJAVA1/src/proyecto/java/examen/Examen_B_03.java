/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyecto.java.examen;

import java.util.Scanner;

/**
 *
 * @author juio
 */
public class Examen_B_03 {
    public static void main (String[]args){
       Scanner leer = new Scanner(System.in);
       int num = leer.nextInt();
       int contador = 1;
       for (int i = 10; i < num; i*=10) {
           int result = num/10;
           contador= +1;
       } 
       
    }
}
