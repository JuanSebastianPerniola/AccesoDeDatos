package PrimerTrimestre.Ejercicio1;

import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploFileOutputStream {
    public static void main(String[] args) {
        String data = "Texto de ejemplo";

        try (FileOutputStream fos = new FileOutputStream("salida.txt")) {
            // Escribir  los bytes del archivo
            fos.write(data.getBytes());
            System.out.println("Datos escritos al archivo");

        } catch (IOException e) {
           System.out.println("Error al escribir en el archivo");
        }
    }
}

