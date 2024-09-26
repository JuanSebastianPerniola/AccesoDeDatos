package PrimerTrimestre.Ejercicio1;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploFileWriter {
    void WriteFile(FileInputStream path) {

        String escrituraFile = "Hola mundo i guess";
        try {
            FileWriter fileWriter = new FileWriter(escrituraFile);  
            System.out.println("Datos escritos al archivo");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Algo a ido mal ");  
        }
    }
}
