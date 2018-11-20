package com.luster.mybatis.controller;

import com.luster.mybatis.pojo.User;
import com.luster.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/add",method =RequestMethod.POST )
    public int addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @ResponseBody
    @RequestMapping(value = "/all/{pageNum}/{pageSize}")
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize) {

        return userService.findAllUser(pageNum, pageSize);
    }
}
