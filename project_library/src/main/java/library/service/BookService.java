package library.service;

public interface BookService {

    void addBook(String title, String authorName, String genreName, String isbn);

    void fetchBookById(long id);

    void removeBookById(long id);

    void editBook(long id, String name, String authorName, String genreName);
}

