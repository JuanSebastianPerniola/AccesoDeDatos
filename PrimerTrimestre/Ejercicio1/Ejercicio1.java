package PrimerTrimestre.Ejercicio1;

import java.io.File;
import java.io.FileInputStream;

public class Ejercicio1 {
  public static void main(String[] args) {
    try {
      FileInputStream readTxt = new FileInputStream(new File("C:\\Users\\JuanPrograma\\OneDrive\\Desktop\\AccesoDeDatos\\PrimerTrimestre\\Ejercicio1\\Archivo1.txt"));
      // FileInputStream readJpg = new FileInputStream(new File("ejemplo1.jpg"));
      String extension = readTxt.toString().substring(readTxt.toString().lastIndexOf(".") + 1);

      if (extension.equalsIgnoreCase("jpg")) {
        try {
          FileReaderBinary fileReaderBinary = new FileReaderBinary();
          // fileReaderBinary.File(readJpg);
        } catch (Exception e) {
          System.out.println("Something went wrong " + e);
        }
      } else {
        // en este else se podria mirar de que tipo de archivo se trata con un if else
        // pero por la tarea
        // asignada se que solo vendran dos tipos de archivos
        FileReader fileReader = new FileReader();
        fileReader.File(readTxt);
      }
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("Algo a ido mal " + e);
    }

  }
}