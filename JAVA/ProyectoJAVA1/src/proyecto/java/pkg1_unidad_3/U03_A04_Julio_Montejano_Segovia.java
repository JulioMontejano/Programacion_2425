

package proyecto.java.pkg1_unidad_3;

import java.util.Scanner;

/**
 *
 * @author juio
 */
/**
 * pedimos el a�o de nacimiento y el a�o actual, lo restamos despues.
 */
public class U03_A04_Julio_Montejano_Segovia {
       public static void main(String[] args){
           Scanner leer = new Scanner (System.in);
           System.out.println("�En que a�o naciste?");
           int anonacimiento = leer.nextInt();
           System.out.println("Escriba el a�o actual");
           int anoact = leer.nextInt();
           int edad = anoact - anonacimiento;
           System.out.println("Tu edad es " + edad);

       }
}
