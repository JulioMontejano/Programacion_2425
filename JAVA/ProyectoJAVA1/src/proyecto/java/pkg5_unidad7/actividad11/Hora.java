package proyecto.java.pkg5_unidad7.actividad11;

public class Hora {
    protected int hora;
    protected int minutos;

    public Hora(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    void inc() {
        if (minutos == 59) {
            minutos = 0;
            if (hora == 23) {
                hora = 0;
            } else {
                hora++;
            }
        } else {
            minutos++;
        }
    }

    boolean validarSetMinutos(int minutos) {
        if (minutos >= 0 && minutos < 60) {
            this.minutos = minutos;
            return true;
        } else {
            return false;
        }
    }

    boolean validarSetHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String toString() {
        return String.format("%02d:%02d", hora, minutos);
    }
}
