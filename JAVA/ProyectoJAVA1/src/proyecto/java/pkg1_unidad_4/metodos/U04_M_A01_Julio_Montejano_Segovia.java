package proyecto.java.pkg2_unidad_4.metodos;

import java.util.Scanner;

/**
 *
 * @author juio
 */

 public class U04_M_A01_Julio_Montejano_Segovia {
    static void eco(int veces) {
        for (int i = 1; i <= veces; i++) {
            System.out.println("eco...");
        }
    }
    public static void main(String[] args){
        Scanner leer = new Scanner (System.in);
        System.out.println("Cuantas veces... ");
        int veces = leer.nextInt();
        eco(veces);
    }
}