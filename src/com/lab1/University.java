package com.lab1;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Student> studentList;
    private int foundationYear;

    public University(String name, List<Student> students, int foundationYear){
        this.name = name;
        this.studentList = students;
        this.foundationYear = foundationYear;
    }

    public University(String name, int foundationYear){
        this.name = name;
        this.studentList = new ArrayList<>();
        this.foundationYear = foundationYear;
    }


    public boolean addStudent(Student student){
        return this.studentList.add(student);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getStudentList() {
        return studentList;
    }

    public void setStudentList(List studentList) {
        this.studentList = studentList;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    public int calculateAverageMark(){
        int sum = 0;
        for(Student student: this.studentList){
            sum += student.getMark();
        }
        return sum / this.studentList.size();
    }
}
