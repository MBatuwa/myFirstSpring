package com.niit.soft;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AnnotationIoCBean {
    @Resource
    Date now;
    @Resource(name = "sdf")
    SimpleDateFormat sdf;
    User user1;
    @Autowired
    User user2;
    @Autowired
    User user3;

    @Resource
    public void setUser1(User user){
        this.user1=user;
    }

    @PostConstruct
    public void init(){
        System.out.println("AnnotationIoCBean被实例化");
    }
    public void execute(){
        System.out.println("现在时间为："+sdf.format(now));
        System.out.println("第一个用户："+user1.getId());
        System.out.println("第二个用户："+user2.getId());
        System.out.println("第三个用户："+user3.getId());
    }
    @PreDestroy
    public void destory(){
        System.out.println("AnnotationIoCBean被销毁");
    }
}
