/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyecto.java.pkg3_unidad_5;
import java.util.*;
/**
 *
 * @author juio
 */
public class U05_A_A12_Julio_Montejano_Segovia {
    static int[] tablaDesordenada(int longitud){
        Scanner leer=new Scanner(System.in);
        int t[]=new int[longitud];
        for (int i = 0; i < t.length; i++) {
            System.out.println("Escribe el numeros de la tabla ");
            t[i]=leer.nextInt();
        }
        return t;
    }
    static void tablasOrganizadas(int t[]){
        int impar[] = new int[0], par[]=new int[0];
        for (int indice : t) {
            if (indice%2==0) {
                par=Arrays.copyOf(par, par.length+1);
                par[par.length-1]=indice;
            }else{
                impar=Arrays.copyOf(impar, impar.length+1);
                impar[impar.length-1]=indice;
            }
        }
        Arrays.sort(par);
        Arrays.sort(impar);
        System.out.println("La tabla de pares es " + Arrays.toString(par));
        System.out.println("La tabla de pares es " + Arrays.toString(impar));
    }
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Escribe la longitud de la tabla ");
        int longitud=leer.nextInt();
        int t[]=tablaDesordenada(longitud);
        tablasOrganizadas(t);
        
    }
}
