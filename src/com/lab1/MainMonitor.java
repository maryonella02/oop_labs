package com.lab1;

public class MainMonitor {

    public static void main(String[] args) {
	    Monitor samsung = new Monitor("red", 55, "1920x2000");
        samsung.setColor("blue");
        System.out.println(samsung);
        Monitor lg = new Monitor("black", 30, "2444x2500");
        System.out.println("Are monitors equal?");
        System.out.println(samsung.equals(lg));

    }
}
