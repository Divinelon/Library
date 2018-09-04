package dao.interDao;

import dao.exception.DaoException;
import entity.User;

import java.util.List;

/**
 * Created by admin on 03.09.2018.
 */
public interface UserDAO {
    //create
    void create(User user) throws DaoException;
    //udpate
    void update(User user) throws DaoException;
    //delete
    void delete(int id) throws DaoException;

    List<User> findAll() throws DaoException;
    User findById(int id) throws DaoException;
    User findByFirstNameAndByLastName(String firstName, String lastName) throws DaoException;
    User findByEmail(String email) throws DaoException;


}
