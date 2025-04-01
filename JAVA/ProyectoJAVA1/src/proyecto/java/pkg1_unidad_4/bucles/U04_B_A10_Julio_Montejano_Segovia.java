package proyecto.java.pkg2_unidad_4.bucles;

import java.util.Scanner;

/**
 *
 * @author juio
 */
public class U04_B_A10_Julio_Montejano_Segovia {
        public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Escribe la cantidad de num impares a sumar");
            int numImpar = leer.nextInt();
            int contadorNum = 0;
            int sumaImpar = 0;
                for (int i = 0; i < numImpar; i++) {
                    contadorNum++;
                    if (contadorNum % 2 != 0) {
                        sumaImpar += contadorNum;
                    }
                    if (contadorNum % 2 == 0){
                        contadorNum++;
                        sumaImpar += contadorNum;
                    }
                }
                System.out.println("La suma es: " + sumaImpar);
    }
}
