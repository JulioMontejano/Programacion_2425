package proyecto.java.pkg5_unidad7.actividad10.maquinaria;

import proyecto.java.pkg5_unidad7.actividad10.personal.Mecanico;


public class Locomotora {
    private String matricula;
    private int potenciaMotor;
    private String añoFabricacion;
    private Mecanico m;

    Locomotora(String matricula, int potenciaMotor, String añoFabricacion) {
        this.matricula = matricula;
        this.potenciaMotor = potenciaMotor;
        this.añoFabricacion = añoFabricacion;

    }

    public Locomotora(String matricula, int potenciaMotor, String añoFabricacion, Mecanico m){
        this(matricula, potenciaMotor, añoFabricacion);
        this.m=m;
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
