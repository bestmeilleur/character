package com.huan.luo.web.dao;

import com.huan.luo.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * Created by luohuan on 15/11/11.
 */
@Repository
public class UserDao extends JdbcDaoSupport {

    @Autowired
    public UserDao(DataSource dataSource) {
        this.setDataSource(dataSource);
    }

    public int insertUser(String name) {
        JdbcTemplate jdbcTemplate = this.getJdbcTemplate();
        return jdbcTemplate.update("insert into user (name) values (" + name + ")");
    }

    public User getUser(long id) {

        User user = new User();
        user.setId(id);
        user.setName("huan1");
        return user;
    }

}
