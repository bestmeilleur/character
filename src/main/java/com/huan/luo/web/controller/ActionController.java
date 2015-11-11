package com.huan.luo.web.controller;

import com.huan.luo.data.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luohuan on 15/11/9.
 */
@RestController
@RequestMapping("/action")
public class ActionController {

    @RequestMapping("/do")
    public String view() {
        return "action done";
    }


}
