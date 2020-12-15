package com.lab6;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;

public class Patient extends Person {


    public ArrayList<String> prescriptions = new ArrayList<>();
    public ArrayList<String> allergies = new ArrayList<>();
    public ArrayList<String> specialReqs = new ArrayList<>();
    protected Date accepted;
    protected String ID, sickness;
    protected long age;

    public long getAge() {
        return age;
    }

    public void setAge(String birthDate) {
        LocalDate birthdate = LocalDate.parse(birthDate);
        LocalDate now = LocalDate.now();
        this.age = ChronoUnit.YEARS.between(birthdate, now);

    }
}