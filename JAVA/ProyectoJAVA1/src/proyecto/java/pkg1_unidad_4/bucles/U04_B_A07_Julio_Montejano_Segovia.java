package proyecto.java.pkg2_unidad_4.bucles;
import java.util.Scanner;

/**
 *
 * @author juio
 */
public class U04_B_A07_Julio_Montejano_Segovia {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Escribe el numero a sacar los multiplos");
        int num = leer.nextInt();
        System.out.println("rango de busqueda multiplos: ");
        int veces = leer.nextInt();
            for (int i = 0; i <= veces; i++) {
                if (i % num == 0) {
                    System.out.println("Los numeros son: " + i);
                }
            }
    }
}
