package PrimerTrimestre.Ejercicio1;

import java.io.*;
import java.nio.Buffer;
import java.nio.BufferUnderflowException;
import java.nio.file.Files;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashSet;
import java.util.Set;

public class Ejercicio1 {
  // java.io
  // Crear una clase por biblioteca vista en clase
  // reader ara binarios o si es caracters
  // Permisos para leer
  // dsp remover permisos para leer el archivo y
  // you cannot read this file
  public static void main(String[] args) {
    String path = "Users/JuanPrograma/OneDrive/Desktop/AccesoDeDatos/PrimerTrimestre/Ejercicio1";

    // una clase por cada contenido visto en clase
    // mirar classroom
    EjemploFile ejemploFile = new EjemploFile();
    ejemploFile.File(path);
    EjemploFileOutputStream ejemploFileOutputStream = new EjemploFileOutputStream();
    LeerArchivo leerArchivo = new LeerArchivo();
    FileOutPutStream fileOutPutStream = new FileOutPutStream();
    EjemploFileWriter ejemploFileWriter = new EjemploFileWriter();

  }
}