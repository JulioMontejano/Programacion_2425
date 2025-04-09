package proyecto.java.pkg5_unidad7.actividad11;

public class HoraMain {
    public static void main(String[] args) {
        Hora hora = new Hora(23, 59);
        System.out.println("Hora inicial: " + hora);
        
        hora.inc();
        System.out.println("Hora después de incrementar: " + hora);
        
        hora.setHora(12);
        hora.setMinutos(30);
        System.out.println("Hora después de establecer: " + hora);
        
        HoraExacta horaExacta = new HoraExacta(23, 59, 59);
        System.out.println("Hora exacta inicial: " + horaExacta);
        
        horaExacta.inc();
        System.out.println("Hora exacta después de incrementar: " + horaExacta);
        
        horaExacta.setSegundos(30);
        System.out.println("Hora exacta después de establecer segundos: " + horaExacta);
        
        System.out.println("Comparando horas exactas: " + horaExacta.equals(horaExacta));
    }
}
