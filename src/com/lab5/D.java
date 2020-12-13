package com.lab5;

public class D extends C {
    protected String d;

    protected X x = new X("xxx from d");
    public D () {}
    public D (String state) {

        this.d = state;
    }

    @Override
    protected void printState() {
        System.out.println(d);
    }

    public X getDX() {
        return x;
    }
}

