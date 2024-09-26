package PrimerTrimestre.Ejercicio1;

import java.io.File;
import java.io.FileInputStream;

public class FileReader {
    public void File(FileInputStream file1) {
        try {
            File archivo = new File("ejemplo.txt");
            // Verificar si el archivo existe
            if (archivo.exists()) {
                System.out.println("El archivo existe");
            } else {
                System.out.println("El archivo no existe");
            }
            System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("Algo a ido mal " + e);
        }
    }
}
