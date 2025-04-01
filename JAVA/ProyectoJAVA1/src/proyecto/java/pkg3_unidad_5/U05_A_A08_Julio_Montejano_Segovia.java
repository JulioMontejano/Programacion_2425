/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyecto.java.pkg3_unidad_5;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author juio
 */
public class U05_A_A08_Julio_Montejano_Segovia {
    static void  crearTabla(int t[], int longitud){
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce los números de la tabla ");
        for (int i = 0; i < t.length; i++) {
            t[i]=leer.nextInt();
        }
        int copia[]= Arrays.copyOf(t, longitud+5);
        System.out.println("La tabla que has creado es " + Arrays.toString(t));
        System.out.println("La tabla copiada es " + Arrays.toString(copia));
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Intoduce el tamaño de la tabla ");
        int longitud=leer.nextInt();
        int t[] = new int[longitud];
        crearTabla(t, longitud);
    }
}
