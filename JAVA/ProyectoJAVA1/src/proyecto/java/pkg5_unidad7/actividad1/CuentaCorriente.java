
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.java.pkg5_unidad7.actividad1;

import java.util.Scanner;

/**
 *
 * @author Julio
 */
public class CuentaCorriente {
    String nombreAtrib;
    String dniAtrib;
    double saldoAtrib;

    CuentaCorriente(String nombre, String dni){
        this.nombreAtrib=nombre;
        this.dniAtrib=dni;
    }

    CuentaCorriente(double saldo){
        this.saldoAtrib=saldo;
    }

    void ingresarDinero(double saldo){
        Scanner leer=new Scanner(System.in);
        System.out.print("Monto a ingresar: ");
        double ingreso=leer.nextDouble();
        saldo+=ingreso;
        
    }
    
    double sacarDinero(double saldo,double dineroSacar){
        if (saldo>dineroSacar){ 
            System.out.println("No hay dinero suficiente: " + saldo + " Intenta sacar: " + dineroSacar);
        }else if (saldo<dineroSacar || saldo==dineroSacar) {
            saldo -=dineroSacar;
            System.out.println("El saldo de la cuenta ahora es: " + saldo);
        }
        return saldo;
    }
    void infoCuenta(String nombre , String dni, double saldo){
        System.out.println("La información de la cuenta es: \n-------------------------------\n Nombre del titular: " + nombre + "DNI del titular: " + dni + "Saldo de la cuenta: " + saldo);
    }
    public static void main(String[] args) {
        infoCuenta("Julio Montejano", "03223378C", 0);
        
    }
}
