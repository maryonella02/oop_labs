package com.lab5;

public class C extends B {
    protected String c;

    public C () {}
    public C (String state) {
        this.c = state;
    }

    @Override
    protected void printState() {
        System.out.println(c);
    }
}
