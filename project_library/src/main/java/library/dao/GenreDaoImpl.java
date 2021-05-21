package library.dao;

import library.model.Book;
import library.util.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GenreDaoImpl implements GenreDao {
    DBUtils dbUtils = new DBUtils();

    @Override
    public void insertGenre(Book book) throws SQLException {
        Connection connection = dbUtils.getConnection();
        long idByGenreName = getIdByGenreName(book.getGenre().getName());
        PreparedStatement ps = connection.prepareStatement("insert ignore genre (name) values (?)");
        if (idByGenreName == 0) {
            ps.setString(1, book.getGenre().getName());
            ps.executeUpdate();
        }

    }

    @Override
    public long getIdByGenreName(String genreName) throws SQLException {
        Connection connection = dbUtils.getConnection();
        PreparedStatement ps = connection.prepareStatement("select id from genre where name=?");
        ps.setString(1, genreName);
        ResultSet rs = ps.executeQuery();
        long resultId = 0;
        if (rs.next()) {
            resultId = rs.getLong("id");
        }
        dbUtils.closeConnection(connection);
        return resultId;
    }
}
