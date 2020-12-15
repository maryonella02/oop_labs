package com.lab7;

public class Triangle extends Figure {

    double sideA;
    double sideB;
    double sideC;

    Triangle(double a, double b, double c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    @Override
    double getArea() {
        double semiPerimeter = getPerimeter() / 2.0d;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
    }

    @Override
    double getPerimeter() {
        return sideA + sideB + sideC;
    }
}
