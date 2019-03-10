package com.niit.sum;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class sumTest {
    public static void main(String[] args){
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans02.xml");
        Group g=(Group) ac.getBean("group");
        System.out.println(g);
    }
}
