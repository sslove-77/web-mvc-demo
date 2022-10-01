package com.shrcb.servlet.service;

import com.shrcb.servlet.entity.User;

import java.util.List;

/**
 * @author helen
 */
public interface UserService {
    /**
     *
     * @return 返回对象集合
     */
    public List<User> getUser();
    List<User> addUserAge();

}
