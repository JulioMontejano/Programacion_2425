/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyecto.java.pkg2_unidad_4.bucles;

import java.util.Scanner;

/**
 *
 * @author julio
 */
public class U04_B_A04_Julio_Montejano_Segovia {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Escribe la altura en cm");
        int altura = leer.nextInt();
        int altura_max = 0;
        int arbolcontador = 0;
        int arbolcontador_max = 0;
        while (altura != -1) { 
            arbolcontador++;
            if (altura > altura_max){
                altura_max = altura;
                arbolcontador_max = arbolcontador;
            }
            System.out.println("La altura es " + altura + "(" + arbolcontador + ")");
            altura = leer.nextInt();
        }
        System.out.println("la altura maxima es... " + altura_max + "("+ arbolcontador_max + ")");
    }
}
