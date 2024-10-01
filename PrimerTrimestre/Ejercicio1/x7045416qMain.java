package PrimerTrimestre.Ejercicio1;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class x7045416qMain {

    public static void main(String[] args) {
        x7045416qMain mainApp = new x7045416qMain();
        mainApp.loadProperties();
        mainApp.processFiles();
    }

    private void loadProperties() {
        Properties properties = new Properties();
        try {
            FileInputStream input = new FileInputStream("config.properties");
            properties.load(input);
        } catch (IOException e) {
            System.out.println("Error al cargar el archivo de propiedades: " + e);
        }
    }

    public void processFiles() {
        try{
        File readTxt = new File("C:/Users/JuanPrograma/OneDrive/Desktop/AccesoDeDatos/PrimerTrimestre/Ejercicio1/Archivo1.txt");

        File readJPG = new File("C:/Users/JuanPrograma/OneDrive/Desktop/AccesoDeDatos/PrimerTrimestre/Ejercicio1/ejemplosPNG.jpg");

        File file = new File("C:/Users/JuanPrograma/OneDrive/Desktop/AccesoDeDatos/PrimerTrimestre/Ejercicio1/ejemplosPNG.jpg");

        FileInputStream readJPGBinary = new FileInputStream(file);



        Scanner lectorDeTextoPorConsola = new Scanner(System.in);



        // Leer el archivo JPG o TXT según la extensión

        String extension = getFileExtension(readTxt);

        if (extension.equalsIgnoreCase("jpg")) {

            leerArchivoBytes(readJPG);

        } else if (extension.equalsIgnoreCase("txt")) {

            leerArchivo(readTxt);

            RevokePermissions(readTxt);

            LeerOtraVezArchivoSinPermisos(readTxt);

            CrearArchivo();

            LeerArchivoBytes(readJPGBinary);

            CambiarArchivosPermisision(readTxt);

            LeerArchivoSinPermisos(readTxt);

        } else {

            System.out.println("El archivo de texto no le han sido revocados los permisos");

        }

    } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String getFileExtension(File file) {
        return file.getName().substring(file.getName().lastIndexOf(".") + 1);
    }

    public void leerArchivo(File readTxt) {
        try {
            x7045416qFileReader fileReader = new x7045416qFileReader();
            fileReader.FileReader(readTxt);
        } catch (Exception e) {
            System.out.println("Algo ha salido mal: " + e);
        }
    }
    public void leerArchivoBytes(File readJPG) {
        try (FileInputStream readJPGbinary = new FileInputStream(readJPG)) {

            X7056416QFileReaderBinary fileReaderBinary = new X7056416QFileReaderBinary();
            fileReaderBinary.FileReaderBinary(readJPGbinary);

        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        }
    }

    public void RevokePermissions(File readTxt){
        try {
            X7056416QRevokePermissions revokePermission = new X7056416QRevokePermissions();
            revokePermission.revokePermission(readTxt);
        } catch (Exception e) {
            System.out.println("Error revocando permisos: " + e);
        }
    }

    public void LeerOtraVezArchivoSinPermisos(File readTxt) {
        try (Scanner lectorDeTextoPorConsola = new Scanner(readTxt)) {
            while (lectorDeTextoPorConsola.hasNextLine()) {
                String data = lectorDeTextoPorConsola.nextLine();
                System.out.println(data);
            }
        } catch (Exception e) {
            System.out.println("Algo ha ido mal: " + e);
        }
    }

    public void CrearArchivo(){
        String newFilePath = "C:/Users/JuanPrograma/OneDrive/Desktop/AccesoDeDatos/PrimerTrimestre/Ejercicio1/"; //localizacion donde crear nuevo archivo
        String newFileName = "ArchivoAcrear"; //localizacion donde crear nuevo archivo

        try {
            X7056416QCreateFile tal = new X7056416QCreateFile(newFilePath,newFileName);
        } catch (Exception e) {
            System.out.println("Algo ha ido mal: " + e);
        }
    }

    public void LeerArchivoBytes(FileInputStream inputStream) throws FileNotFoundException{
        try {
            X7056416QFileReaderBinary readeerBinary = new X7056416QFileReaderBinary();
            readeerBinary.FileReaderBinary(inputStream);
        } catch (Exception e) {
            System.out.println("Algo ha ido mal: " + e);
        }
    }

    public void CambiarArchivosPermisision(File readTxt) throws FileNotFoundException{
        X7056416QRevokePermissions readeerBinary = new X7056416QRevokePermissions();
        try {
            readeerBinary.revokePermission(readTxt);
        } catch (Exception e) {
            System.out.println("Algo ha ido mal: " + e);
        }

    }

    public void LeerArchivoSinPermisos(File readTxt) throws FileNotFoundException {
        Scanner lectorDeTextoPorConsola = new Scanner(readTxt);
        try  {
            while (lectorDeTextoPorConsola.hasNextLine()) {
                String data = lectorDeTextoPorConsola.nextLine();
                System.out.println(data);
            }
        } catch (Exception e) {
            System.out.println("Algo ha ido mal: " + e);
        }
    }
}
