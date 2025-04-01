package proyecto.java.pkg4_unidad_6;
import java.util.Scanner;
/**
 * @author Julio Montejano
 */
public class U06_S_A07_Julio_Montejano_Segovia {
    static String escribirFrase(){
        String cadFrase;
        Scanner leer = new Scanner(System.in);
        System.out.print("Escribe la frase en uno de los 2 idiomas: ");
        cadFrase=leer.nextLine();

        return cadFrase;
    }
    static String identificarIdioma(String cad){
        String javalin="Javalin, javalon    ";
        String javalen="     javalen len len";
        String translate="";
        String tab="    ";
        if (cad.startsWith(javalin)) {
            translate=cad.substring(javalin.length());
            System.out.println("Es idioma javalin " + translate);
        }else if (cad.endsWith(javalen)) {
            int pos=cad.indexOf(tab);
            translate=cad.substring(0,pos);
            System.out.println("Es idioma javalen " + translate);
        }else{
            System.out.println("Escribe una palabra en uno de los 2 idiomas");
        }
        return translate;
    }
    public static void main(String[] args) {
        String cad=escribirFrase();
        String cad1=identificarIdioma(cad);
    }
}
