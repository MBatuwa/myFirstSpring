package com.niit.sum;

import java.util.List;

public class Student {
    private String name;
    private String gender;
    private Phone phone;
    private List<String> hobby;

    public Student() {
    }

    public Student(String name, String gender, Phone phone, List<String> hobby) {
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", phone=" + phone +
                ", hobby=" + hobby +
                '}';
    }
}
