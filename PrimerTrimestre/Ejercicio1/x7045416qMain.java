package PrimerTrimestre.Ejercicio1;

import java.io.*;
import java.util.Scanner;

public class x7045416qMain {
    public static void main(String[] args) {
        try {
            // Crear objeto File con la ruta del archivo
            File readTxt = new File(
                    "C:/Users/JuanPrograma/OneDrive/Desktop/AccesoDeDatos/PrimerTrimestre/Ejercicio1/Archivo1.txt");
            File readJPG = new File(
                    "C:/Users/JuanPrograma/OneDrive/Desktop/AccesoDeDatos/PrimerTrimestre/Ejercicio1/ejemplosPNG.jpg");

            // Instanciar FileInputStream correctamente
            FileInputStream readJPGbinary = new FileInputStream(readJPG);
            Scanner lectorDeTextoPorConsola = new Scanner(System.in);
            //enchufar lo que me da resultado el sout para abrir el jpg
            // Obtener la extensión del archivo jpg
            String extension = readJPG.getName().substring(readJPG.getName().lastIndexOf(".") + 1);

            // Verificar si el archivo es una imagen JPG
            if (extension.equalsIgnoreCase("jpg")) {
                try {
                    x7045416qFileReaderBinary fileReaderBinary = new x7045416qFileReaderBinary();
                    fileReaderBinary.FileReaderBinary(readJPGbinary);
                } catch (Exception e) {
                    System.out.println("Something went wrong: " + e);
                }
            } else if (extension.equalsIgnoreCase("txt")) {
                // Leer archivos de texto
                try {
                    x7045416qFileReader fileReader = new x7045416qFileReader();
                    fileReader.FileReader(readTxt);

                } catch (Exception e) {
                    System.out.println("Algo ha salido mal : " + e);
                }
                x7045416qRevokePermission revokePermission = new x7045416qRevokePermission();
                revokePermission.revokePermission(readTxt);
                try {
                    lectorDeTextoPorConsola = new Scanner(readTxt); // Reiniciar el escáner
                    while (lectorDeTextoPorConsola.hasNextLine()) {
                        String data = lectorDeTextoPorConsola.nextLine();
                        System.out.println(data);
                    }
                } catch (Exception e) {
                    System.out.println("Algo ha ido mal: " + e);
                }
            } else {
                System.out.println("El archivo de texto no le han sido revocados los permisos");
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred " + e);
        }
    }
}