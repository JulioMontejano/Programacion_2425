package proyecto.java.pkg4_unidad_6;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 * @author Julio Montejano
 */
public class U06_S_A08_Julio_Montejano_Segovia {

    static void  compararStrings(){
        //creamos las variables que usaremos.
        String cadpalabra="";
        String frase = "";
        String borrar="fin";
        String aux="";
        //creamos el scanner para poder pedir al usuario.
        Scanner leer = new Scanner(System.in);
        System.out.print("Escribe las palabras: ");
        //comienzo del programa
        if (cadpalabra.compareToIgnoreCase("fin")!=0) {
            do {
                cadpalabra=leer.next();
                frase+=cadpalabra;
                if (!frase.isEmpty()) {
                    frase+=" ";
                }
            } while (cadpalabra.compareToIgnoreCase("fin")!=0);
            frase=frase.toLowerCase();
            if (frase.indexOf(borrar)>0) {
                aux=frase.substring(0, frase.length()-borrar.length()-1);
            }
            System.out.println("las palabras escritas son: " + aux);
        }else if (cadpalabra.compareToIgnoreCase("fin")==0) {
            System.out.println("Has cerrado la sesión");
        }

    }
    public static void main(String[] args) {
        compararStrings();
    }
}
