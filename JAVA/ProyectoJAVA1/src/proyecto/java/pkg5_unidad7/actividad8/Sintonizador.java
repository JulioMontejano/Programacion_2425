package proyecto.java.pkg5_unidad7.actividad8;
/**
 * @author Julio Montejano Segovia
 */

public class Sintonizador {
    private double frecuencia;
    private final double VARIACION=0.5;

    Sintonizador(double frecuencia){
        this.frecuencia=frecuencia;
    }

    Sintonizador(){
        this.frecuencia=0;
    }

    public double getFrecuencia() {
        return frecuencia;
    }
    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }


    void upFrecuencia(int saltos){
        if (frecuencia+saltos*VARIACION>=108) {
            setFrecuencia(0.0);
        } else{
            setFrecuencia(saltos*frecuencia+VARIACION);
        }
        System.out.println("la frecuencia subiendo es: " + getFrecuencia());
    }

    void downFrecuencia(int saltos){
        if (saltos*VARIACION-frecuencia<=80) {
            setFrecuencia(0.0);
        }else{
            setFrecuencia(saltos*VARIACION-frecuencia);
        }
        System.out.println("la frecuencia bajandoS es: " + getFrecuencia());
    }

    void display(){
        System.out.println("La fecuencia original es: " + this.frecuencia + "el incremento es: " + VARIACION + "\\n-------------n\\" + getFrecuencia());
    }

}


