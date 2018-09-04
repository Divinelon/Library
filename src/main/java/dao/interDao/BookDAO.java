package dao.interDao;

import dao.exception.DaoException;
import entity.Book;

import java.util.List;

/**
 * Created by admin on 03.09.2018.
 */
public interface BookDAO {
    //create
    void create(Book book) throws DaoException;
    //update
    void update(Book book) throws DaoException;
    //delete
    void delete(int id) throws DaoException;

    Book findById(int id) throws DaoException;
    List<Book> findAll() throws DaoException;
    List<Book> findByName(String name) throws DaoException;
    List<Book> findByGenre(int genreId) throws DaoException;
    List<Book> findByAuthor(int authorId) throws DaoException;
    List<Book> searchByKeyWords(String name) throws DaoException;
}
