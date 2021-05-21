package library.dao;

import library.model.Author;
import library.model.Book;
import library.model.Genre;
import library.util.DBUtils;

import java.sql.*;

public class BookDaoImpl implements BookDao {

    DBUtils dbUtils = new DBUtils();

    @Override
    public void insertBook(Book book) throws SQLException {
        AuthorDao authorDao = new AuthorDaoImpl();
        GenreDao genreDao = new GenreDaoImpl();
        Connection connection = dbUtils.getConnection();
        PreparedStatement ps;
        authorDao.insertAuthor(book);
        genreDao.insertGenre(book);
        ps = connection.prepareStatement("insert ignore book(title,author_id,genre_id,isbn) values(?,?,?,?)");
        ps.setString(1, book.getTitle());
        ps.setLong(2, authorDao.getIdByAuthorName(book.getAuthor().getName()));
        ps.setLong(3, genreDao.getIdByGenreName(book.getGenre().getName()));
        ps.setString(4, book.getIsbn());
        ps.executeUpdate();
        dbUtils.closeConnection(connection);
    }

    @Override
    public int updateBook(Book book) throws SQLException {
        AuthorDao authorDao = new AuthorDaoImpl();
        GenreDao genreDao = new GenreDaoImpl();
        Connection connection = dbUtils.getConnection();
        authorDao.insertAuthor(book);
        genreDao.insertGenre(book);
        PreparedStatement ps = connection.prepareStatement(
                "UPDATE book set title=?, author_id=?, genre_id=? where id=?");
        ps.setString(1, book.getTitle());
        ps.setLong(2, authorDao.getIdByAuthorName(book.getAuthor().getName()));
        ps.setLong(3, genreDao.getIdByGenreName(book.getGenre().getName()));
        ps.setLong(4, book.getId());
        int updatedRows = ps.executeUpdate();
        dbUtils.closeConnection(connection);
        return updatedRows;
    }

    @Override
    public int removeBookFromDB(long id) throws SQLException {
        int updatedRows;
        Connection connection = dbUtils.getConnection();
        PreparedStatement ps = connection.prepareStatement("DELETE FROM book where id=?");
        ps.setLong(1, id);
        updatedRows = ps.executeUpdate();
        dbUtils.closeConnection(connection);
        return updatedRows;
    }

    @Override
    public Book getBookByTitleAndAuthor(String title, String authorName) throws SQLException {
        String sql = "select b.id, b.title, a.name, g.name, b.isbn from book b " +
                "left join genre g ON b.genre_id=g.id " +
                "left join author a ON b.author_id=a.id";
        Connection connection = dbUtils.getConnection();
        Book book = new Book();
        PreparedStatement ps = connection.prepareStatement(sql + " where title=? and a.name=?");
        ps.setString(1, title);
        ps.setString(2, authorName);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            book.setId(rs.getLong("b.id"));
            book.setTitle(rs.getString("b.title"));
            book.setAuthor(new Author(rs.getString("a.name")));
            book.setGenre(new Genre(rs.getString("g.name")));
            book.setIsbn(rs.getString("b.isbn"));
        }
        dbUtils.closeConnection(connection);
        return book;
    }

    @Override
    public Book getBookById(long id) throws SQLException {
        Book book = new Book();
        String sql = "select b.id, b.title, a.name, g.name, b.isbn from book b " +
                "left join genre g ON b.genre_id=g.id " +
                "left join author a ON b.author_id=a.id";
        Connection connection = dbUtils.getConnection();
        PreparedStatement ps = connection.prepareStatement(sql + " where b.id=?");
        ps.setLong(1, id);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            book.setId(rs.getLong("b.id"));
            book.setTitle(rs.getString("b.title"));
            book.setAuthor(new Author(rs.getString("a.name")));
            book.setGenre(new Genre(rs.getString("g.name")));
            book.setIsbn(rs.getString("b.isbn"));
        }
        dbUtils.closeConnection(connection);
        return book;
    }

    @Override
    public String getTitleFromDB(String title) throws SQLException {
        Connection connection = dbUtils.getConnection();
        String titleFromDB = null;
        PreparedStatement ps = connection.prepareStatement("select title from book where title=?");
        ps.setString(1, title);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            titleFromDB = rs.getString("title");
        }
        dbUtils.closeConnection(connection);
        return titleFromDB;
    }

    @Override
    public boolean chekTableBookIsEmpty() throws SQLException {
        Connection connection = dbUtils.getConnection();
        PreparedStatement ps = connection.prepareStatement("select count(*) from book");
        ResultSet rs = ps.executeQuery();
        int rowAmount = 0;
        while (rs.next()) {
            rowAmount = rs.getInt(1);
        }
        return rowAmount == 0;
    }
}
