package com.lab2;

public class Main {

    public static void main(String[] args) {
	  Box box1 = new Box();
	  Box box2 = new Box(12);
	  Box box3 = new Box(10, 7 , 25);

	  System.out.println("Default box area and volume");
	  System.out.println(box1.getSurfaceArea() + " " + box1.getVolume());
	  System.out.println("Same value box area and volume");
	  System.out.println(box2.getSurfaceArea() + " " + box2.getVolume());
	  System.out.println("Different values box area and volume");
	  System.out.println(box3.getSurfaceArea() + " " + box3.getVolume());


    }
}
