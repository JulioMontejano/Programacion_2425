package proyecto.java.pkg5_unidad7.actividad10.personal;

public class JefeDeEstacion {
    private String nombre;
    private String dni;
    private String fechaNombrado;


    public JefeDeEstacion(String nombre, String dni, String fechaNombrado) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNombrado = fechaNombrado;
    }

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getFechaNombrado() {
        return fechaNombrado;
    }
    public void setFechaNombrado(String fechaNombrado) {
        this.fechaNombrado = fechaNombrado;
    }

}
