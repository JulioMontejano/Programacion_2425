package proyecto.java.pkg5_unidad7.actividad10.main_empresa;

import proyecto.java.pkg5_unidad7.actividad10.personal.JefeDeEstacion;
import proyecto.java.pkg5_unidad7.actividad10.personal.Maquinista;
import proyecto.java.pkg5_unidad7.actividad10.personal.Mecanico;

import proyecto.java.pkg5_unidad7.actividad10.maquinaria.Locomotora;
import proyecto.java.pkg5_unidad7.actividad10.maquinaria.Tren;

import java.util.Scanner;



public class Main {

    public static void mostrarInfoLocomotora(Locomotora locomotora, Mecanico m){
        System.out.println("======= INFORMACIÓN DE LA LOCOMOTORA =======" + "\n" + "El año de fabricación es: " + locomotora.getAñoFabricacion() + "\n" + "La Matricula es: " + locomotora.getMatricula() + "\n" + "Tiene una potencia de: " + locomotora.getPotenciaMotor() + "cv");
        if (m != null) {
            System.out.println("======= INFORMACIÓN DEL MECANICO =======" + "\n" + "El nombre es: " + m.getNombre() + "\n" + "El telefono es: " + m.getTelefono() +  "\n" + "La especialidad es: " + m.getEspecialidad());
        } else{
            System.out.println("No tiene mecanico asignado.");
        }
    }

    public static void mostrarInfoTren(Tren t1, Locomotora l, Mecanico m, Maquinista maq){
        if (maq!=null) {
            System.out.println("======= INFORMACIÓN DEL TREN =======" + "\n" + "Cantidad de vagones; " + t1.getCantidadVagones() + "El maquinista es: " + t1.getMaquinistas());
            mostrarInfoLocomotora(l, m);
        }
        
    }


    public static void main(String[] args) {

        JefeDeEstacion jefeEstacion1 = new JefeDeEstacion("Carlos", "02145678V", "21-03-1990");
        // Aqui creo todo lo necesario para tener 1 locomotora en el sistema
        Mecanico m1 = new Mecanico("Jaime", 650213454, "Hidráulica");
        Locomotora locomotora1 = new Locomotora("1234 MSD", 500, "13-11-2022", m1);
        
        //Aqui creo lo necesario para tener 1 tren en el sistema
        Maquinista maq1 = new Maquinista("Pepe", 2000, "Senior");
        Tren t1 = new Tren(locomotora1, 5, maq1);


        mostrarInfoLocomotora(locomotora1, m1);
        mostrarInfoTren(t1, locomotora1, m1, maq1);
    }
}
