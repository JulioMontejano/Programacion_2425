package proyecto.java.pkg5_unidad7.actividad10.maquinaria;

import proyecto.java.pkg5_unidad7.actividad10.personal.Mecanicos;


public class Locomotoras {
    private String matricula;
    private int potenciaMotor;
    private String añoFabricacion;
    private Mecanicos m;

    Locomotoras(String matricula, int potenciaMotor, String añoFabricacion) {
        this.matricula = matricula;
        this.potenciaMotor = potenciaMotor;
        this.añoFabricacion = añoFabricacion;

    }

    Locomotoras(String matricula, int potenciaMotor, String añoFabricacion, String Nombre, String especialidad, int telefono){
        this(matricula, potenciaMotor, añoFabricacion);
        m.setEspecialidad(especialidad);
        m.setNombre(Nombre);
        m.setTelefono(telefono);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public String getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(String añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

}
