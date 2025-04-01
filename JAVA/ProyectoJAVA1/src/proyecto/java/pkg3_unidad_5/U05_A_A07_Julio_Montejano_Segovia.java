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
public class U05_A_A07_Julio_Montejano_Segovia {
    static int primitiva(int apuesta[], int combGanadora[]){
        int aciertos = 0;
        for (int a : apuesta) {
            if (Arrays.binarySearch(combGanadora, a) >=0) {
                aciertos++;
            }
        }
        return aciertos;
    }
    public static void main(String[] args) {
        int apuesta[] = {3,2,1,7,8,9};
        int combGanadora[] = {7,3,1,7,8,9};
        primitiva(apuesta, combGanadora);
    }
}
