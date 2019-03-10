package com.niit.soft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;
import java.util.Random;

public class User {
    private Integer id;
    private String name;
    private String password;
    //使用@Autowired注解加@Qualifier注解实现按Bean实例名称装配
   @Qualifier("random")
   @Autowired
    private Random rnd;

    public User() {
    }

    //使用@PostConstruct注解指定初始化时调用的方法
    @PostConstruct
    public void initUser() {
        this.id = rnd.nextInt(1000);//产生一个1000以内的随机ID
        this.name ="用户"+this.id;
        this.password = "123456";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Random getRnd() {
        return rnd;
    }

    public void setRnd(Random rnd) {
        this.rnd = rnd;
    }
}
