package proyecto.java.pkg2_unidad_4.bucles;

import java.util.Scanner;

/**
 *
 * @author juio
 */
public class U04_B_A08_Julio_Montejano_Segovia {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Cantidad de numeros vas a sumar ");
        int veces = leer.nextInt();
        System.out.println("Escribe los numeros a operar ");
        int sumanum = 0;
            for (int i = 0; i < veces; i++) {
                int num = leer.nextInt();
                sumanum += num;
            }
            double media = sumanum / veces;
            System.out.println("La media es: " + media);
    }
}
