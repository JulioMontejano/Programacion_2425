package proyecto.java.pkg2_unidad_4.condicionales;
import java.util.Scanner;

/*
 * Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma:
 * insuficiente (de 0 a 4), suficiente (5), bien (6), notable (7 y 8) y sobresaliente (9 y 10).
 */

public class U04_C_A08_Julio_Montejano_Segovia {
    public static void main(String[] args){
        Scanner leer = new Scanner (System.in);
        System.out.println("Escribe la nota");
        int nota = leer.nextInt();
            switch (nota) {
                case 0,1,2,3,4 -> 
                    System.out.println(nota + "Suspenso");
                case 5 -> 
                    System.out.println(nota + "Suficiente");
                case 6 -> 
                    System.out.println(nota + "Aprovado");
                case 7,8 ->
                    System.out.println(nota + "Notable");
                case 9,10 ->
                    System.out.println(nota + "Excelente");
            }
    }
}