package PrimerTrimestre.Ejercicio1;

import java.io.File;

public class X7056416QRevokePermissions {
    public boolean checkReaded;
    public void revokePermission(File filePath) {
        try {
            boolean exists = filePath.exists();
            if (exists == true) {
                System.out.println("Executable: "
                                   + filePath.canExecute());
                System.out.println("Readable: "
                                   + filePath.canRead());
                System.out.println("Writable: "
                                   + filePath.canWrite());
            }
            else {
                System.out.println("File not found.");
            }

        } catch (Exception   e) {
            System.out.println("Error al revocar permisos: " + e.getMessage());
        }
    }
}
