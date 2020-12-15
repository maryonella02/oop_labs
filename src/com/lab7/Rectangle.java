package com.lab7;

public class Rectangle extends Figure {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return this.length * this.width;
    }

    @Override
    double getPerimeter() {
        return 2 * (this.length + this.width);
    }
}
