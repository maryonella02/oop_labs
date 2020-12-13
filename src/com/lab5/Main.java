package com.lab5;


public class Main {
    public static void main(String[] args) {

        X x = new X("xxx");
        A a = new A("aaa", x);
        B b = new B("bbb");
        C c = new C("ccc");
        D d = new D("ddd");
        E e = new E("eee");
        F f = new F("fff");
        G g = new G("ggg");
        H h = new H("hhh");
        I i = new I("iii");
        J j = new J("jjj");

        A[] objArray = {a, b, c, d, e, f, g, h, i, j};
        for (A value : objArray) {
            value.printState();
        }


        //we can access x from A, where instance is created
        a.x.printState();

        //without this getter method we can't access x state from H class
        h.getHX().printState();

        //also due to inheritance, classes that extends A (all without X) can access methods from A
        j.getAX().printState();
        b.getAX().printState();

        //and also from methods they inherits like H or D
        j.getHX().printState();
        j.getDX().printState();



    }
}