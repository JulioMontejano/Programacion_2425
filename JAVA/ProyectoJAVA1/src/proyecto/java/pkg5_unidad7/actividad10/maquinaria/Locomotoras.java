package proyecto.java.pkg5_unidad7.actividad10.maquinaria;

import proyecto.java.pkg5_unidad7.actividad10.personal.Mecanicos;


public class Locomotoras {
    private String matricula;
    private int potenciaMotor;
    private String añoFabricacion;
    
    private Mecanicos m= new Mecanicos("Jorge", 673122334, "Hidráulica");
    
    Locomotoras(String matricula, int potenciaMotor, String añoFabricacion, Mecanicos m) {
        this.matricula = matricula;
        this.potenciaMotor = potenciaMotor;
        this.añoFabricacion = añoFabricacion;
        this.m = m;
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
