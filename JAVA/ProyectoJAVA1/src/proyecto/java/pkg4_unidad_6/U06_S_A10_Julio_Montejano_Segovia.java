package proyecto.java.pkg4_unidad_6;
/**
 * @author Julio Montejano
 */

import java.util.Scanner;

public class U06_S_A10_Julio_Montejano_Segovia {
    static String escribirPalabra(){
        String cadPalabra;
        
        Scanner leer = new Scanner(System.in);
        
        cadPalabra=leer.next();
        cadPalabra.toLowerCase();
        return cadPalabra;
    }
    
    static int factorial(int num){
        int factorial = 1;
        for (int i = 0; i <= num; i++) {
            factorial=factorial*i;
        }
        return factorial;
    }

    static void anagrama(){
        String palabra1="", palabra2="";
        char[] cadaux;
        int longitud;

        System.out.println("Escribe la primera palabra a analizar: ");
        palabra1=escribirPalabra();
        System.out.println("Escribe la segunda palabra a analizar: ");
        palabra2=escribirPalabra();

        
        if (palabra1.equals(palabra2)) {
            System.out.println("Son la Misma palabra: " + palabra1 + " y " + palabra2);
        }else {
            cadaux=palabra2.toCharArray();
            longitud=factorial(cadaux.length);
            do { 
                for (int i = 0; i < longitud; i++) {
                    
                }
            } while (!palabra1.equals(palabra2));
        }
        
    }
    public static void main(String[] args) {
        
    }
}
