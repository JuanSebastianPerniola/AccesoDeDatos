package PrimerTrimestre.Ejercicio1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerArchivo {
    public static void LeerArchivo(String path) {
        String st;
        try {
          File file = new File(path);
          BufferedReader br = new BufferedReader(new FileReader(path));
          while ((st = br.readLine()) != null) {
            System.out.println(st);
          }
          br.close();
        } catch (Exception e) {
          System.out.println("No se puede leer el archivo" + e);
        }
      }
}

