package proyecto.java.pkg5_unidad7.Cosas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Pattern;

public class Borrar_Elementos {
    public static void main(String[] args) {
        
        String archivoEntrada = "C:\\marcas_moviles\\archivos_sucios\\zte_sucio.txt";
        String archivoSalida = "C:\\marcas_moviles\\archivos_limpios\\zte_limpio.txt";

        // Expresión regular para eliminar etiquetas HTML solo al inicio y final
        String regex = "^\\s*<[^>]+>|<[^>]+>\\s*$";

        // Compilar la expresión regular
        Pattern pattern = Pattern.compile(regex);

        try (BufferedReader br = new BufferedReader(new FileReader(archivoEntrada));
             BufferedWriter bw = new BufferedWriter(new FileWriter(archivoSalida))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                // Limpiar la línea de etiquetas HTML al inicio y final
                String lineaLimpia = pattern.matcher(linea).replaceAll("").strip();
                bw.write(lineaLimpia);
                bw.newLine(); // Escribir en una nueva línea
            }
            br.close();
            bw.close();
            System.out.println("Proceso completado. Archivo limpio generado en: " + archivoSalida);

        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
        }

    }
}

