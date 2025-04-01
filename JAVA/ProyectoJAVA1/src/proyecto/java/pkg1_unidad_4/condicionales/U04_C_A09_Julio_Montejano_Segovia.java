package proyecto.java.pkg2_unidad_4.condicionales;
import java.util.*;

/**
 *
 * @author juio
 * Idear un programa que solicite al usuario un número comprendido entre 1 y 7,
 * correspondiente a un día de la semana. Se debe mostrar el nombre del día de la semana al que corresponde.
 * Por ejemplo, el número 1 corresponde a «lunes» y el 6 a «sábado».
 */
public class U04_C_A09_Julio_Montejano_Segovia {
    public static void main(String[] args){
        Scanner leer = new Scanner (System.in);
        System.out.println("Escribe el dia de la semana en numero");
        int dia = leer.nextInt();
        switch (dia) {
            case 1 ->
                System.out.println("El dia es Lunes");
            case 2 ->
                System.out.println("El dia es Martes");
            case 3 -> 
                System.out.println("El dia es Miercoles");
            case 4 ->
                System.out.println("El dia es Jueves");
            case 5 ->
                System.out.println("El dia es Viernes");
            case 6 ->
                System.out.println("El dia es Sabado");
            case 7 ->
                System.out.println("El dia es Domingo");
        }
    }    
}
