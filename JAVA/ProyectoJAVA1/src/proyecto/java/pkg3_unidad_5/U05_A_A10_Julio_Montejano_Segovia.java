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
public class U05_A_A10_Julio_Montejano_Segovia {
    static void tablaCopy(int desde, int hasta){
        char origen[]={'a','b','c','d','e','f','g','h','i','j'};
        char destino[]=new char[10];
        System.out.println("Las tablas antes " + Arrays.toString(origen) + "\n" + Arrays.toString(destino));
        int longitud = hasta-desde;
        System.arraycopy(origen, desde, destino, desde, longitud);
        System.out.println("Las tablas antes " + Arrays.toString(origen) + "\n" + Arrays.toString(destino));
    }
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Escribe los indices desde donde quieres copiar hasta donde quieras copiar (desde, hasta)");
        int desde = leer.nextInt(), hasta=leer.nextInt();
        tablaCopy(desde, hasta);

    }
}
