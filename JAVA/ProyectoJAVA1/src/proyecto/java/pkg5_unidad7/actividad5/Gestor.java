package proyecto.java.pkg5_unidad7.actividad5;

public class Gestor {
    public String nombre;
    private int telefono;
    int importeMax;

    Gestor(String nombre, int telefono, int importe){
        this.nombre=nombre;
        this.telefono=telefono;
        this.importeMax=importeMax;
    }

    Gestor(String nombre, byte telefono){
        this.nombre=nombre;
        this.telefono=telefono;
        this.importeMax=10000;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTelefono() {
        return telefono;
    }
    public int getImporteMax() {
        return importeMax;
    }
    public void setImporteMax(int importeMax) {
        this.importeMax = importeMax;
    }    

}