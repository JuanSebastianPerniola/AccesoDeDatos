package PrimerTrimestre.Ejercicio1;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            // Crear objeto File con la ruta del archivo
            File readTxt = new File(
                    "C:\\Users\\JuanPrograma\\OneDrive\\Desktop\\AccesoDeDatos\\PrimerTrimestre\\Ejercicio1\\Archivo1.txt");
            Scanner lectorDeTextoPorConsola = new Scanner(readTxt);
            // FileInputStream readJpg = new FileInputStream(new File("ejemplo1.jpg"));

            // Obtener la extensión del archivo
            String extension = readTxt.toString().substring(readTxt.toString().lastIndexOf(".") + 1);

            // Verificar si el archivo es una imagen JPG
            if (extension.equalsIgnoreCase("jpg")) {
                try {
                    FileReaderBinary fileReaderBinary = new FileReaderBinary();
                    // esta comentado por que estoy haciendo pruebas
                    // FileInputStream readJpg = new FileInputStream(file);
                    // fileReaderBinary.File(readJpg);
                } catch (Exception e) {
                    System.out.println("Something went wrong " + e);
                }
            } else if (extension.equalsIgnoreCase("txt")) {
                // leer archivos de texto
                while (lectorDeTextoPorConsola.hasNextLine()) {
                    String data = lectorDeTextoPorConsola.nextLine();
                    System.out.println(data);
                }
                RevokePermission revokePermission = new RevokePermission();
                revokePermission.revokePermissionBoolean(readTxt);

                if (revokePermission.checkReaded == true) {
                    try {
                        while (lectorDeTextoPorConsola.hasNextLine()) {
                            String data = lectorDeTextoPorConsola.nextLine();
                            System.out.println(data);
                        }
                    } catch (Exception e) {
                        System.out.println("Algo a ido mal " + e);
                    }
                } else {
                    System.out.println("EL archivo de texto no le han sido revocados los permisos");
                }

            } else {
                System.out.println("Tipo de archivo no soportado");
            }
        } catch (Exception e) {
            System.out.println("Algo a ido mal " + e);
        }
    }
}
