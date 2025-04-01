/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyecto.java.pkg3_unidad_5;

import java.util.Arrays;

/**
 *
 * @author juio
 */
public class U05_A_A11_Julio_Montejano_Segovia {
    
    static void sinRpetidos(int t[]){
        int copia[]=new int[0];
        for (int i = 0; i < 10; i++) {
            while (t[i] < t.length && t[i]!=elemento) { 
                indiceBusqueda++;
            }
            if (indiceBusqueda<t.length) {
                
            }else{
                
            }
        }
        System.out.println("La tabla es " + Arrays.toString(copia));
    }
    public static void main(String[] args) {
        int t[] = {23,12,23,76,76,11,34,54,34};
        System.out.println("La tabla es " + Arrays.toString(t));
        sinRpetidos(t);
    }
}
