package PrimerTrimestre.Ejercicio1;

import java.io.*;

public class X7056416QCreateFile {
    public X7056416QCreateFile(File file) {
        try {
            // Verifica si el archivo ya existe
            if (!file.exists()) {
                // Intenta crear el archivo
                if (file.createNewFile()) {
                    System.out.println("Archivo creado y está en esta ubicación: " + file.getAbsolutePath());
                } else {
                    System.out.println("No se pudo crear el archivo.");
                }
            } else {
                System.out.println("Ya existe este archivo: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            throw new RuntimeException("Error al crear el archivo", e);
        }
    }
}