package PrimerTrimestre.Ejercicio1;

import java.io.FileWriter;
import java.io.IOException;

public class EjemploFileWriter {
    public static void main(String[] args) {
        String data = "Texto de ejemplo";

        try (FileWriter fw = new FileWriter("salida.txt")) {
            // Escribir texto al archivo
            fw.write(data);
            System.out.println("Datos escritos al archivo");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
