package dao.implDao;

import dao.exception.DaoException;
import dao.implDao.ConnectionManager.ConnectionManager;
import dao.interDao.AuthorDAO;
import entity.Author;

import java.util.List;

/**
 * Created by admin on 04.09.2018.
 */
public class UserDAOImpl extends ConnectionManager implements AuthorDAO {
    @Override
    public void create(Author author) throws DaoException {

    }

    @Override
    public void update(Author author) throws DaoException {

    }

    @Override
    public void delete(int id) throws DaoException {

    }

    @Override
    public Author findByName(String name) throws DaoException {
        return null;
    }

    @Override
    public Author findById(int id) throws DaoException {
        return null;
    }

    @Override
    public List<Author> findAll() throws DaoException {
        return null;
    }

    @Override
    public List<Author> searchByName(String name) throws DaoException {
        return null;
    }
}
