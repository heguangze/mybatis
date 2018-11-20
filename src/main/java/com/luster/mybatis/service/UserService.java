package com.luster.mybatis.service;

import com.luster.mybatis.pojo.User;

import java.util.List;

public interface UserService {
    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
