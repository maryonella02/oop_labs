package com.lab2;

public class Box {
    private int height;
    private int width;
    private int depth;

    public Box(){
        this.height = 1;
        this.width = 1;
        this.depth = 1;
    }

    public Box(int value){
        this.height = value;
        this.width = value;
        this.depth = value;
    }

    public Box(int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public int getSurfaceArea(){
        return 2* (depth*height + depth*width + width*height);
    }

    public int getVolume(){
        return  width * depth * height;
    }
}
