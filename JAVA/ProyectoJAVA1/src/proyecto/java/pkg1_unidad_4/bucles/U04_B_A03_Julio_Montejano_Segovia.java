package proyecto.java.pkg2_unidad_4.bucles;

import java.util.Scanner;

/**
 *
 * @author julio
 */
public class U04_B_A03_Julio_Montejano_Segovia {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.print("Introduce tu numero: ");
        int num = leer.nextInt();
        int numraleatorio = (int) (Math.random()*100+0);
        System.out.println(numraleatorio);
        while (num != -1) {
            if (numraleatorio > num) {
                System.out.println("Tu numero es menor");
            } else if (numraleatorio < num) {
                System.out.println("Tu numero es mayor");
            } else if (num == numraleatorio) {
                System.out.println("Es correcto");
                num = -1;
            }
            num = leer.nextInt();
        }
    }
}
