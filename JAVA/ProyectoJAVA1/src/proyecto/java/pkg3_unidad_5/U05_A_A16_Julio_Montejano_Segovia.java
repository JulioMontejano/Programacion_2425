package proyecto.java.pkg3_unidad_5;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//package proyecto.java.pkg3_unidad_5.arrays;
import java.util.*;
/**
 *
 * @author juio
 */
public class U05_A_A16_Julio_Montejano_Segovia {
    static int[] tablaAleatoria(){
        int t[] = new int[3];
        for (int i = 0; i < t.length; i++) {
            t[i] = (int) (Math.random()*5+1);
        }
        System.out.println("La tabla es " + Arrays.toString(t));
        return t;
    }
    static int[] tablaUsuario(){
        Scanner leer = new Scanner (System.in);
        int t[] = new int[3];
        for (int i = 0; i <t.length; i++){
            System.out.println("Introducir numero " + i);
            t[i] = leer.nextInt();
        
        }
        System.out.println("Esta es la tabla escrita " + Arrays.toString(t));
        return t;
    }
    static void comparar(int tUsario[], int tAleatoria[]){
        if (tUsario!=tAleatoria) {
            System.out.println("Prueba otra vez");
            while (tUsario!=tAleatoria) { 
                for (int i = 0; i < tUsario.length; i++) {
                    int indiceUsuario = tUsario[i];
                    int indiceAleatorio = tAleatoria[i];
                    if (indiceUsuario == indiceAleatorio) {
                        System.out.println("Es igual");
                    }else if (indiceUsuario > indiceAleatorio) {
                        System.out.println("Es menor");
                    }else if (indiceUsuario<indiceAleatorio){
                        System.out.println("Es mayor");
                    }
                }
                tablaUsuario();
            }
        }else if(tUsario==tAleatoria){
            System.out.println("Las tablas del usuario y generada aleatoriamente son "+ Arrays.equals(tUsario, tAleatoria));
        }
        
    }
    public static void main(String[] args) {
        int aleatoria[] = tablaAleatoria();
        int usuario[] = tablaUsuario();
        comparar(usuario, aleatoria);

    }
}
