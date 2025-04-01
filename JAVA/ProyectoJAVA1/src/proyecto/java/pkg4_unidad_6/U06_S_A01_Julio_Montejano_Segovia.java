package proyecto.java.pkg4_unidad_6;
//package proyecto.java.Pkg4_Unidad_6.Strings;

import java.util.Scanner;

/**
 * @author Julio Montejano
 */
public class U06_S_A01_Julio_Montejano_Segovia {
    static void comparar(String cad1, String cad2){
        int long1, long2;
        long1 = cad1.length();
        long2 = cad2.length();
        if (long1<long2) {
            System.out.println("La cadena " + cad2 + " es mas larga");
        }else{
            System.out.println("La cadena " + cad1 + " es mas larga");
        }
    }
    public static void main(String[] args) {
        System.out.println("Introduce la primera cadena");
        Scanner leer = new Scanner(System.in);
        String cad1 = leer.nextLine();
        System.out.println("Introduce la segunda cadena");
        String cad2 = leer.nextLine();
        comparar(cad1, cad2);
    }
}
