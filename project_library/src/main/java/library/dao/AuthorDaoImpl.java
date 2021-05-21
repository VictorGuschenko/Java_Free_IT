package library.dao;

import library.model.Book;
import library.util.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthorDaoImpl implements AuthorDao {
    DBUtils dbUtils = new DBUtils();

    @Override
    public void insertAuthor(Book book) throws SQLException {
        Connection connection = dbUtils.getConnection();
        PreparedStatement ps = connection.prepareStatement("insert ignore author(name) values (?)");
        long idByAuthorName = getIdByAuthorName(book.getAuthor().getName());
        if (idByAuthorName == 0) {
            ps.setString(1, book.getAuthor().getName());
            ps.executeUpdate();
        }
        dbUtils.closeConnection(connection);
    }

    @Override
    public long getIdByAuthorName(String authorName) throws SQLException {
        Connection connection = dbUtils.getConnection();
        PreparedStatement ps = connection.prepareStatement("select id from author where name=?");
        ps.setString(1, authorName);
        ResultSet rs = ps.executeQuery();
        long resultId = 0;
        if (rs.next()) {
            resultId = rs.getLong("id");
        }
        dbUtils.closeConnection(connection);
        return resultId;
    }

    @Override
    public String getAuthorNameFromDB(String authorName) throws SQLException {
        Connection connection = dbUtils.getConnection();
        String authorNameFromDB = null;
        PreparedStatement ps = connection.prepareStatement("select name from author where name=?");
        ps.setString(1, authorName);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            authorNameFromDB = rs.getString("name");
        }
        dbUtils.closeConnection(connection);
        return authorNameFromDB;
    }

}
