package proyecto.java.pkg5_unidad7.actividad10.maquinaria;

import java.util.Scanner;

import proyecto.java.pkg5_unidad7.actividad10.personal.Maquinista;

public class Tren {
    private Locomotora locomotoras;
    private int cantidadvagones;
    private Maquinista maquinistas;


    
    Tren(Locomotora l, int cantidadvagones, Maquinista m) {
        this.locomotoras=l;
        this.cantidadvagones=cantidadvagones;
        this.maquinistas=m;
    }
    

    public Locomotora getLocomotoras() {
        return locomotoras;
    }



    public void setLocomotoras(Locomotora locomotoras) {
        this.locomotoras = locomotoras;
    }



    public int getCantidadVagones() {
        return cantidadvagones;
    }



    public void setCantidadVagones(int cantidadvagones) {
        this.cantidadvagones = cantidadvagones;
    }



    public Maquinista getMaquinistas() {
        return maquinistas;
    }



    public void setMaquinistas(Maquinista maquinistas) {
        this.maquinistas = maquinistas;
    }

    /*
     * Creo esto aqui por que desde el main no se puede cambiar nada de los vagones por la visibilidad 
    */
    public int vagonesMax(int cantidadVagones){
        Vagon vagones = null;
        Scanner leer=new Scanner(System.in);
        cantidadVagones=leer.nextInt();
        if (cantidadVagones>=5) {
            System.out.println("No se puede tener mas de 5 vagones");
            
        } else{
            System.out.println("Cantidad de vagones aceptada");
            vagones.setCantidadVagones(cantidadVagones);
        }
        return vagones.getCantidadVagones();
    }
}
