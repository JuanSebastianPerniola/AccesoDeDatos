package PrimerTrimestre.Ejercicio2;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import java.io.File;

public class tarea1xml {
        //Mpaaea un documetno nxml a objetos utilizando el dom
    //para leer un documento XML que cuente con infomracion sobre libros y convertirlos en objetos java
public static <Document> void main(String[] args) {

    File file = new File("examples.xml");

    try {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        org.w3c.dom.Document doc = dBuilder.parse(file);
        doc.getDocumentElement().normalize();

        NodeList nList = doc.getElementsByTagName("book");
        for (int i = 0; i < nList.getLength(); i++) {
            Element bookElement = (Element) nList.item(i);
            String title = bookElement.getElementsByTagName("title").item(0).getTextContent();
            String author = bookElement.getElementsByTagName("author").item(0).getTextContent();
            String genre = bookElement.getElementsByTagName("genre").item(0).getTextContent();
            String price = bookElement.getElementsByTagName("price").item(0).getTextContent();
            String pubDate = bookElement.getElementsByTagName("publish_date").item(0).getTextContent();

            // Aquí podrías crear objetos libro con estos datos
            System.out.println("Título: " + title);
            System.out.println("Autor: " + author);
            System.out.println("Género: " + genre);
            System.out.println("Precio: " + price);
            System.out.println("Fecha de publicación: " + pubDate);
            System.out.println();

        }
    }catch(Exception e){
            e.printStackTrace();
        }
    }
}
