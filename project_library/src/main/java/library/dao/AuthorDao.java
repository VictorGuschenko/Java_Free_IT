package library.dao;

import library.model.Book;

import java.sql.SQLException;

public interface AuthorDao {

    void insertAuthor(Book book) throws SQLException;

    long getIdByAuthorName(String authorName) throws SQLException;

    String getAuthorNameFromDB(String authorName) throws SQLException;
}
