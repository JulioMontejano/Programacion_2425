package proyecto.java.pkg5_unidad7.actividad10.personal;

public class Mecanico {
    private String nombre;
    private int telefono;
    private String especialidad;

    

    public Mecanico(String nombre, int telefono, String especialidad){
        this.telefono=telefono;
        this.especialidad=especialidad;
        this.nombre=nombre;
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
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }


}
