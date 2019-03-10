package com.niit.factory;

import com.niit.soft.Boss;
import com.niit.soft.Car;

public class MyBeanFactory {

    public static Car creatCar(){
        return new Car();
    }
    public static Boss creatBoss(){
        return new Boss();
    }

}
