/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.java.pkg1_unidad_3;

import java.util.*;

/**
 *
 * @author juio
 */
public class U03_A11_Julio_Montejano_Segovia {
    public static void main(String[] args){
            Scanner leer = new Scanner (System.in);
                final double PRECIO_MANZANA = 2.35;
                final double PRECIO_PERAS = 1.95;
                double beneficios1;
                double MS1, MS2;
                double beneficios2, PS1, PS2;
                System.out.println("Ventas de Manzanas en el Primer trimestre.(en Kg)");
                MS1 = leer.nextDouble();
                System.out.println("Ventas de Peras en el Primer trimestre.(en Kg)");
                PS1 = leer.nextDouble();
                beneficios1 = MS1 * PRECIO_MANZANA + PS1 * PRECIO_PERAS;
                System.out.println("Total 1� Semestre" + beneficios1);
                System.out.println("Ventas de Manzanas en el Segundo trimestre.(en Kg)");
                MS2 = leer.nextDouble();
                System.out.println("Ventas de Peras en el Segundo trimestre.(en Kg)");
                PS2 = leer.nextDouble();
                beneficios2 = MS2 * PRECIO_MANZANA + PS2 * PRECIO_PERAS;
                double Total = beneficios1 + beneficios2;
                System.out.println("El total es " + Total + "�");
    }       
}
