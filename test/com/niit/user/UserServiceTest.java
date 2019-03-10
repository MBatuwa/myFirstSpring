package com.niit.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/beans01.xml"})
public class UserServiceTest{
    @Autowired
    private UserService userService;

    @Test
    public void userLogin() throws Exception{
        System.out.println(userService.getUser());
    assertEquals(userService.userLogin(userService.getUser()),true);

    }
}