package proyecto.java.pkg5_unidad7.actividad10.personal;

public class Maquinista{
    private String nombre;
    private double sueldo;
    private String rango;

    
    Maquinista(String nombre, double sueldo, String rango) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.rango = rango;
    }

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public String getRango() {
        return rango;
    }
    public void setRango(String rango) {
        this.rango = rango;
    }

    
}