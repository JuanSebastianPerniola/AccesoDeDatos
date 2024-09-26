package PrimerTrimestre.Ejercicio1;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReaderBinary {
  void File(FileInputStream path) {
    try {
      int byt;
      while ((byt = path.read()) != -1) {
        System.out.print((char) byt);
      }
      path.close();
    } catch (IOException e) {
      System.out.println("Something went wrong " + e);
    }
  }
}