package com.lab8;

public class Cube implements GeometricBody {
    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getSurface() {
        return side * side * 6;
    }

    @Override
    public double getVolume() {
        return side * side * side;
    }
}
