package PrimerTrimestre.Ejercicio1;

import java.io.File;

public class EjemploFile {

    public File File(String path) {
        //Creamos archivo
        File archivo = new File("ejemplo.txt");
        try {
            // Check si el archivo existe
            if (archivo.exists()) {
                System.out.println("El archivo existe");
            } else {
                System.out.println("El archivo no existe");
            }
            // Imprimir la ruta del archivo
            System.out.println("Ruta absoluta : " + archivo.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("Algo a ido mal " + e);
        }

        return archivo;
    }
}
