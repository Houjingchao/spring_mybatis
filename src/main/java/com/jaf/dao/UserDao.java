package com.jaf.dao;

import com.jaf.entity.User;

import java.util.List;

/**
 * Created by jaf on 16/8/15.
 */
public interface UserDao {
    public int insert(User user);
    public int update(User user);
    public int delete(String userName);
    public List<User> selectAll();
    public int countAll();
    public User findByUserName(String userName);
}