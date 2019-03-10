package com.niit.sum;

import java.util.List;

public class Group {
    private String theme;
    private List<Student> stu;

    public Group() {
    }

    public Group(String theme, List<Student> stu) {
        this.theme = theme;
        this.stu = stu;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public List<Student> getStu() {
        return stu;
    }

    public void setStu(List<Student> stu) {
        this.stu = stu;
    }

    @Override
    public String toString() {
        return "Group{" +
                "theme='" + theme + '\'' +
                ", stu=" + stu +
                '}';
    }
}
