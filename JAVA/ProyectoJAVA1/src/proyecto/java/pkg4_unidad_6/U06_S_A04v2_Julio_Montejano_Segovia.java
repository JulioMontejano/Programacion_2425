package proyecto.java.pkg4_unidad_6;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Julio Montejano
 */
public class U06_S_A04v2_Julio_Montejano_Segovia {
    static void aciertaLongitud(String cad, String cadMaestra){
        int longMaestra = cadMaestra.length();
        int longCad= cad.length();
        System.out.println("La longitud de la cadena maestra es: " + longMaestra + " y la longitud de la cadena escrita es: " + longCad);
    }
    static void aciertaPass(String cad, String cadMaestra){
            while (cad.compareTo(cadMaestra)!=0) { 
                for (int i = 0; i < cadMaestra.length(); i++) {
                    char letrasCadMaster=cadMaestra.charAt(i);
                    char letrasCad=cad.charAt(i);
                    if (letrasCad==letrasCadMaster) {
                        System.out.print(letrasCad);
                    }else{
                        System.out.print("*");
                    }
                }
            }
    }
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Prueba a escribir la contraseña ");
        String cad1=leer.nextLine();
        String cadMaestra="Hola mi nombre es Pepe";
        aciertaLongitud(cad1, cadMaestra);
        aciertaPass(cad1, cadMaestra);
    }
}
