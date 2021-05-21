package library.dao;

import library.model.Book;

import java.sql.SQLException;

public interface GenreDao {

    void insertGenre(Book book) throws SQLException;

    long getIdByGenreName(String genreName) throws SQLException;

}
