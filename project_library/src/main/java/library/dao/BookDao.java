package library.dao;


import library.model.Book;

import java.sql.SQLException;

public interface BookDao {

    void insertBook(Book book) throws SQLException;

    int updateBook(Book book) throws SQLException;

    int removeBookFromDB(long id) throws SQLException;

    Book getBookByTitleAndAuthor(String title, String authorName) throws SQLException;

    Book getBookById(long id) throws SQLException;

    String getTitleFromDB(String title) throws SQLException;

    boolean chekTableBookIsEmpty() throws SQLException;
}
