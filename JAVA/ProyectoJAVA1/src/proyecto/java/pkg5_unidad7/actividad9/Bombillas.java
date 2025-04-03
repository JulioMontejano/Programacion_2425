package proyecto.java.pkg5_unidad7.actividad9;
import java.util.Scanner;

public class Bombillas {
    //atributos de clase
    private boolean encendida;
    private int numBombillas=(int) (Math.random()*500+1);

    //setters y getters
    boolean getEncendida() {
        return encendida;
    }

    void setEncemdida(boolean encendida){
        this.encendida=encendida;
    }

    int getNumBombillas(){
        return numBombillas;
    }

    //metodos de la clase
    boolean estado(boolean encendida){
        @SuppressWarnings("resource")
        Scanner leer=new Scanner(System.in);
        boolean interruptor = false;
        
        System.out.println("¿Quieres apagar o encender la bombilla?; Si-> s, No-> n");
        String eleccion=leer.next();
        String letras=eleccion.toLowerCase();
        if (letras.equals("s")) {
            interruptor=true;
        }else if (letras.equals("n")) {
            interruptor=false;
        } else{
            System.out.println("Parámetro no comprendido");
        }
        return interruptor;
    }
}
