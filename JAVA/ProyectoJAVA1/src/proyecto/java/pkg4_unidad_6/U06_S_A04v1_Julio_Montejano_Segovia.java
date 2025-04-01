package proyecto.java.pkg4_unidad_6;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Julio Montejano
 */
public class U06_S_A04v1_Julio_Montejano_Segovia {
    static void mayorMenor(String cad){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ahora jugador 2, escriba su contraseña: ");
        String cadJugador2=leer.nextLine();
        if (cadJugador2.compareTo(cad)>0) {
            System.out.println("Revise las mayúsculas o espacios");
        }else{
            System.out.println("Revise las minúsculas o espacios");
        }
    }
    public static void main(String[] args) {
        System.out.println("Jugador 1 escriba la contraseña(cuidado con las myúsculas): ");
        Scanner leer = new Scanner(System.in);
        String cadJugador1=leer.next();
        mayorMenor(cadJugador1);

    }
}