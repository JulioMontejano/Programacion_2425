package proyecto.java.pkg2_unidad_4.condicionales;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juio
 * Crea una app que solicite dia mes y año y que muestre la fecha del dia siguiente
 */
public class U04_C_A12_Julio_Montejano_Segovia {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Escribe el dia-mes-año ");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int año = leer.nextInt();
        dia++;
        switch (mes) {
            case 1,3,5,7,8,10,12 ->{
                if (dia >= 1 && dia <= 31 && mes >= 12 && dia >= 31) {
                    dia = 0;
                    mes = 0;
                    año++;
                }
                System.out.println("El dia siguiente es: " + dia + "-" + mes + "-" + año);

            }
            case 2 -> {
                if (dia >= 1 && dia >= 28) {
                    dia = 1;
                    mes++;
                }
                System.out.println("El dia siguiente es: " + dia + "-" + mes + "-" + año);
            }
            case 4,6,9,11 -> {
                if (dia >= 1 && dia >= 30) {
                    dia = 1;
                    mes++;
                }
                System.out.println("El dia siguiente es: " + dia + "-" + mes + "-" + año);
            }
        }
    }

}
