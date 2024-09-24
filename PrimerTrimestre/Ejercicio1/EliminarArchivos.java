package PrimerTrimestre.Ejercicio1;

import java.io.File;

public class EliminarArchivos {
        public static boolean EliminarArhivo(String path) {
    try {
      File file = new File(path);
      file.delete();

      if(file.delete())
      {
        System.out.println("Archivo eliminado");
        return true;
      } 
      else
      {
        System.out.println("Archivo no eliminado");
        return false;
      }
    } catch (Exception ex) {
      System.out.println("Archivo ya a sido eliminado" + ex);
    }
    return false;
  }
}
