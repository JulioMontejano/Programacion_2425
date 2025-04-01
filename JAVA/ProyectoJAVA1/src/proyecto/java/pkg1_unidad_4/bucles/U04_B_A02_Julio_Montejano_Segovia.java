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
public class U04_B_A02_Julio_Montejano_Segovia {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
            System.out.print("Intoduce el numero: ");
            int edad = 0;
            int edadsuma = 0;
            int contadoralumno = 0;
            int contadormayores = 0;
            double mediaedad = 0;
                while (edad != -1) {
                    edad = leer.nextInt();
                    edadsuma += edad;
                    contadoralumno ++;
                    if (edad >= 18){
                       contadormayores++;
                    }
                    mediaedad = edadsuma / contadoralumno;
                }
                System.out.print("Cantidad de alumnos: " + contadoralumno + " " + "total de edades: " + edadsuma + " " + "Total Alumnos mayores de 18: " + contadormayores + " " + "La media de edades es: " + mediaedad);
    }
}
