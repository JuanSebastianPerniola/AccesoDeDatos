package PrimerTrimestre.Ejercicio1;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReader {
    public void readFile(FileInputStream readTxt) {
        try {
            int content;
            System.out.println("Contenido del archivo:");

            // Leer el archivo byte por byte y convertirlo en caracteres
            while ((content = readTxt.read()) != -1) {
                System.out.print((char) content);
                readTxt.close();
            }
            //crear un archico nuevo con el mismo contenido
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
