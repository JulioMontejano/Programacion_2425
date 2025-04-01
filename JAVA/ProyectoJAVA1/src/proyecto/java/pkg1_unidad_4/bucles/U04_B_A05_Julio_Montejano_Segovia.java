package proyecto.java.pkg2_unidad_4.bucles;
import java.util.Scanner;
/**
 *
 * @author julio
 */
public class U04_B_A05_Julio_Montejano_Segovia {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int numAleatorio1 = (int) (Math.random()*100+0);
        int numAleatorio2 = (int) (Math.random()*100+0);
            int resultado = 0;
            int contadoracierto = 0;
                do { 
                    numAleatorio1 = (int) (Math.random()*100+0);
                    numAleatorio2 = (int) (Math.random()*100+0);
                    System.out.println("Los numeros son: " + numAleatorio1 + " + " + numAleatorio2 + " = ");
                    resultado = leer.nextInt();
                    if (resultado == numAleatorio1 + numAleatorio2) {
                        contadoracierto ++;
                    }
                } while (resultado == numAleatorio1 + numAleatorio2);
                System.out.println("la cantidad de aciertos fue: " + contadoracierto);

    }
}