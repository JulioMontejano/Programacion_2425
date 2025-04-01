package proyecto.java.pkg3_unidad_5;
//package proyecto.java.pkg3_unidad_5.arrays;

import java.util.Arrays;

/**
 *
 * @author juio
 */
public class U05_A_A01_Julio_Montejano_Segovia {
    public static void main(String[] args) {
        int tabla[] = new int[10];
        int suma =0;
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int) (Math.random()*100+1);
        }
        for (int valores : tabla) {
            suma+=valores;
        }

        System.out.println("Esta es la suma " + Arrays.toString(tabla) + suma);
    }
}
