package proyecto.java.pkg5_unidad7.actividad1;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

import proyecto.java.pkg5_unidad_7.u7_a01_julio.CuentaCorriente;
/**
 *
 * @author Julio
 */
public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = leer.nextLine();
        System.out.print("Ingrese su DNI: ");
        String dni=leer.nextLine();
        double saldo=0;
        CuentaCorriente CC = new CuentaCorriente(nombre, dni, saldo);
        
    }
}
