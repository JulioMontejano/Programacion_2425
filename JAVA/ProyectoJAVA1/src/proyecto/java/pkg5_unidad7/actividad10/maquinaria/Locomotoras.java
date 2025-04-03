package proyecto.java.pkg5_unidad7.actividad10.maquinaria;

import proyecto.java.actividad10.personal.Mecanicos;

public class Locomotoras {
    private String matricula;
    private int potenciaMotor;
    private String añoFabricacion;
    Mecanicos m = new Mecanicos();
    
    Locomotoras(String matricula, int potenciaMotor, String añoFabricacion, Mecanicos m) {
        this.matricula = matricula;
        this.potenciaMotor = potenciaMotor;
        this.añoFabricacion = añoFabricacion;
        this.m = m;
    }
}
