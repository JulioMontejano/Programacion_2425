/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyecto.java.pkg2_unidad_4.metodos;

import java.util.Scanner;
/**
 *
 * @author juio
 * 
 * area = 2π*radio*(altura + radio)
 * volumen = π*radio^2*altura
 */
public class U04_M_A03_Julio_Montejano_Segovia {
        static void cilindro(int opcion){
            Scanner leer = new Scanner (System.in);
                System.out.println("Escribe en este orden: radio, altura");
                    double radio = leer.nextInt(), altura = leer.nextInt();
                    if (opcion == 1) {
                        double area = 2*Math.PI*radio*(radio + altura);
                        System.out.println("El area es..." + area + "m²");
                    } else if (opcion == 2) {
                        double volumen = Math.PI*Math.pow(radio, 2)*altura;
                        System.out.println("El Volumen es..." + volumen + "m³");
                    }
        }
        public static void main(String[] args){
            Scanner leer = new Scanner (System.in);
                System.out.println("Elegir entre area (1) o volumen (2)");
                    int areavolumen = leer.nextInt();
                    cilindro(areavolumen);
    }
}
