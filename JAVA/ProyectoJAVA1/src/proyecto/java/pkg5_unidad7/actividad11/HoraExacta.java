package proyecto.java.pkg5_unidad7.actividad11;

public class HoraExacta extends Hora {
    private int segundos;

    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos);
        this.segundos = segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getSegundos() {
        return segundos;
    }

    @Override
    void inc() {
        if (segundos == 59) {
            segundos = 0;
            super.inc();
        } else {
            segundos++;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ":" + String.format("%02d", segundos);
    }

    @Override
    public boolean equals(Object obj) {
        HoraExacta otraHora = (HoraExacta) obj;
        boolean sonIguales;
        if (this.hora == otraHora.hora && this.minutos == otraHora.minutos && this.segundos == otraHora.segundos) {
            sonIguales = true;
        } else {
            sonIguales = false;
        }
        return sonIguales;
    }
}
