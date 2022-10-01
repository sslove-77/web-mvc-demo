package com.shrcb.servlet.service;

import com.shrcb.servlet.dao.UserDao;
import com.shrcb.servlet.dao.UserDaoImp;
import com.shrcb.servlet.entity.User;

import java.util.List;

/**
 * @author helen
 */
public class UserServiceImp implements UserService{

    private UserDao userDao = new UserDaoImp();

    public List<User> getUser() {
        List<User> users = userDao.queryUser();
        //处理用户集合

        return users;
    }

    public List<User> addUserAge() {
        List<User> users = userDao.queryUser();
        return null;
    }
}
