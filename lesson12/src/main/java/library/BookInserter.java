package library;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class BookInserter {
    public static void addNewBook(Document document) {

        Book newBook = new Book();
        newBook.setId(5);
        newBook.setTitle("new book Title");
        newBook.setGenre("new book Author");
        newBook.setPages(1000);
        Cover bcover = new Cover();
        bcover.setColor("green");
        bcover.setQuality("soft");
        newBook.setCover(bcover);

        Element book = document.createElement("book");

        Element id = document.createElement("id");
        id.setTextContent(String.valueOf(newBook.getId()));
        Element title = document.createElement("title");
        title.setTextContent(newBook.getTitle());

        Element genre = document.createElement("genre");
        genre.setTextContent(newBook.getGenre());

        Element pages = document.createElement("pages");
        pages.setTextContent(String.valueOf(newBook.getPages()));


        Element cover = document.createElement("cover");

        Element color = document.createElement("color");
        color.setTextContent(newBook.getCover().getColor());

        Element quality = document.createElement("quality");
        quality.setTextContent(newBook.getCover().getQuality());

        // Добавляем внутренние элементы книги в элемент <Book>
        cover.appendChild(color);
        cover.appendChild(quality);
        book.appendChild(id);
        book.appendChild(title);
        book.appendChild(genre);
        book.appendChild(pages);
        book.appendChild(cover);

        Node root = document.getDocumentElement();
        // Добавляем книгу в корневой элемент
        root.appendChild(book);

        // Записываем XML в файл
        writeDocument(document);
    }

    private static void writeDocument(Document document) throws TransformerFactoryConfigurationError {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer tr = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            FileOutputStream fos = new FileOutputStream("otherBooks.xml");
            StreamResult result = new StreamResult(fos);
            tr.transform(source, result);
        } catch (TransformerException | IOException e) {
            e.printStackTrace(System.out);
        }
    }
}