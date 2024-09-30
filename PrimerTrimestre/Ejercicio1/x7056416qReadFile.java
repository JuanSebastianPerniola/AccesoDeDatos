package PrimerTrimestre.Ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class x7056416qReadFile {
  public void readFileText(String file) {
    try {
      File myObj = new File(file);
      Scanner sc = new Scanner(myObj);
      while (sc.hasNextLine()) {
        String data = sc.nextLine();
        System.out.println(data);
      }
      sc.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
