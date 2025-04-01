
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.java.pkg5_unidad7.actividad5;

import java.util.Scanner;

/**
 *
 * @author Julio
 */
public class CuentaCorriente {
    String nombreAtrib;
    String dniAtrib;
    double saldoAtrib;
    String nombreBanco;

    CuentaCorriente(String nombre, String dni){
        this.nombreAtrib=nombre;
        this.dniAtrib=dni;
    }

    CuentaCorriente(String nombre, String dni, double saldo){
        this.saldoAtrib=saldo;
    }

    CuentaCorriente(String nombreAtrib, String dni, double saldo, String nombreGestor, byte telefono, int importeMax){
        Gestor g= new Gestor(nombreGestor, telefono, importeMax);
        g.getNombre();
        g.getImporteMax();
        g.getTelefono();
        this.nombreAtrib=nombreAtrib;
        this.dniAtrib=dni;
        this.saldoAtrib=saldo;
    }
    //Creamos el método Setter para poder añadir a mano el nombre del banco
    void setNombreBanco(String nombreBanco){
        Scanner leer = new Scanner(System.in);
        this.nombreBanco=leer.nextLine();
    }
    //Obtenemos el nombre del banco para futuras operaciones
    String getNombreBanco(){
        return this.nombreBanco;
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
    static void infoCuenta(String nombre , String dni, double saldo){
            System.out.println("La información de la cuenta es: \n-------------------------------\n Nombre del titular: " + nombre + "DNI del titular: " + dni + "Saldo de la cuenta: " + saldo);
        }
        public static void main(String[] args) {
            infoCuenta("Julio Montejano", "03223378C", 0);
        
    }
}
