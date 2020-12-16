package com.lab8;

public class Sphere implements GeometricBody {

    private double radius;

    public Sphere(double r) {
        radius = r;
    }

    @Override
    public double getSurface() {
        return 4 * radius * radius * Math.PI;
    }

    @Override
    public double getVolume() {
        return (4 * radius * radius * radius * Math.PI) / 3;
    }
}
