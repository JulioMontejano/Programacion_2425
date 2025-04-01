/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyecto.java.pkg3_unidad_5;
/**
 *
 * @author monte
 */
public class U05_A_A04_Julio_Montejano_Segovia {
    static int maximo (int tabla[]){
        int valor = 0;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] > valor) {
                valor = tabla[i];
            }
        }
        return valor;
    }
    public static void main(String[] args) {
        int[] tabla = {23,23,65,1,89,32};
        System.out.println("el valor maximo es " + maximo(tabla));
    }
}
