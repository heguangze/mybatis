package com.luster.mybatis;

import com.luster.mybatis.pojo.User;
import com.luster.mybatis.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MybatisApplication.class)
public class MybatisApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void findAllUser() {
        List<User> users=userService.findAllUser(1,10);
    }

}
