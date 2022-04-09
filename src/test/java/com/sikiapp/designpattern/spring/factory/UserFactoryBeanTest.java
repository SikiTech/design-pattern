package com.sikiapp.designpattern.spring.factory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserFactoryBeanTest {

    @Autowired
    private BeanFactory beanFactory;

    @Test
    public void getObject() {
        // 输出的是com.sikiapp.designpattern.spring.factory.User
        Object user = beanFactory.getBean("user");
        Object userFactory = beanFactory.getBean("&user");
        String name = user.getClass().getName();
        System.out.println(name);

        String userF = userFactory.getClass().getName();
        System.out.println(userF);

    }
}