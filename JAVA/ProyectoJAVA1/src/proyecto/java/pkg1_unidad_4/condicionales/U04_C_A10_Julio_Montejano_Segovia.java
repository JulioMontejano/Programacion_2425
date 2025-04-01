package proyecto.java.pkg2_unidad_4.condicionales;
import java.util.Scanner;

public class U04_C_A10_Julio_Montejano_Segovia {
    /**
     * @author julio
     * Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
     * Hay que tener en cuenta que existen meses con 28, 30 y 31 días (no se considerará los años bisiestos).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Escribe Fecha dia-mes-año");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int año = leer.nextInt();
        boolean fechacorrecta = false;
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && dia >= 1 && dia <= 31 && año < 2025){
            fechacorrecta = true;
        } else if (mes == 2 && dia >= 1 && dia <= 28 && año < 2025) {
           fechacorrecta = true;            
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia >= 1 && dia <= 30 && año < 2025) {
            fechacorrecta = true;
        }
        System.out.println("La fehcha que se introdujo es ... " + fechacorrecta);
    }
}
