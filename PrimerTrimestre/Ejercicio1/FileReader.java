package PrimerTrimestre.Ejercicio1;
import java.io.File;

public class FileReader {
    public static void main(String[] args) {
        // Crear un objeto File
        File archivo = new File("ejemplo.txt");
        
        // Verificar si el archivo existe
        if (archivo.exists()) {
            System.out.println("El archivo existe");
        } else {
            System.out.println("El archivo no existe");
        }
        
        // Imprimir la ruta del archivo
        System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
    }
}
