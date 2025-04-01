package proyecto.java.pkg5_unidad7.actividad6;

import java.util.*;
public class horaMain {
    public static void main(String[] args) {
            Scanner leer =new Scanner(System.in);
            byte hora = leer.nextByte();
            setHora(hora);
            byte minuto=leer.nextByte();
            setMinuto(minuto);
            byte segundo=leer.nextByte();
            setSegundo(segundo);
            int n=leer.nextByte();
            setN(n);
        
            byte h = getHora();
            byte m = getMinuto();
            byte s = getSegundo();
            int num = getN();
        
        
        
            if (h<24&h>0&m<60&m>60&s<60&s>60) {
                for (int i = 0; i < n; i++) {
                    s+=i;
                    System.err.println("La hora es: " + h + ":" + m + ":" + s);
                }
            } else{
                System.err.println("La hora no esta bien escrita, revisela.");
            }
    }
}
