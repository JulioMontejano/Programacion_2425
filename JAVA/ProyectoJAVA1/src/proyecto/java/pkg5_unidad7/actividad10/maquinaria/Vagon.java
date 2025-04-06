package proyecto.java.pkg5_unidad7.actividad10.maquinaria;

import java.util.Scanner;

class Vagon {
    private int cantidadVagones;
    private int cargaMax;
    private int cargaActual;

    
    Vagon(int cantidadVagones, int cargaMax, int cargaActual) {
        this.cantidadVagones = cantidadVagones;
        this.cargaMax = cargaMax;
        this.cargaActual = cargaActual;
    }


    public int getCantidadVagones() {
        return cantidadVagones;
    }
    public void setCantidadVagones(int cantidadVagones) {
        this.cantidadVagones = cantidadVagones;
    }
    public int getCargaMax() {
        return cargaMax;
    }
    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }
    public int getCargaActual() {
        return cargaActual;
    }
    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }

}
