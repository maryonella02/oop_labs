package com.lab5;

public class A {
    protected String a;
    protected X x = new X("xxx from a");
    public A () {}
    public A (String state, X x) {
        this.a = state;
        this.x = x;
    }
    protected void printState() {
        System.out.println(a);
    }
    protected X getAX () { return x;}
}