package web.dao;

import org.springframework.stereotype.Repository;

import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.transaction.Transactional;

import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements UserDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> getAllUsers() {
        List<User> allUsers = em
                .createQuery("FROM User", User.class)
                .getResultList();
        return allUsers;
    }
}
