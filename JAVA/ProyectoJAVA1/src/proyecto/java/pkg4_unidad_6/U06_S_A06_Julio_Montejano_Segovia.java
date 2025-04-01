package proyecto.java.pkg4_unidad_6;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Julio Montejano
 */
public class U06_S_A06_Julio_Montejano_Segovia {
    static String escribirFrase(){
        String cadFrase;
        Scanner leer = new Scanner(System.in);
        System.out.print("Escribe la frase: ");
        cadFrase=leer.nextLine();

        return cadFrase;
    }
    static String escribirPalabra(){
        String cadPalabra;
        Scanner leer = new Scanner(System.in);
        System.out.print("Escibre la palabra a buscar: ");
        cadPalabra=leer.nextLine();

        return cadPalabra;
    }


    static void buscar(String cadFrase, String cadPalabra){
        int contadorPalabras=0;
        int contador=0;
        int longitud = cadPalabra.length();
        for (int i = 0; i < cadFrase.length(); i++) {
            if (cadFrase.indexOf(cadPalabra)>0) {
                contador++;
                i=+longitud;
            }
        }
        System.out.println("La cantidad de veces es " + contador);
        
    }

    public static void main(String[] args) {
        String frase =escribirFrase();
        String palabra =escribirPalabra();
        buscar(frase, palabra);
    }
}
