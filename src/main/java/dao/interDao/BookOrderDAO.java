package dao.interDao;

import dao.exception.DaoException;
import entity.BookOrder;

import java.util.List;

/**
 * Created by admin on 03.09.2018.
 */
public interface BookOrderDAO {
    //create
    void create(BookOrder bookOrder) throws DaoException;
    //update
    void update(BookOrder bookOrder) throws DaoException;
    //delete
    void delete(int id) throws DaoException;

    BookOrder findById(int id) throws DaoException;
    List<BookOrder> findAll() throws DaoException;
    List<BookOrder> findByUser(int userId) throws DaoException;
    List<BookOrder> findByBook(int bookId) throws DaoException;
    List<BookOrder> findByStatus(int statusId) throws DaoException;



}
