package com.huan.luo.web.controller;

import com.huan.luo.data.User;
import com.huan.luo.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luohuan on 15/11/9.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/{id}")
    public User view(@PathVariable("id") Long id) {
        return userService.getUser(id);
    }

    @RequestMapping("/insert")
    public int insert(@RequestParam(name = "name", required = true, defaultValue = "") String name) {
        return userService.insertUser(name);
    }
}
