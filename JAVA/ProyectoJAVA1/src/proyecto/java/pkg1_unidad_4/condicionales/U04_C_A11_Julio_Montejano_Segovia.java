package proyecto.java.pkg2_unidad_4.condicionales;


import java.util.*;
/**
 *
 * @author juio
 * @param args
 * Escribir un programa que pida una hora de la siguiente forma: hora, minutos y segundos.
 * EI programa debe mostrar qué hora será un segundo más tarde. Por ejemplo: hora actual [10:41:59] hora actual +1 segundo: [10:42:00]
 */
public class U04_C_A11_Julio_Montejano_Segovia {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Escribe la Hora: horas-minutos-segundos");
            int h = leer.nextInt();
            int m = leer.nextInt();
            int s = leer.nextInt();    
            s++;
            if (s == 59 || m == 59 || h == 24){
                s = 0;
                m = 0;
                h = 0;
            }
            System.out.println("La hora es " + h + "-" + m + "-" + s);
    }
    
}
