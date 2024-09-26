package PrimerTrimestre.Ejercicio1;

import java.io.File;
import java.io.FileInputStream;

public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            // Crear objeto File con la ruta del archivo
            FileInputStream readTxt = new FileInputStream(new File("C:\\Users\\JuanPrograma\\OneDrive\\Desktop\\AccesoDeDatos\\PrimerTrimestre\\Ejercicio1\\Archivo1.txt"));
            // FileInputStream readJpg = new FileInputStream(new File("ejemplo1.jpg"));
            // Obtener la extensión del archivo
            String extension = readTxt.toString().substring(readTxt.toString().lastIndexOf(".") + 1);

            // Verificar si el archivo es una imagen JPG
            if (extension.equalsIgnoreCase("jpg")) {
                try {
                    FileReaderBinary fileReaderBinary = new FileReaderBinary();
                    // FileInputStream readJpg = new FileInputStream(file);
                    // fileReaderBinary.File(readJpg);
                } catch (Exception e) {
                    System.out.println("Something went wrong " + e);
                }
            } else if (extension.equalsIgnoreCase("txt")) {
                // Si es un archivo de texto, llamamos al FileReader para leer texto
                FileReader fileReader = new FileReader();
                fileReader.readFile(readTxt);  // Pasamos la ruta del archivo
            } else {
                System.out.println("Tipo de archivo no soportado.");
            }
        } catch (Exception e) {
            System.out.println("Algo a ido mal " + e);
        }
    }
}
