package com.niit.soft;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Boss {
    private String name;
    private List<String> hobby;
    private Map<String,String> jobs=new HashMap<>();
    private Car car;

    public Boss() {
    }

    public Boss(String name, Car car, List<String> hobby,Map<String, String> jobs) {
        this.name = name;
        this.car = car;
        this.hobby = hobby;
        this.jobs = jobs;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public void setJobs(Map<String, String> jobs) {
        this.jobs = jobs;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                ", hobby=" + hobby +
                ", jobs=" + jobs +
                ", car=" + car +
                '}';
    }
}
