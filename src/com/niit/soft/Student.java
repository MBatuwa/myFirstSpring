package com.niit.soft;

public class Student {
    private String name;
    private String age;
    private Phone phone;
    public Student() {
    }

    public Student(String name, String age, Phone phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", phone=" + phone +
                '}';
    }
}
