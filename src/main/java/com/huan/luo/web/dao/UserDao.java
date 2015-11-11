package com.huan.luo.web.dao;

import com.huan.luo.data.User;
import org.springframework.stereotype.Repository;

/**
 * Created by luohuan on 15/11/11.
 */
@Repository
public class UserDao {

    public UserDao() {

    }

    public User getUser(long id) {
        User user = new User();
        user.setId(id);
        user.setName("huan1");
        return user;
    }

}
