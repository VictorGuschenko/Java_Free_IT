package library.service;

import library.dao.AuthorDao;
import library.dao.AuthorDaoImpl;
import library.dao.BookDao;
import library.dao.BookDaoImpl;
import library.model.Author;
import library.model.Book;
import library.model.Genre;

import java.sql.SQLException;
import java.util.Objects;

public class BookServiceImpl implements BookService {

    @Override
    public void addBook(String title, String authorName, String genreName, String isbn) {
        BookDao bookDao = new BookDaoImpl();
        AuthorDao authorDao = new AuthorDaoImpl();
        try {
            if (Objects.equals(bookDao.getTitleFromDB(title), title) &&
                    Objects.equals(authorDao.getAuthorNameFromDB(authorName), authorName)) {
                System.out.println("This book already exists");
                System.out.println(bookDao.getBookByTitleAndAuthor(title, authorName));

            } else {
                bookDao.insertBook(new Book(title, new Author(authorName), new Genre(genreName), isbn));
                System.out.println("Book:");
                System.out.println(bookDao.getBookByTitleAndAuthor(title, authorName));
                System.out.println("has been added");
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void fetchBookById(long id) {
        BookDao bookDao = new BookDaoImpl();
        Book book = null;
        try {
            book = bookDao.getBookById(id);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        assert book != null;
        if (book.getTitle() != null) {
            System.out.println(book);
        } else {
            System.out.println("There are no books with id=" + id);
        }
    }

    @Override
    public void removeBookById(long id) {
        BookDao bookDao = new BookDaoImpl();
        int rowsUpdated = 0;
        try {
            rowsUpdated = bookDao.removeBookFromDB(id);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        if (rowsUpdated == 0) {
            System.out.println("There is no such book");
        } else {
            System.out.println("Book id=" + id + " has been removed");
        }
    }

    @Override
    public void editBook(long id, String title, String authorName, String genreName) {
        int rowsUpdated = 0;
        BookDao bookDao = new BookDaoImpl();
        Book book = new Book();
        book.setId(id);
        book.setTitle(title);
        book.setAuthor(new Author(authorName));
        book.setGenre(new Genre(genreName));
        try {
            rowsUpdated = bookDao.updateBook(book);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        if (rowsUpdated == 0) {
            System.out.println("There is no such books with id = " + id);
        } else {
            System.out.println("Book id=" + id + " has been edited successfully");
            fetchBookById(id);
        }
    }
}
