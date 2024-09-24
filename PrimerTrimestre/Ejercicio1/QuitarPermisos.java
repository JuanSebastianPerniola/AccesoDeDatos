package PrimerTrimestre.Ejercicio1;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashSet;
import java.util.Set;

public class QuitarPermisos {
 public static void QuitaPermisos(String path) {
    try {
      File file = new File(path);
      // How to set permission in a file
      Set<PosixFilePermission> perms = new HashSet<>();
      perms.add(PosixFilePermission.OWNER_READ);
      perms.add(PosixFilePermission.OWNER_WRITE);
      Files.setPosixFilePermissions(file.toPath(), perms);
    } catch (Exception ex) {
      System.out.println("Archivos han sido rebocados pruebe otro dia" + ex);
    }
  }
}
