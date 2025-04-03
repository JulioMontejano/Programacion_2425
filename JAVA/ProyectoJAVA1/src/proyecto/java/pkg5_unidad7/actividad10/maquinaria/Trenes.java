package proyecto.java.pkg5_unidad7.actividad10.maquinaria;

import proyecto.java.pkg5_unidad7.actividad10.personal.Maquinistas;

public class Trenes {
    Locomotoras locomotoras =new Locomotoras(null, 0, null, null);
    Vagones vagones = new Vagones(0, 0, 0);
    Maquinistas maquinistas = new Maquinistas();

    Trenes(Locomotoras l, Vagones v, Maquinistas m) {
        this.locomotoras=l;
        this.vagones=v;
        this.maquinistas=m;
    }

    
    public Locomotoras getLocomotoras() {
        return locomotoras;
    }


    public void setLocomotoras(Locomotoras locomotoras) {
        this.locomotoras = locomotoras;
    }


    public Vagones getVagones() {
        return vagones;
    }


    public void setVagones( Vagones vagones) {
        this.vagones = vagones;
    }


    public Maquinistas getMaquinistas() {
        return maquinistas;
    }


    public void setMaquinistas(Maquinistas maquinistas) {
        this.maquinistas = maquinistas;
    }

    public void vagonesMax(Vagones v){
        if (v.getCantidadVagones()>=5) {
            System.out.println("No se puede tener mas de 5 vagones");
            v.setCantidadVagones(5);
        } else{
            System.out.println("Cantidad de vagones aceptada");
        }
    }
}
