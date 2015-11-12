package com.huan.luo.web.service;

import com.huan.luo.data.User;
import com.huan.luo.web.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by luohuan on 15/11/11.
 */
@Service
public class UserService {

    private UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public User getUser(long id) {
        return userDao.getUser(id);
    }

    public int insertUser(String name) {
        return userDao.insertUser(name);
    }
}
