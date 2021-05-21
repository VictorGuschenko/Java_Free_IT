package library.util;

import library.model.Author;
import library.model.Book;
import library.model.Genre;
import lombok.Getter;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.util.ArrayList;
import java.util.List;

public class SAXParserUtils {

    public static final List<Book> books = new ArrayList<>();

    public void parse() {
        final String fileName = "Books.xml";
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            DefaultHandler handler = new DefaultHandler() {
                Book book;
                boolean isbn = false;
                boolean author = false;
                boolean genre = false;
                String currentElement;

                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) {
                    currentElement = qName;

                    if (qName.equals("book")) {
                        book = new Book();
                        book.setTitle(attributes.getValue("title"));
                    }
                    if (qName.equals("author")) {
                        book.setAuthor(new Author());
                        author = true;
                    }
                    if (qName.equals("genre")) {
                        book.setGenre(new Genre());
                        genre = true;
                    }
                    if (qName.equals("isbn")) {
                        isbn = true;
                    }

                }

                @Override
                public void characters(char[] ch, int start, int length) {

                    if (author) {
                        book.getAuthor().setName(new String(ch, start, length));
                        author = false;
                    }
                    if (genre) {
                        book.getGenre().setName(new String(ch, start, length));
                        genre = false;
                    }
                    if (isbn) {
                        book.setIsbn(new String(ch, start, length));
                        isbn = false;
                    }

                }

                @Override
                public void endElement(String uri, String localName, String qName) {
                    if (qName.equals("book")) {
                        books.add(book);
                        book = null;
                    }
                }
            };

            saxParser.parse(fileName, handler);

        } catch (
                Exception e) {
            e.printStackTrace();
        }
    }
}