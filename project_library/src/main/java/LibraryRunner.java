import library.user.ApplicationLibrary;
import library.util.FromXMLToDBCreator;

public class LibraryRunner {

    public static void main(String[] args) {

        new FromXMLToDBCreator().addBooksFromXML();
        new ApplicationLibrary().runApp();
    }
}
