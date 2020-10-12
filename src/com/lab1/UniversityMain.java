package com.lab1;

import java.util.ArrayList;
import java.util.List;

public class UniversityMain {

    public static void main(String[] args) {
        University utm = new University("UTM", 1990);
        University usm = new University("USM", 2000);
        University usmf = new University("USMF", 1903);

        utm.setFoundationYear(1985);

        List<Student> utmStudents = new ArrayList<>();
        utmStudents.add(new Student(20, "Vasile", 8));
        utmStudents.add(new Student(23, "Mihai", 10));
        utmStudents.add(new Student(18, "Marinela", 10));
        utm.setStudentList(utmStudents);


        List<Student> usmStudents = new ArrayList<>();
        usmStudents.add(new Student(20, "Jora", 4));
        usmStudents.add(new Student(23, "Petrika", 5));
        usmStudents.add(new Student(18, "Ion", 2));
        usm.setStudentList(usmStudents);


        List<Student> usmfStudents = new ArrayList<>();
        usmfStudents.add(new Student(20, "Mihai", 8));
        usmfStudents.add(new Student(23, "Pavel", 8));
        usmfStudents.add(new Student(18, "Marcela", 7));
        usmf.setStudentList(usmfStudents);

        List<University> universityList = new ArrayList<>();
        universityList.add(utm);
        universityList.add(usm);
        universityList.add(usmf);

        int sum = 0;
        for (University university: universityList){
            System.out.println("For university " + university.getName());
            int average = university.calculateAverageMark();
            System.out.println("average mark is " + average);
            sum += average;
        }

        System.out.println("Average mark for all universities " + sum / universityList.size());
    }
}
