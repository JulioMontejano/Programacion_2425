package proyecto.java.pkg5_unidad7.actividad6;
package 
public class Hora {
    byte hora;
    byte minuto;
    byte segundo;
    int n;

    Hora(byte hora, byte minuto, byte segundo, int n){
        this.hora=hora;
        this.minuto=minuto;
        this.segundo=segundo;
        this.n=n;
    }

    public byte getHora(){
        return hora;
    }

    public void setHora(byte hora){
        this.hora=hora;
    }

    public byte getMinuto(){
        return hora;
    }

    public void setMinuto(byte minuto){
        this.minuto=minuto;
    }
    
    public byte getSegundo(){
        return segundo;
    }

    public void setSegundo(byte segundo){
        this.segundo=segundo;
    }

    public int getN(){
         return n;
    }

    public void setN(int n){
        this.n=n;
    }
}