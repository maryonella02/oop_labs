package com.lab8;

public class Parallelepiped implements GeometricBody {
    private final double length;
    private final double width;
    private final double height;

    public Parallelepiped(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    @Override
    public double getSurface() {
        return 2 * (length * width + length * height + width * height);
    }

    @Override
    public double getVolume() {
        return length * width * height;
    }
}
