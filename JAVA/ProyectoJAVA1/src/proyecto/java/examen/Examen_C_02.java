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
public class Examen_C_02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        if (num==0||num==1||num==2) {
            System.out.println("F");
        } else if (num==4||num==3) {
            System.out.println("D");
        } else if (num==5||num==6){
            System.out.println("C");
        } else if (num==7||num==8){
            System.out.println("B");
        } else if (num==9||num==10){
            System.out.println("A");
        }
    }
}

