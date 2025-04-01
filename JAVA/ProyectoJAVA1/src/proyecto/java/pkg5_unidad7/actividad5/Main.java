package proyecto.java.pkg5_unidad7.actividad5;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Julio
 */
public class Main {
    public static void cuentaCorriente(){
        Scanner leer=new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = leer.nextLine();
        System.out.print("Ingrese su DNI: ");
        String dni=leer.nextLine();
        double saldo=0;
        CuentaCorriente cC = new CuentaCorriente(nombre, dni, saldo);
    }

    public static void gestorMetodo(){
        Scanner leer=new Scanner(System.in);
        System.out.print("\\n---- Gestor ----\\n" + "\\n-------------------------------\\n" + "Ingrese su nombre: ");
        String nombre = leer.nextLine();
        System.out.print("Ingrese el Nº de DNI: ");
        byte telefono = leer.nextByte();
        int importe =leer.nextInt();
        Gestor g =new Gestor(nombre, 0, 0);
    }
    public static void main(String[] args) {
        cuentaCorriente();
        gestorMetodo();
    }
}
