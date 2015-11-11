package com.huan.luo.web.service;

import com.huan.luo.data.User;
import org.springframework.stereotype.Service;

/**
 * Created by luohuan on 15/11/11.
 */
@Service
public class UserService {

    public UserService() {

    }

    public User getUser(long id) {
        User user = new User();
        user.setId(id);
        user.setName("huan");
        return user;
    }
}
