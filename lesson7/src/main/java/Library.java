import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Library {
    Scanner scanner = new Scanner(System.in);
    private Map<Integer, Book> books = new LinkedHashMap<>();

    public void addBook(Book book) {
            books.putIfAbsent(book.getId(), book);
    }

    public Map<Integer, Book> getAllBooks() {
        return books;
    }

    public List<Book> getNewToOldBooks() {
        List<Book> oldToNewBookList = new ArrayList<>(books.values());
        Collections.reverse(oldToNewBookList);
        return oldToNewBookList;
    }

    public List<Book> getZToABooks() {
        List<Book> aToZBookList = new ArrayList<>(books.values());
        aToZBookList.sort((b1, b2) -> b2.getTitle().compareTo(b1.getTitle()));
        return aToZBookList;
    }

    public List<Book> getAToZBooks() {
        List<Book> zToABookList = new ArrayList<>(books.values());
        zToABookList.sort(Comparator.comparing(Book::getTitle));
        return zToABookList;
    }

    public void removeBook(int id) {
        if (books.containsKey(id)) {
            books.remove(id);
            System.out.println("Books with id=" + id + " has been removed successfully");
        } else {
            System.out.println("There are no books with id=" + id);
        }
    }

    public void editBook(int id, String newTitle, String newGenreName) {
        books.get(id).setTitle(newTitle);
        books.get(id).setGenreId(new Genre(newGenreName));
        System.out.println("Book id=" + id + " has been edited");
    }

    public boolean hasBookInLibrary(int id) {
        return books.containsKey(id);
    }

}
