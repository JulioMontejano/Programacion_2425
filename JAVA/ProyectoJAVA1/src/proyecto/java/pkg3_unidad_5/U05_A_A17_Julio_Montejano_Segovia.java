package proyecto.java.pkg3_unidad_5;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package proyecto.java.pkg3_unidad_5.arrays;
import java.util.Arrays;
/**
 *
 * @author juio
 */

public class U05_A_A17_Julio_Montejano_Segovia {
    static void rellenarFor(int t[][]){
        for (int x = 0; x < t.length; x++) {
            for (int y = 0; y < t.length; y++) {
                t[x][y] = 10*x+y;
            }
        }
        System.out.println("La tabla es " + Arrays.deepToString(t));
    }
    static void rellenarForEach(int t[][]){
        int x = 0;
        int y = 0;
        for (int[] fila : t) {//por que al ser una matriz por lo que cada elemento es una array.
            for (int columna : fila) {//son arrays que se pueden recorrer con otro for each anidado
                t[x][y]=10*x+y;
                
            }
        }
        //System.out.println("La tabla es " + Arrays.deepToString(t));
    }
    static void mostrarForEach(int t[][]){
        int x = 0;
        int y = 0;
        for (int[] fila : t) {//por que al ser una matriz por lo que cada elemento es una array.
            for (int columna : fila) {//son arrays que se pueden recorrer con otro for each anidado
                //System.out.println(Arrays.toString(fila))
                
            }
            System.out.println(Arrays.toString(fila));
        }
    }
    public static void main(String[] args) {
        int t[][];
        t=new int [5][5];
        rellenarFor(t);
        rellenarForEach(t);
        mostrarForEach(t);

    }
}
