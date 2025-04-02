package proyecto.java.pkg5_unidad7.actividad8;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monte
 */
public class SintonizadorMain {
    public static void main(String[] args) {
        Sintonizador s=new Sintonizador(107);
        

        System.out.println("la frecuencia es: " + s.getFrecuencia());
        s.upFrecuencia(1);
        s.upFrecuencia(5);
        s.downFrecuencia(5);
    }
}
