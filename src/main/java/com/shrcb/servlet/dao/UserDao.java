package com.shrcb.servlet.dao;

import com.shrcb.servlet.entity.User;

import java.util.List;

/**
 * @author helen
 */
public interface UserDao {
    public List<User> queryUser();

}
