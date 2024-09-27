package PrimerTrimestre.Ejercicio1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashSet;
import java.util.Set;

public class RevokePermission {
    //version 1 of revoking permission
    //i have "think" in this way
    // de other way it would be like this 
    public boolean checkReaded;

    public void revokePermission(String filePath) {
        try {
            Path path = Paths.get(filePath);
            Set<PosixFilePermission> perms = new HashSet<>();
            perms.add(PosixFilePermission.OWNER_READ); 
            perms.add(PosixFilePermission.OWNER_WRITE);

            Files.setPosixFilePermissions(path, perms);

        } catch (IOException e) {
            System.out.println("Error al revocar permisos: " + e.getMessage());
        }
    }
    public void revokePermissionBoolean(File file) {
        try {
            //if have been read changed parameters
            file.setReadable(false);
            checkReaded = true;
        } catch (Exception e) {
            System.out.println("Error al revocar permisos: " + e.getMessage());
        }
    }
}
