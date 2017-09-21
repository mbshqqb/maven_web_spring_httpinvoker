package com.zj.server;

import com.zj.bean.User;
import com.zj.server.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:server-context.xml");
        UserService service = (UserService)ac.getBean("userServiceImpl");
        User u = service.getUserbyName("Alvis");
        System.out.println(u);
    }
}