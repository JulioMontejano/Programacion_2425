/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyecto.java.examen;
import java.util.Scanner;
/**
 *
 * @author juio
 */
public class Examen_B_04 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        for (int i = 1; i <= num; i++) {
            int resta = num - 1;
            int multiplicacion = resta * num;
            int resultado = 0;
            resultado += multiplicacion;
            System.out.println("El resultado "+resultado);
        }
    }

}
