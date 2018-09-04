package dao.interDao;

import dao.exception.DaoException;
import entity.Status;

import java.util.List;

/**
 * Created by admin on 03.09.2018.
 */
public interface StatusDAO {

    List<Status> findAll() throws DaoException;
    Status findById(int id) throws DaoException;
    Status findByName(String name) throws DaoException;
}
