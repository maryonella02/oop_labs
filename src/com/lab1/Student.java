package com.lab1;

public class Student {
    private int age;
    private String name;
    private int mark;

    public Student(int age, String name, int mark){
        this.age = age;
        this.name = name;
        this.mark = mark;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
