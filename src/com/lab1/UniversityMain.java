package com.lab1;

import java.util.ArrayList;
import java.util.List;

public class UniversityMain {

    public static void main(String[] args) {
        University utm = new University("utm", 1990);
        University usm = new University("usm", 2000);
        University usmf = new University("usmf", 1903);

        utm.setFoundationYear(1985);

        List<Student> utmStudents = new ArrayList<>();
        utmStudents.add(new Student(20, "Vasile", 8));
        utmStudents.add(new Student(23, "Mihai", 10));
        utmStudents.add(new Student(18, "Marinela", 10));
        utm.setStudentList(utmStudents);


        List<Student> usmStudents = new ArrayList<>();
        usmStudents.add(new Student(20, "Jora", 4));
        usmStudents.add(new Student(23, "Petrika", 5));
        usmStudents.add(new Student(18, "Johy davis", 2));
        usm.setStudentList(usmStudents);


        List<Student> usmfStudents = new ArrayList<>();
        usmfStudents.add(new Student(20, "Rafa", 8));
        usmfStudents.add(new Student(23, "Pafa", 8));
        usmfStudents.add(new Student(18, "Marcelo", 7));
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

        System.out.println("Average between universityies " + sum / universityList.size());
    }
}
