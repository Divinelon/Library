package dao.interDao;

import dao.exception.DaoException;
import entity.Author;

import java.util.List;

/**
 * Created by admin on 03.09.2018.
 */
public interface AuthorDAO {

    //create
    void create(Author author) throws DaoException;
    //update
    void update(Author author) throws DaoException;
    //delete
    void delete(int id) throws DaoException;

    Author findByName(String name) throws DaoException;
    Author findById(int id) throws DaoException;
    //Like a read
    List<Author> findAll() throws DaoException;
    List<Author> searchByName(String name) throws DaoException;

}
