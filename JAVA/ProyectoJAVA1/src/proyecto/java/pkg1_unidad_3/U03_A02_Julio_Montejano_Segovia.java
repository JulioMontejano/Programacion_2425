package proyecto.java.pkg1_unidad_3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author juio
 * JULIO MONTEJANO SEGOVIA
 */
/**
 * Leer por por consola unos numero con diferentes tipos de variables y despues mostralos
 */
import java.util.Scanner;
public class U03_A02_Julio_Montejano_Segovia{
    public static void main(String[] args){
        Scanner leer = new Scanner (System.in);
        System.out.println("Escribe el 1� n�...");
        int num = leer.nextInt();
        System.out.println("El n�mero escrito es..." + num);
        System.out.println("Escribe el 2� n�...");
        double num1 = leer.nextDouble();
        System.out.println("El siguiente n� decimal es..." + num1);
        System.out.println("Escribe el 3� n�...");
        String num2 = leer.next();
        System.out.println("La siguiente frase es... " + num2);
    }
}