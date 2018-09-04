package dao.interDao;

import dao.exception.DaoException;
import entity.Genre;

import java.util.List;

/**
 * Created by admin on 03.09.2018.
 */
public interface GenreDAO {
    //create
    void create(Genre genre) throws DaoException;
    //update
    void update(Genre genre) throws DaoException;
    //delete
    void delete(int id) throws DaoException;

    Genre findById(int id) throws DaoException;
    Genre findByName(String name) throws DaoException;
    List<Genre> findAll() throws DaoException;
    List<Genre> searchByName(String name) throws DaoException;

}
