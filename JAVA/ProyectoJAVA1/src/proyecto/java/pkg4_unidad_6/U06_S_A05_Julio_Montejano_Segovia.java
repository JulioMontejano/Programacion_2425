package proyecto.java.pkg4_unidad_6;
import java.util.Scanner;

/**
 * @author Julio Montejano
 */
public class U06_S_A05_Julio_Montejano_Segovia {
    static String sinVocales(String cad){
        char a=Character.toLowerCase('A');
        char e=Character.toLowerCase('E');
        char i=Character.toLowerCase('I');
        char o=Character.toLowerCase('O');
        char u=Character.toLowerCase('U');
        
        if (cad.indexOf(a)>0) {
            
        }else if (cad.indexOf(e)>0) {
            
        } else if ((cad.indexOf(i)>0)) {
            
        }else if ((cad.indexOf(o)>0)) {
            
        }else if ((cad.indexOf(u)>0)) {
            
        }
        return cad;
    }
    public static void main(String[] args) {
        String nombre;

        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba su nombre con 2 apellidos ");
        nombre=leer.nextLine();
        sinVocales(nombre);
    }
}
