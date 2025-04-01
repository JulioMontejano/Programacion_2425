package proyecto.java.pkg2_unidad_4.bucles;

/**
 *
 * @author juio
 */
public class U04_B_A12_Julio_Montejano_Segovia {
    public static void main(String[] args) {
            for (int i = 1; i <= 10; i++) {

                for (int j = 1; j <= 10; j++) {
                    int resultado = i * j;
                    System.out.println("La tabla es: " + i + "x" + j + " = " + resultado);
                }
            }
    }
}