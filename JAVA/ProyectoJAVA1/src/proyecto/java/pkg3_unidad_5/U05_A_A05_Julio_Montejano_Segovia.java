/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyecto.java.pkg3_unidad_5;
import java.lang.*;
import java.util.*;
/**
 *
 * @author monte
 */
public class U05_A_A05_Julio_Montejano_Segovia {
    static int rellenaPares(int longitud, int fin){
        int t[] =new int[longitud];
        int indice =0;
        int pares=0;
        while (i<t.length) { 
            if (pares%2==0) {
                t[indice] = pares;
                indice++;
            }
        }
        Arrays.sort(t);
        return pares;
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe 1º la loongtud del Array, 2º el Final del array");
        int longitud = leer.nextInt(), fin = leer.nextInt();
       rellenaPares(longitud, fin); 
    }
}