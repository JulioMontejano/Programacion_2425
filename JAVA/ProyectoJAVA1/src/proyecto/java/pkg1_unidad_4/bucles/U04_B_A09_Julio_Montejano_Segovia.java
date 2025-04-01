package proyecto.java.pkg2_unidad_4.bucles;

import java.util.Scanner;

/**
 *
 * @author juio
 */
public class U04_B_A09_Julio_Montejano_Segovia {
        public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
            System.out.println("Escribe el numero de al que hacer la tabla");
            int num = leer.nextInt();
            int multiplo = 0;
            for (int i = 0; i < 10; i++) {
                multiplo++;
                int resultado = multiplo * num;
                System.out.println("Resultados de la tabla de miltiplicar de " + num + "x" + multiplo + " = " + resultado);
            }
    }
}
