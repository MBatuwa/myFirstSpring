package com.niit.cycle;

import org.springframework.beans.factory.BeanNameAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student implements BeanNameAware {
    private String name;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void initStudent(){
        System.out.println("Student这个Bean：被初始化了");
    }
    @PreDestroy
    public void destoryStudent(){
        System.out.println("Student这个Bean：被销毁");
    }

    public void executeStudent(){
        System.out.println("Student这个Bean：在使用");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("调用BeanNameAware的setBeanName()*****");
    }
}
