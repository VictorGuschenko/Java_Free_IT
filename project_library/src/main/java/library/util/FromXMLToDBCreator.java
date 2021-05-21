package library.util;

import library.dao.BookDao;
import library.dao.BookDaoImpl;
import library.model.Book;

import java.sql.SQLException;
import java.util.List;

public class FromXMLToDBCreator {
    public void addBooksFromXML() {
        BookDao bookDao = new BookDaoImpl();
        boolean isEmpty;
        try {
            isEmpty = bookDao.chekTableBookIsEmpty();
            if (isEmpty) {
                new XSDValidator().validate();
                new SAXParserUtils().parse();
                List<Book> list = SAXParserUtils.books;
                for (Book book : list) {

                    new BookDaoImpl().insertBook(book);
                }
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}