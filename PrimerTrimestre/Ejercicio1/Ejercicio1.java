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
    LeerArchivo leerArchivo = new LeerArchivo();
    leerArchivo.LeerArchivo(path);

    QuitarPermisos quitarPermisos = new QuitarPermisos();
    quitarPermisos.QuitaPermisos(path);

    EliminarArchivos eliminarArchivos = new EliminarArchivos();
    eliminarArchivos.EliminarArhivo(path);
  }
}