package com.lab5;

public class B extends A {
    protected String b;

    public B() {}

    public B(String state) {
        super();
        this.b = state;
    }

    @Override
    protected void printState() {
        System.out.println(b);
    }
}