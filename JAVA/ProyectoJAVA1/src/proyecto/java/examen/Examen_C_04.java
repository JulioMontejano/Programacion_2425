/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyecto.java.examen;

import java.util.Scanner;

/**
 *
 * @author monte
 */
public class Examen_C_04 {
    public static Boolean esPrimo(int numero)
{
    Boolean esPrimoActual = true;
    if(numero<2)
    {
        esPrimoActual = false;
    }
    else
    {
        for(int x=2; x*x<=numero; x++)
        {
            if( numero%x==0 ){esPrimoActual = false;break;}
        }
    }
    return esPrimoActual;
}
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        boolean primo = true;
        System.out.println("" + esPrimo(num));
    }
}
