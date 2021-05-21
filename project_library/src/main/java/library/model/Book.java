package library.model;

import library.model.Author;
import library.model.Genre;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book {
    private long id;
    private String title;
    private Author author;
    private Genre genre;
    private String isbn;

    public Book(String title, Author author, Genre genre, String isbn) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "id: " + id +
                "\nTitle: '" + title + '\'' +
                "\nAuthor: " + author +
                "\nGenre: " + genre +
                "\nISBN: '" + isbn + '\'';
    }
}
