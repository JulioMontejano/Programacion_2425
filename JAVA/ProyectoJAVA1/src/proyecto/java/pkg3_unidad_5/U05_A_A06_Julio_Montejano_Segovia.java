/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.java.pkg3_unidad_5;
/**
 *
 * @author juio
 */
public class U05_A_A06_Julio_Montejano_Segovia {
    static int buscar(int tabla[], int clave){
        int indiceBusqueda = 0;
        while (indiceBusqueda < tabla.length && tabla[indiceBusqueda]!=clave) { 
            indiceBusqueda++;
        }
        if (indiceBusqueda==tabla.length) {
            return -1;
        }else{
            return indiceBusqueda;
        }
    }
    public static void main(String[] args) {
        int tabla[] = {12,34,65,90,21,43};
        int clave = 2;
        buscar(tabla, clave);
    }
}
