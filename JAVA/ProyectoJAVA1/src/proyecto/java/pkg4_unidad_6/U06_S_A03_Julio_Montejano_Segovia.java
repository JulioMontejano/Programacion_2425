package proyecto.java.pkg4_unidad_6;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package proyecto.java.Pkg4_Unidad_6.Strings;

import java.util.Scanner;

/**
 * @author Julio Montejano
 */
public class U06_S_A03_Julio_Montejano_Segovia {
    static String invertida(String cad){
        System.out.println("Escribe la cadena ");
        String cadInvertida="";
        for (int i = cad.length()-1; i < 0; i--) {
            cadInvertida=cadInvertida+cad.charAt(i);
        }
        return cadInvertida;
    }
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String cad = leer.nextLine();
        invertida(cad);
        System.out.println("La cadena es " + cad);
    }
}
