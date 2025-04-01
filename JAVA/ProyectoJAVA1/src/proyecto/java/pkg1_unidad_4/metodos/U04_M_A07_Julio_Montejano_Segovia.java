/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyecto.java.pkg2_unidad_4.metodos;
import java.util.Scanner;

/**
 *
 * @author juio
 */
public class U04_M_A07_Julio_Montejano_Segovia {
        static int dias(int numDias){
            int resultadoDias = numDias * 24 * 60* 60;
            return resultadoDias;
        }
        static int horas(int numHoras){
            int resultadoHoras = numHoras * 60*60;
            return resultadoHoras;
        }
        static int minutos(int numMin){
            int resultado = numMin*60;
            return resultado;
        }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce en este orden: DIAS-HORAS-MINUTOS");
        int numDias = leer.nextInt();
        int numHoras = leer.nextInt();
        int numMin = leer.nextInt();
        System.out.println("Estos son los segundos totales: " + dias(numDias) + horas(numHoras) + minutos(numMin));
    }
}
