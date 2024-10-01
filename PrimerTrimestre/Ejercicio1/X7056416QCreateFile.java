package PrimerTrimestre.Ejercicio1;

import java.io.*;

public class X7056416QCreateFile {
    public X7056416QCreateFile(String directoryPath, String fileName) {
        try {
            File directory = new File(directoryPath);
            if (!directory.exists()) {
                if (directory.mkdirs()) {
                    System.out.println("Directorio creado en: " + directoryPath);
                } else {
                    System.out.println("No se pudo crear el directorio.");
                    return;
                }
            }

            File file = new File(directoryPath, fileName);
            if (!file.exists()) {
                if (file.createNewFile()) {
                    System.out.println("Archivo creado en: " + file.getAbsolutePath());
                } else {
                    System.out.println("No se pudo crear el archivo.");
                }
            } else {
                System.out.println("El archivo ya existe: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }
}
