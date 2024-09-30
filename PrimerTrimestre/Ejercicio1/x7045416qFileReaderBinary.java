package PrimerTrimestre.Ejercicio1;

import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;

public class x7045416qFileReaderBinary {
    public void FileReaderBinary(FileInputStream path) {
        FileInputStream readJPGbinary = path;
        try  {
            File tempFile = File.createTempFile("ejemploPNG", ".jpg");
            try (FileOutputStream fos = new FileOutputStream(tempFile)) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = readJPGbinary.read(buffer)) != -1) {
                    fos.write(buffer, 0, bytesRead);
                }
            }
            Runtime.getRuntime().exec("mspaint " + tempFile.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
