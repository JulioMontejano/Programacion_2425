/**
 *
 * @author juio
 */
package proyecto.java.pkg3_unidad_5;
import java.util.*;
public class U05_A_A14_Julio_Montejano_Segovia {
    static int[] eliminaMayores(int t[], int valor){
        int posIndice = 0;
        int copia[];
        copia = Arrays.copyOf(t, t.length);
        while (posIndice < copia.length && copia[posIndice]<valor) { 
            posIndice++;
        }
        if (posIndice<copia.length) {
            copia[posIndice]= copia[copia.length-1];
            copia=Arrays.copyOf(t, t.length-1);
            System.out.println(Arrays.toString(copia));
        } else{
            System.out.println("No existe");
        }
        return copia;
    }
    public static void main(String[] args) {
        int t[]={12,2,43,65,87};
        eliminaMayores(t,12);
    }
}
