/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.java.pkg1_unidad_3;

import java.util.Scanner;

/**
 *
 * @author juio
 */
public class U03_A10_Julio_Montejano_Segovia {
     public static void main(String[] args){
            Scanner leer = new Scanner (System.in);
            System.out.println("�Est� lloviendo?");
            boolean lluvia = leer.nextBoolean();
            System.out.println("�Has terminado las tareas?");
            boolean fintarea = leer.nextBoolean();
            System.out.println("�Tienes que ir a la biblioteca?");
            boolean biblioteca = leer.nextBoolean();
            boolean permiso = (fintarea && !lluvia) || biblioteca;
            System.out.println("�Tienes que ir a la biblioteca?" + permiso);
     }        
}
