/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyecto.java.pkg3_unidad_5;
import java.util.*;
/**
 *
 * @author juio
 */
public class U05_A_A09_Julio_Montejano_Segovia {
    static int[]  tablaAleatoria(){
        int t[] = new int[20];
        for (int i = 0; i < t.length; i++) {
            t[i] = (int) (Math.random()*100+1);
        }
        return t;
}
    static int[] copiaRango(int t[], int desde, int hasta){
        int tablaCopia[]=Arrays.copyOfRange(t,desde,hasta);
        return tablaCopia;
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        tablaAleatoria();
        int random[]=tablaAleatoria();
        System.out.println("La tabla aleatoria es "+ Arrays.toString(random));
        System.out.println("Introduce el rango el cual se quiere copiar ");
        int desde = leer.nextInt(), hasta = leer.nextInt();
        int tablaRango[]=copiaRango(random, desde, hasta);
        System.out.println("La tabla copiada es "+ Arrays.toString(tablaRango));
    }

}
