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
public class U04_M_A05_Julio_Montejano_Segovia {
        public static boolean esvocal(char letra){
            boolean verdadVocal;
            char vocal1 = 'a';
            char vocal2 = 'e';
            char vocal3 = 'i';
            char vocal4 = 'o';
            char vocal5 = 'u';
            if (letra == vocal1 || letra == vocal2 || letra == vocal3 || letra == vocal4 || letra == vocal5) {
                verdadVocal = true;
            } else{
                verdadVocal = false;
            }
            return verdadVocal;
        }
            public static void main(String[] args) {
                Scanner leer = new Scanner (System.in);
                char letra = leer.next().charAt(0);
                System.out.println("¿Es una vocal? " + esvocal(letra));
    }
}
